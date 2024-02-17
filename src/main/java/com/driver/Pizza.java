package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded=false;
    private boolean isToppingAdded=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            this.price = 300; 
            this.bill += "Base Price Of The Pizza: "+300 +"\n";
        }
        else{
            this.price = 400;
            this.bill += "Base Price Of The Pizza: "+400 +"\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.isCheeseAdded=true;
        this.price  = this.price + 80;
        if(this.isCheeseAdded==false){
            this.bill += "Extra Cheese Added: "+80 +"\n";
        }
        else{
            // int idx = this.bill.indexOf("Extra Cheese Added: ");
            // String temp = "Extra Cheese Added: ";
            // bill = bill.substring(0,idx) + bill.substring(idx, temp.length()) + 80
            return;
        }
        
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg = true){
            this.isToppingAdded=true;
            this.price = this.price + 70; 
            if(this.isToppingAdded==false){
                this.bill += "Extra Toppings Added: "+120 +"\n";
            }
            else{
                return;
            }
        }
        else{
            this.isToppingAdded=true;
            this.price = this.price + 120;
            if(this.isToppingAdded==false){
                this.bill += "Extra Toppings Added: "+120 +"\n";
            }
            else{
                return;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.price = this.price + 20; 
        this.bill += "Paperbag Added: "+20 +"\n";
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: "+this.price +"\n";
        return this.bill;
    }
}
