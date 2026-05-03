package com.java.oop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //product object
        Product product ;
        //product=new Product(1,"Lenova",4.5F,120000,"hyderabad",true);


        //initialize details
        product.id =1;
        product.name = "Lenovo";
        product.discountPercentage =4.5F;
        product.maxRetailPrice = 120000;
        product.address = "Hyderabad";
        product.stock = true;


        /*System.out.println("Product id : "+product.id);
        System.out.println("Product name : " +product.name);
        System.out.println("Product Discount Percentage : "+product.discountPercentage);
        System.out.println("MRP  : " +product.maxRetailPrice);
        System.out.println("Producet location : "+product.address);
        System.out.println("Product stock : "+product.stock);
        System.out.println( "  ");*/
        product.displayProductDetalis();

        Product product2 ;
        product2 =new Product(2,"dell",5.7F,150000,"Beeramguda",false);

        //initialize details 2
        /*product2.id =2;
        product2.name = "Hp";
        product2.discountPercentage =6.7F;
        product2.maxRetailPrice = 150000;
        product2.address = "Beeramguda";
        product2.stock = false;*/

       /* System.out.println("Product id : "+product2.id);
        System.out.println("Product name : " +product2.name);
        System.out.println("Product Discount Percentage : "+product2.discountPercentage);
        System.out.println("MRP  : " +product2.maxRetailPrice);
        System.out.println("Producet location : "+product2.address);
        System.out.println("Product stock : "+product2.stock);
        System.out.println(" ");*/
       // product2.displayProductDetalis();


        Payment  payment1;
        payment1 =new Payment(81,"cash ","10-01-2005","UPI",true);
        payment1.displaypaymentdetails();
        payment1.statusOfTheOrder();
        payment1.processPaymentOnPaymentMode();
        product2.displayProductDetalis();
        System.out.println(" ----" );
        product.displayProductsByCompony("dell");
        int productCount = product.getTotalProducts();
        System.out.println("product count "+productCount);


        //  System.out.println("payment Status"+payment1.verifyPaymenytStatus());


        {
            //order object
            Order order;
            order = new Order(001, 130000, "10/01/26", "Cash On Delivery", "beeramguda,10-15,ameenpur,sangareddy", true, 100000, "PLACED, SHIPPED, DELIVERED, CANCELLED");
            //Orders details
            order.calculateTheFinalPayableAmount(10000);
            order.updateOrderStatus("PLACED, SHIPPED, DELIVERED, CANCELLED");
            order.calculateTheFinalPayableAmount(100000);

        /*
        id = 001;
        maxRetailPeice = 120000;
        deliveryDate = "10/01/26";
        paymentMethod = "Cash On Delivery";
        address = "beeramguda,10-15,ameenpur,sangareddy";
        orderDeliveryStatus = true;*/

            // initialize OrderDetail
            System.out.println("showing Order details ");
            System.out.println("Order id :" + order.id);
            System.out.println("Order MRP :" + order.maxRetailPeice);
            System.out.println("Oredr Delivery Date :" + order.deliveryDate);
            System.out.println("Order payment method :" + order.paymentMethod);
            System.out.println("Order address :" + order.address);
            System.out.println("Order " + order.orderDeliveryStatus);
            System.out.println("Final Amount" + order.finalAmount);
            System.out.println("order status update " + order.updateOrderStatus);


            Customer customer;
            customer = new Customer(8, "Ajay", "Kukatpally", 502032, 10F, true, 9441993721L);

            //methods executing
            customer.displayCustomerDetails();
            customer.updatingCustomerAddress("kukatpally");
            customer.checkCustomerAccountStatus(true);
            customer.makeCustomerAccountInActive(false);
            customer.checkCustomerNumber(9441993721L);
        System.out.println(" ");
        System.out.println("showing customer details ");
        System.out.println("customer id : "+customer.id);
        System.out.println("customer name : "+customer.name);
        System.out.println("customer address : "+customer.address);
        System.out.println("customer pincode : "+customer.pincode);
        System.out.println("customer Discount percentage : "+customer.discountpercentage);
        System.out.println("customer status : "+customer.isOnline);




        }
        //Orders details
        //payment

      // Payment  payment;
       //
        // payment = new Payment(81,"cash","10-01-2005","UPI");


        }
    }