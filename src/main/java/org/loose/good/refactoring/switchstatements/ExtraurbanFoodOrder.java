package org.loose.good.refactoring.switchstatements;

import java.util.List;

public class ExtraurbanFoodOrder implements FoodOrder {
    @Override
    public int getDeliveryPrice() {
        return 20;
    }
}
