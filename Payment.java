package com.java.oop;

public class Payment {
    int id;
    String mode;
    String Date;
    String Method;
    boolean Status;



    //constructer
    Payment(){
        id = 81;
        mode= "cash";
        Date= "10-01-2005";
        Method= "UPI";
        Status =true ;
    }


    Payment(int id,String name,String address,int pincode,float discountpercentage,boolean isOnline,long phnNumber) {
        this.id =  id;
        this. mode = mode;
        this. Date =  Date;
        this. Method =  Method;
        this. Status =  Status;

    }
        //methaod decleration
        void displaypaymentdetails (){
            System.out.println();
            System.out.println("Payment Details");
            System.out.println("Customer id :" +  id);
            System.out.println("Customer pincode" +  mode);
            System.out.println("discount percentage" +  Date);
            System.out.println("Customer Status " +  Method);
            System.out.println("Customer phnNumber"+ Status);
        }

}



