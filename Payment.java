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


    Payment (int id,String mode,String Date,String Method ,boolean Status) {
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
        boolean statusOfTheOrder(){
            System.out.println("order Status"+Status);
        return Status;
        }

        void PaymentmethodDetails(){
            System.out.println("paymentmode "+Method);

        }

   // Design a method to verify that the payment amount matches the order amount.
        boolean verifyPaymenytStatus (){
            System.out.println("Paymenyt Status"+Status);
            return Status;
    }
    //Design a method that processes payment based on payment mode (UPI, CARD, NET BANKING).
        String   processPaymentOnPaymentMode (){
           System.out.println(" process Payment On PaymentMode " + mode);
            return mode;
        }

}



