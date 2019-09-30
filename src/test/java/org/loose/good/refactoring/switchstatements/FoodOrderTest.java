package org.loose.good.refactoring.switchstatements;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FoodOrderTest {

    @Test
    public void getPrice() {
        int expectedItemsPrice = 48;
        int expectedUrbanPrice = expectedItemsPrice + 10;
        int expectedSuburbanPrice = expectedItemsPrice + 15;
        int expectedExtraurbanPrice = expectedItemsPrice + 20;

        assertEquals(expectedUrbanPrice, getUrbanFoodOrder().getPrice());
        assertEquals(expectedSuburbanPrice, getSuburbanFoodOrder().getPrice());
        assertEquals(expectedExtraurbanPrice, getExtraurbanFoodOrder().getPrice());
    }

    private FoodOrder getUrbanFoodOrder() {
        return new UrbanFoodOrder(getItems());
    }

    private FoodOrder getExtraurbanFoodOrder() {
        return new ExtraurbanFoodOrder(getItems());
    }

    private FoodOrder getSuburbanFoodOrder() {
        return new SuburbanFoodOrder(getItems());
    }

    private List<Item> getItems() {
        return Arrays.asList(
                new Item(8, "Soup"),
                new Item(9, "Chicken breast"),
                new Item(5, "Wedges"),
                new Item(4, "Salad"),
                new Item(12, "Cheese cake"),
                new Item(10, "Orange juice")
        );
    }
}