package cursoSpringBoot.controllers;

import cursoSpringBoot.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
