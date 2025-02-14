package cursoSpringBoot.controllers;

import cursoSpringBoot.domain.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(001, "Juan", "Perez", "juanp", "1234"),
            new Customer(002, "Maria", "Lopez", "marial", "5678"),
            new Customer(003, "Pedro", "Gomez", "pedrog", "91011")
    ));

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Customer> getCustomers() {
        return customers;
    }

    //@RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @GetMapping("/{userName}")
    public Customer getCustomer(@PathVariable String userName){
        for (Customer elementCustomer: customers) {
            if (elementCustomer.getUserName().equalsIgnoreCase(userName)) { // example: "juanp".equalsIgnoreCase("juanp") o if true si juanp es igual a juanp
                    return elementCustomer;
            }
        }
        return null;
    }

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public Customer postCustomer(@RequestBody Customer customer){
        customers.add(customer);
        return customer;
    }

    @PutMapping
    public Customer putCustomer(@RequestBody Customer customer){
        for (Customer elementCustomer: customers){ // this is a for each, recorre todos los elementos de la lista customers
            if (elementCustomer.getID() == customer.getID()){
                elementCustomer.setName(customer.getName());
                elementCustomer.setLastName(customer.getLastName());
                elementCustomer.setUserName(customer.getUserName());
                elementCustomer.setPassword(customer.getPassword());

                return elementCustomer;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public Customer deleteCustomer(@PathVariable int id){
        for (Customer elementCustomer: customers){ // this is a for each, recorre todos los elementos de la lista customers
            if (elementCustomer.getID() == id){
                customers.remove(elementCustomer);
                return elementCustomer;
            }
        }
        return null;
    }

    @PatchMapping
    public Customer patchCustomer(@RequestBody Customer customer){
        for(Customer elementCustomer: customers){
            if (elementCustomer.getID() == customer.getID()){

                if(elementCustomer.getName() != null){
                    elementCustomer.setName(customer.getName());
                }
                if (elementCustomer.getLastName() != null){
                    elementCustomer.setLastName(customer.getLastName());
                }
                if (elementCustomer.getUserName() != null){
                    elementCustomer.setUserName(customer.getUserName());
                }
                if(elementCustomer.getPassword() != null){
                    elementCustomer.setPassword(customer.getPassword());
                }
                return elementCustomer;
            }
        }
        return null;
    }

}

