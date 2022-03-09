package guru.springframework.msscbrewery.services;



import guru.springframework.msscbrewery.web.model.Customer;

import java.util.UUID;

public interface CustomerService {
    public Customer getCutomerById(UUID id);

    Customer saveNewCustomer(Customer customer);

    void UpdateCustomer(UUID custId, Customer customer);

    void deletById(UUID custId);
}
