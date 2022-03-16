package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Cust;
import guru.springframework.msscbrewery.web.model.Customer;

public interface CustMapper {
    Customer CustoCustomer(Cust cust);
    Cust CustomerToCust(Customer customer);
}
