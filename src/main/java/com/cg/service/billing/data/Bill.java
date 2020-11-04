package com.cg.service.billing.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bill {

    public int billNo;
    public String orderNo;
    public String tableNumber;
    public List<PurchasedItem> purchasedItemList = new ArrayList<PurchasedItem>();
    public double serviceCharge;
    public double totalPrice;
    public double discount;
    public double grandTotal;

    public Bill(String ordNo, String tabNumb, List<PurchasedItem> purItems,
                double serCharge, double totPrice, double disc, double grTotal) {

        Random rand = new Random();

        this.billNo = Math.abs(rand.nextInt(2001) -1000);
        this.orderNo=ordNo;
        this.tableNumber = tabNumb;
        this.purchasedItemList = purItems;
        this.serviceCharge = serCharge;
        this.totalPrice = totPrice;
        this.discount = disc;
        this.grandTotal = grTotal;
    }
}
