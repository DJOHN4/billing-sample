package com.cg.service.billing.data;

import java.util.ArrayList;
import java.util.List;

public class PurchasedItem {
    String itemName;
    int quantity;
    double totalPrice;
    double serviceCharge;

    public int getQuantity(){
        return this.quantity;
    }
    public String getItemName(){
        return this.itemName;
    }
    public double getTotalPrice(){
        return this.totalPrice;
    }
    public double getTotalServiceCharge(){
        return this.serviceCharge;
    }
    public void setTotalPrice(double value){
         this.totalPrice=value;
    }
    public void setTotalServiceCharge(double value){
        this.serviceCharge=value;
    }
}