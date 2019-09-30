package org.loose.good.refactoring.switchstatements;

import java.util.List;

public class SuburbanFoodOrder implements FoodOrder {
    @Override
    public int getDeliveryPrice() {
        return 15;
    }
}
