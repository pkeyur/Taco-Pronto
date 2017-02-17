package hw1.android.csulb.edu.hw1;

import java.io.Serializable;

/**
 * Created by KEYUR on 14-02-2017.
 */

public class Item implements Serializable{
    private String item_name;
    private Double item_price;

    public Item(String item_name, Double item_price) {
        this.setItem_name(item_name);
        this.setItem_price(item_price);
    }

    public Item(CharSequence item_name, Double item_price) {
        this.setItem_name(String.valueOf(item_name));
        this.setItem_price(item_price);
    }

    public Double getItem_price() {
        return item_price;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setItem_price(Double item_price) {
        if(item_price==null) { item_price = 0.0; }
        this.item_price = item_price;
    }

    public void setItem_price(String item_price) {
        if(item_price==null) { this.item_price = 0.0; }
        this.item_price = Double.valueOf(item_price);
    }
}
