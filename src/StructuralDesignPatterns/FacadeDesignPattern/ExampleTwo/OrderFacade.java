package StructuralDesignPatterns.FacadeDesignPattern.ExampleTwo;

import StructuralDesignPatterns.BridgeDesignPattern.Produce;

public class OrderFacade {
    ProductDAO productDAO;
    Invoice invoice;
    Payment payment;
    SendNotification sendNotification;

    public OrderFacade(){
        productDAO = new ProductDAO();
        invoice = new Invoice();
        payment = new Payment();
        sendNotification = new SendNotification();
    }

    public void createOrder(){
        Product productOne = productDAO.getProduct(123);
        payment.makePayment();
        invoice.generateInvoice();
        sendNotification.sendNotification();
    }

}
