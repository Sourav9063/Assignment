package org.example;

import java.util.List;

public interface ICustomer {

    float buyProduct();
    float addProduct(Product product);
    float removeProduct(Product product);
    List<Product> viewProducts();
    float makePayment( IPayment payment);
}
