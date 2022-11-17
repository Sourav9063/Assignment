package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart implements ICart {

private int id;
private int numberOfProducts;
private List<Product> products;
private float totalPrice;
public Cart(){
    this.id=(int) Math.random()*1000;
    this.numberOfProducts=0;
    this.totalPrice=0;
    this.products=new ArrayList<Product>();
}


    @Override
    public float addProduct(Product product) {
        this.products.add(product);
        this.numberOfProducts++;
        this.totalPrice+=product.getPrice();
        return this.totalPrice;
    }

    @Override
    public float removeProduct(Product product) {
        this.products.remove(product);
        this.numberOfProducts--;
        this.totalPrice-=product.getPrice();

        return this.totalPrice;

    }

    @Override
    public float updateProduct(Product product) {
        this.products.remove(product);
        this.products.add(product);
        this.totalPrice=0;
        for (Product p:products) {
            this.totalPrice+=p.getPrice();
        }

        return this.totalPrice;
    }

    @Override
    public float checkout() {
    float total=0.0f;
        for (Product p:products) {
            total+=p.getPrice();
        }

        return total;

    }

    public int getId() {
        return id;
    }


    public int getNumberOfProducts() {
        return numberOfProducts;
    }


    public List<Product> getProducts() {
        return products;
    }


    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
