package SistemaDeGestionAlumnos;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Se agrega @ComponentScan porque los paquetes controllers y domain están fuera del paquete
// principal SistemaDeGestionAlumnos. Spring Boot solo escanea automáticamente los subpaquetes
// de la clase principal de la aplicación. En este caso, la clase principal es SistemaDeGestionAlumnosApplication
// y los paquetes controllers y domain están fuera del paquete principal. Por lo tanto, se debe agregar @ComponentScan
@ComponentScan(basePackages = {"controllers", "domain"})

@ComponentScan(basePackages = {"controllers", "domain"})
@SpringBootApplication
public class SistemaDeGestionAlumnosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeGestionAlumnosApplication.class, args);
	}

}
