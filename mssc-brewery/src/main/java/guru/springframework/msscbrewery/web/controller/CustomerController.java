package guru.springframework.msscbrewery.web.controller;


import guru.springframework.msscbrewery.services.CustomerService;
import guru.springframework.msscbrewery.web.model.Customer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    //@GetMapping({"/{beerId}"})
    @GetMapping({"/{custId}"})
    public ResponseEntity<Customer> getCustomerById(@PathVariable("custId")UUID custId){

        return new ResponseEntity<>(customerService.getCutomerById(custId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody Customer customer){
        Customer savedCustomer = customerService.saveNewCustomer(customer);

        HttpHeaders header = new HttpHeaders();
        header.add("Location","/api/v1/customer/"+savedCustomer.getId().toString());

        return new ResponseEntity(header,HttpStatus.CREATED);
    }

    @PutMapping({"/{custId}"})
    public ResponseEntity handleUpdate(@PathVariable("custId")UUID custId,@RequestBody Customer customer){
        customerService.UpdateCustomer(custId,customer);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{custId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("custId")UUID custId){
        customerService.deletById(custId);
    }
}
