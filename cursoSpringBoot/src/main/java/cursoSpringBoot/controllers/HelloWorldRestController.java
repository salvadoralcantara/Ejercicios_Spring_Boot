package cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping({"/hello, /hola, /hw"})
    public String helloWorld() {
        System.out.println("Petición recibida");
        return "Hello World";
    }

}
