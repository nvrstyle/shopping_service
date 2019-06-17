package ru.lubich.shoppingservice.product;

import ru.lubich.shoppingservice.common.RestURIConstants;

public class Product {
    public int product_id;
    public String name;
    public String description;
    public int category_id;
    public double price;
    public int stock;

    public int getProduct_id() {
        return product_id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getCategory_id() {
        return category_id;
    }

    public String getUrl() {
        return RestURIConstants.GET_PRODUCT.replace("{product_id}", Integer.toString(product_id));
    }
}
