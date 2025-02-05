package cursoSpringBoot.controllers;

import cursoSpringBoot.domain.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {
    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(001, "Juan", "Perez", "juanp", "1234"),
            new Customer(002, "Maria", "Lopez", "marial", "5678"),
            new Customer(003, "Pedro", "Gomez", "pedrog", "91011")
    ));

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customers;
    }

    @GetMapping("/customer/{userName}")
    public Customer getCustomer(@PathVariable String userName){
        for (Customer elementCustomer: customers) {
            if (elementCustomer.getUserName().equalsIgnoreCase(userName)) {
                {
                    return elementCustomer;
                }
            }
        }
        return null;
    }

    @PostMapping("/customers")
    public Customer postCustomer(@RequestBody Customer customer){
        customers.add(customer);
        return customer;
    }

}

