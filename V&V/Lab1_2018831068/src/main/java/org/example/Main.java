package org.example;

public class Main {
    public static void main(String[] args) {

        Shop shop =  Shop.getInstance();
//        shop.addAdmin(new Admin("Sourav"));
//        shop.addAdmin(new Admin("Sourav2"));
        Customer newCus= new Customer("Sourav2");
//        shop.addCustomer(newCus);


        System.out.println(shop.getAdmins());

    }
}