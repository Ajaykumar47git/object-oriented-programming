package com.java.oop;

public class Payment {
    int paymentid;
    String paymetmode;
    String paymentDate;
    String paymentMethod;
    boolean paymentstatus;



    //constructer
    Payment(){
        paymentid = 81;
        paymetmode= "cash";
        paymentDate= "10-01-2005";
        paymentMethod= "UPI";
        paymentstatus =true ;
    }


    Payment(int Cid,String name,String address,int pincode,float discountpercentage,boolean isOnline,long phnNumber) {
        this.paymentid = paymentid;
        this.paymetmode = paymetmode;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.paymentstatus = paymentstatus;


    }
}


