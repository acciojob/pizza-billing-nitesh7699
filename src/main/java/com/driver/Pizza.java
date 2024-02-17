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
            this.bill += "Veg pizza base price = "+this.price +"\n";
        }
        else{
            this.price = 400;
            this.bill += "Non-veg pizza base price = "+this.price +"\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.price  = this.price + 80;
        this.bill += "Extra Cheese Price = "+this.price +"\n";
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg = true){
            this.price = this.price + 70; 
            this.bill += "Extra Toppings For Veg Pizza = "+this.price +"\n";
        }
        else{
            this.price = this.price + 120;
            this.bill += "Extra Toppings For Non-veg Pizza = "+this.price +"\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.price = this.price + 20; 
        this.bill += "Paper bag Price = "+this.price;
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
