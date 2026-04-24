package com.java.oop;

public class Product {
// state
// id,name,MRP,discountdiscount percentage ,rating , stock ,manufacturing date
    int id;
    String name ;
    float discountPercentage;
    int maxRetailPrice;
    String address;
    boolean stock;


    //constructer
    Product(){
        System.out.println("Product() is called ");
        id =1;
        name = "Lenovo";
        discountPercentage =4.5F;
        maxRetailPrice = 120000;
        address = "Hyderabad";
        stock = true;
    }
Product(int id ,String name,float discountPercentage,int maxRetailPrice,String address,boolean stock){
        this.id =id ;
        this.name = name;
        this.discountPercentage =discountPercentage;
        this.maxRetailPrice =maxRetailPrice;
        this.address =address;
        this.stock=stock;



    }

    //method
    void displayProductDetalis(){
        System.out.println("Product id : "+ id);
        System.out.println("Product name : " +name);
        System.out.println("Product Discount Percentage : "+discountPercentage);
        System.out.println("MRP  : " +maxRetailPrice);
        System.out.println("Producet location : "+address);
        System.out.println("Product stock : "+stock);
}


//display product details with out return type
    void displayProductsByCompony (String companyName){
        System.out.println("products by company name"+ companyName );
    }



    //without arguments but with return type
    //total count of products
    int getTotalProducts (){
        return 10;
    }
}
