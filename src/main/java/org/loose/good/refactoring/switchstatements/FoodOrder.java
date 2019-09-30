package org.loose.good.refactoring.switchstatements;

import java.util.List;

public interface FoodOrder {
    default int getPrice(List<Item> items) {
        int itemsTotal = 0;
        for (Item item : items) {
            itemsTotal += item.getPrice();
        }
        return itemsTotal + getDeliveryPrice();
    }

    int getDeliveryPrice();
}
