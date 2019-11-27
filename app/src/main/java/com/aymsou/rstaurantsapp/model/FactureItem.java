package com.aymsou.rstaurantsapp.model;

/**
 * Created by Aymane on 5/31/2017.
 */

public class FactureItem{
    public int quantity;
    public float price;
    public String itemName;

    public FactureItem(int quantity, float price, String itemName) {
        this.quantity = quantity;
        this.price = price;
        this.itemName = itemName;
    }
}