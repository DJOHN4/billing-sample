package com.cg.service.billing.data;

import java.util.HashMap;
import java.util.Map;

public class MenuItem {

    private String itemName;
    private String itemType;
    private boolean isCold;
    private double price;

    public double getPrice() {
        return this.price;
    }

    public boolean getIsCold() {
        return this.isCold;
    }

    public String getType() {
        return this.itemType;
    }
    public String getItemName() {
        return this.itemName;
    }

    public MenuItem(String name, String type, boolean cold, double rate) {
        this.itemName=name;
        this.itemType = type;
        this.isCold = cold;
        this.price = rate;
    }

   /* public double getServiceCharge(int quantity, double srvcCharge) {
        double serviceCharge = 0.0;
        if (this.itemType != "DRINK") {
            serviceCharge = (this.price * quantity) * srvcCharge;
        }
        return serviceCharge;
    }*/
}
