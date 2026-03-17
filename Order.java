package com.java.oop;

public class Order {

    //state
    //id,MRP,deliveryDate,paymentMethod,address,orderDeliveryStatus,final amount
    int id;
    int maxRetailPeice;
    String deliveryDate;
    String paymentMethod;
    String address;
    boolean orderDeliveryStatus;
    int finalAmount;


    //constructor
    Order() {
        id = 001;
        maxRetailPeice = 120000;
        deliveryDate = "10/01/26";
        paymentMethod = "Cash On Delivery";
        address = "beeramguda,10-15,ameenpur,sangareddy";
        orderDeliveryStatus = true;
        finalAmount= 10000;
    }

    Order (int id, int maxRetailPeice, String deliveryDate, String paymentMethod, String address, boolean orderDeliveryStatus,int finalAmount ) {
        this.id = id;
        this.maxRetailPeice = maxRetailPeice;
        this.deliveryDate = deliveryDate;
        this.paymentMethod = paymentMethod;
        this.address = address;
        this.orderDeliveryStatus = orderDeliveryStatus;
        this.finalAmount = finalAmount;

    }

        //Design a method that calculates the final payable amount for an order.

        int  calculateTheFinalPayableAmount(int finalAmount ){
            System.out.println("Total Payable Amount "+finalAmount );;
        return (10000);
        }

        void updateOrderStatus (String "PLACED, SHIPPED, DELIVERED, CANCELLED"){
            System.out.println("");

        }


                }

