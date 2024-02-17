package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            this.price = 300; 
            this.bill += "Veg pizza base price: "+300 +"\n";
        }
        else{
            this.price = 400;
            this.bill += "Non-veg pizza base price: "+400 +"\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.price  = this.price + 80;
        this.bill += "Extra Cheese Price: "+80 +"\n";
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg = true){
            this.price = this.price + 70; 
            this.bill += "Extra Toppings For Veg Pizza: "+70 +"\n";
        }
        else{
            this.price = this.price + 120;
            this.bill += "Extra Toppings For Non-veg Pizza: "+120 +"\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.price = this.price + 20; 
        this.bill += "Paper bag Price: "+20 +"\n";
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: "+this.price +"\n";
        return this.bill;
    }
}
