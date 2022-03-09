package guru.springframework.msscbrewery.services;


import guru.springframework.msscbrewery.web.model.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCutomerById(UUID id) {
        return Customer.builder()
                        .id(UUID.randomUUID())
                        .name("Mickey")
                        .build();
    }

    @Override
    public Customer saveNewCustomer(Customer customer) {
        return Customer.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void UpdateCustomer(UUID custId, Customer customer) {
        //To Impl for Updating Customer
    }

    @Override
    public void deletById(UUID custId) {
        //To Do Impl for deleting the customer
    }
}
