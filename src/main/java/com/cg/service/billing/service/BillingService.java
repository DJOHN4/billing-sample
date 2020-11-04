package com.cg.service.billing.service;

import com.cg.service.billing.data.Bill;
import com.cg.service.billing.data.MenuBook;
import com.cg.service.billing.data.Order;
import com.cg.service.billing.data.PurchasedItem;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

@Component
public class BillingService {

    private static MenuBook menuBook = new MenuBook();
    private static final double serviceChargePercentage = 0.1;
    private static final double discount = 0.0;

    public Bill generateBill(Order orderObj) {
        Bill billObj = null;
        if (orderObj != null) {
            PurchasedItem purchasedItem = null;
            DecimalFormat df = new DecimalFormat("####0.00");
            double totalPrice = 0.0;
            double totalServiceCharge = 0.0;
            double grandTotal = 0.0;

            for (int i = 0; i < orderObj.purchasedItemList.size(); i++) {
                purchasedItem = orderObj.purchasedItemList.get(i);
                String str = purchasedItem.getItemName();
                int qty = purchasedItem.getQuantity();
                purchasedItem.setTotalPrice((MenuBook.getPrice(purchasedItem.getItemName()) * purchasedItem.getQuantity()));
                totalPrice = totalPrice + (MenuBook.getPrice(purchasedItem.getItemName()) * purchasedItem.getQuantity());
                if (MenuBook.getType(purchasedItem.getItemName()) != MenuBook.MENU_TYPE_DRINK) {
                    purchasedItem.setTotalServiceCharge(Double.valueOf(df.format(purchasedItem.getTotalPrice() * serviceChargePercentage)));
                    totalServiceCharge = totalServiceCharge + Double.valueOf(df.format(purchasedItem.getTotalPrice() * serviceChargePercentage));
                }
            }

            billObj = new Bill(orderObj.orderId, orderObj.tableNumber, orderObj.purchasedItemList,
                    Double.valueOf(df.format(totalServiceCharge)), totalPrice, discount, (totalPrice + totalServiceCharge + discount));
        }
        return billObj;
    }
}
