package com.java.oop;

public class Customer {
    //state
    int id;
    String name;
    String address;
    int pincode;
    float discountpercentage;
    boolean isOnline;

    //constructer
    Customer(){
        id = 8;
        name= "Ajay";
        address= "kukatpally";
        pincode= 502032;
        discountpercentage =10F ;
        isOnline=true;
    }
Customer(int Cid,String name,String address,int pincode,float discountpercentage,boolean isOnline){
        this.id = id;
        this.name =name;
        this.address=address;
        this.pincode =pincode;
        this.discountpercentage=discountpercentage;
        this.isOnline=isOnline;


    // method decleration
/*void displayCustomerDetails   (){
        System.out.println("Customer id :" +id);
        System.out.println("Customer name :"+name);
        System.out.println("Customer address " +address);
        System.out.println("Customer pincode"+ pincode);
        System.out.println("discount percentage"+ discountpercentage);
        System.out.println("Customer Status "+ isOnline);
  */
}


}