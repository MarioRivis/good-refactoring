package org.loose.good.refactoring.switchstatements;

import java.util.List;

public class UrbanFoodOrder implements FoodOrder {
    @Override
    public int getDeliveryPrice() {
        return 10;
    }
}
