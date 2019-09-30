package org.loose.good.refactoring.switchstatements;

import java.util.List;

public class SuburbanFoodOrder extends FoodOrder {
    public SuburbanFoodOrder(List<Item> items) {
        super(items);
    }

    @Override
    protected int getDeliveryPrice() {
        return 15;
    }
}
