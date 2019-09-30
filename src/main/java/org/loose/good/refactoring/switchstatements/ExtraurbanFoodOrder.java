package org.loose.good.refactoring.switchstatements;

import java.util.List;

public class ExtraurbanFoodOrder extends FoodOrder {
    protected ExtraurbanFoodOrder(List<Item> items) {
        super(items);
    }

    @Override
    protected int getDeliveryPrice() {
        return 20;
    }
}
