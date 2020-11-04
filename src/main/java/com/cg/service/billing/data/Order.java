package com.cg.service.billing.data;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public String orderId;
    public String tableNumber;
    public List<PurchasedItem> purchasedItemList = new ArrayList<PurchasedItem>();
}
