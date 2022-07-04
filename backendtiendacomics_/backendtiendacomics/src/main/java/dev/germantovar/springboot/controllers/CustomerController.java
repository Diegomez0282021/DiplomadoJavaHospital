package dev.germantovar.springboot.controllers;
import dev.germantovar.springboot.entities.Customer;
import dev.germantovar.springboot.repository.CustomerRepository;
import dev.germantovar.springboot.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
public class CustomerController {

    @Autowired
    private ICustomerService service;

    @Autowired
    CustomerRepository customerRepository;

    // metodo listar datos
    @GetMapping("listausers")
    public List<Customer> getAll() {
        return service.getAll();
    }

    // controlador para borrar de la base de datos
     @DeleteMapping("listausers/{id}")
    public void remove(@PathVariable String id){
         service.remove(Long.parseLong(id));
     }

@PostMapping("listausers")
    public void save(@RequestBody Customer customer){
    service.save(customer);
    }

}
