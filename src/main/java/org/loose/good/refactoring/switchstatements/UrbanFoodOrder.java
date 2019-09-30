package org.loose.good.refactoring.switchstatements;

import java.util.List;

public class UrbanFoodOrder extends FoodOrder {
    public UrbanFoodOrder(List<Item> items) {
        super(items);
    }

    @Override
    protected int getDeliveryPrice() {
        return 10;
    }
}
