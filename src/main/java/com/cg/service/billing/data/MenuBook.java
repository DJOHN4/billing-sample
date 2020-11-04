package com.cg.service.billing.data;

import java.util.HashMap;
import java.util.Map;

public class MenuBook {

    private static Map<String, Object> menuItems = new HashMap<>();
    public static final String MENU_TYPE_FOOD = "FOOD";
    public static final String MENU_TYPE_DRINK = "DRINK";

    public MenuBook() {
        menuItems.put("Cola", new MenuItem("Cola", MENU_TYPE_DRINK, true, 0.50 ));
        menuItems.put("Coffee", new MenuItem("Coffee", MENU_TYPE_DRINK, false, 1.0 ));
        menuItems.put("Cheese-Sandwich", new MenuItem("Cheese-Sandwich", MENU_TYPE_FOOD, true, 2.0 ));
        menuItems.put("Steak-Sandwich", new MenuItem("Steak-Sandwich", MENU_TYPE_FOOD, false, 4.5 ));
    }
    public static void addItems(MenuItem item) {
        menuItems.put("Cola", item);
    }

    public static void removeItems(MenuItem item) {
        menuItems.remove(item);
    }

    public static void updateItems(String name, MenuItem item) {
        menuItems.replace(name, item);
    }
    public static double getPrice(String name) {
        return ((MenuItem) menuItems.get(name)).getPrice();
    }
    public static String getType(String name){
        return ((MenuItem) menuItems.get(name)).getType();
    }
}
