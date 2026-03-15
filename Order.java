package com.java.oop;

public class Order {

    //state
    //id,MRP,deliveryDate,paymentMethod,address,orderDeliveryStatus
    int id;
    int maxRetailPeice;
    String deliveryDate;
    String paymentMethod;
    String address;
    boolean orderDeliveryStatus;


    //constructor
    Order()

    {
        id = 001;
        maxRetailPeice = 120000;
        deliveryDate = "10/01/26";
        paymentMethod = "Cash On Delivery";
        address = "beeramguda,10-15,ameenpur,sangareddy";
        orderDeliveryStatus = true;
    }

    Order (int id, int maxRetailPeice, String deliveryDate, String paymentMethod, String address, boolean orderDeliveryStatus) {
        this.id = id;
        this.maxRetailPeice = maxRetailPeice;
        this.deliveryDate = deliveryDate;
        this.paymentMethod = paymentMethod;
        this.address = address;
        this.orderDeliveryStatus = orderDeliveryStatus;


}}
