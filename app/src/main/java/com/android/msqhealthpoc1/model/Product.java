package com.android.msqhealthpoc1.model;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sihlemabaleka on 7/26/17.
 */

public class Product {


    public String code;
    public String consumables;
    public String description;
    public double price;
    public String unit_of_messuremeant;
    public String trueImageUrl;
    public Map<String, Boolean> stars = new HashMap<>();

    public Product() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)
    }

    public Product(String code, String consumables, String description, double price, String unit_of_messuremeant, String trueImageUrl) {
        this.code = code;
        this.consumables = consumables;
        this.description = description;
        this.price = price;
        this.unit_of_messuremeant = unit_of_messuremeant;
        this.trueImageUrl = trueImageUrl;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("CODE", code);
        result.put("CONSUMABLES", consumables);
        result.put("DESCRIPTION", description);
        result.put("PRICING", price);
        result.put("PRICING UNIT", unit_of_messuremeant);
        result.put("True Image", trueImageUrl);
        return result;

    }
}