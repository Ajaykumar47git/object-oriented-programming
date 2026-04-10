package com.java.oop;

public class Customer {
    //state
    //
    int id;
    String name;
    String address;
    int pincode;
    float discountpercentage;
    boolean isOnline;
    long phnNumber;

    //constructer
    Customer(){
        id = 8;
        name= "Ajay";
        address= "kukatpally";
        pincode= 502032;
        discountpercentage =10F ;
        isOnline=true;
        phnNumber =9441993721L;
    }
Customer(int Cid,String name,String address,int pincode,float discountpercentage,boolean isOnline,long phnNumber) {
    /*this.id = id;
    this.name = name;
    this.address = address;
    this.pincode = pincode;
    this.discountpercentage = discountpercentage;
    this.isOnline = isOnline;
    this.phnNumber= phnNumber;*/

}
    // method decleration
    void displayCustomerDetails ()
    {
        System.out.println("printing customer Details");
        System.out.println("Customer id :" + id);
        System.out.println("Customer name :" + name);
        System.out.println("Customer address " + address);
        System.out.println("Customer pincode" + pincode);
        System.out.println("discount percentage" + discountpercentage);
        System.out.println("Customer Status " + isOnline);
        System.out.println("Customer phnNumber"+phnNumber);

    }
    //Design a method that allows updating the customer’s address.
    void updatingCustomerAddress(String address){
        System.out.println("customer address"+address);
    }

    //Design a method to check whether the customer account is active.
    boolean checkCustomerAccountStatus (boolean isOnline){
        System.out.println("customer Status"+isOnline);
    return isOnline;
    }

     boolean makeCustomerAccountInActive (boolean isOnline){
        System.out.println("making customer in active :"+isOnline);
       return isOnline;
    }
    //Design a method to validate whether the customer’s contact number is valid
    long checkCustomerNumber (long phnNumber){
        System.out.println("checcking Customer details " +phnNumber);
        return phnNumber;

    }
}