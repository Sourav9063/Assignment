package org.example;

public interface IShop {
    String addAdmin(IAdmin admin, int adminId);
    String removeAdmin(IAdmin admin,int adminId);
    String addCustomer(ICustomer customer, int adminId);

    String addCarts(ICart cart, int customerId);
    String removeCustomer(ICustomer customer,int adminId);
    String modifyProduct(Product product,int adminId);
    String addProduct(Product product, int adminId);
    String removeProduct(Product product,int adminId);

    String makeShipments( int adminId);
    String confirmDelivery( int adminId);
}

