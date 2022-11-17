package org.example;

public interface ICart {
    float addProduct(Product product);
    float removeProduct(Product product);
    float updateProduct(Product product);
    float checkout();
}
