package ru.lubich.shoppingservice.order;

import ru.lubich.shoppingservice.common.RestURIConstants;

public class LineItem {
    public int product_id;
    public double price;
    public int qty;

    public int getProduct_id() {
        return product_id;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getUrl() {
        return RestURIConstants.GET_PRODUCT.replace("{product_id}", Integer.toString(product_id));
    }
}
