package com.assessment.products;

import java.util.Date;

/**
 * Concrete product class for electronics
 */
public class ElectronicProduct extends Product {
    private String brand;
    private int warrantyPeriod;
    // TODO: Add private fields for warrantyPeriod (int, in months) and brand (String)

    /**
     * Constructs an ElectronicProduct object.
     */
    public ElectronicProduct(String id, String name, double price, int stockQuantity, int warrantyPeriod, String brand) {
        super(id, name, price, stockQuantity);
        this.brand=brand;
        this.warrantyPeriod=warrantyPeriod;
        // TODO: IMPLEMENT: Initialize electronics-specific fields.

    }

    // TODO: Create getters for warrantyPeriod and brand
    public int getWarrantyPeriod() { return this.warrantyPeriod; }
    public String getBrand() { return this.brand; }

    @Override
    public double calculateDiscount() {
        // TODO: IMPLEMENT: Electronics get 10% discount if price > 500, otherwise 5%.
        if (this.getPrice()>500){
            return this.getPrice()*0.1;
        }else{
            return this.getPrice()*0.05;
        }
    }

    @Override
    public String toString() {
        // TODO: IMPLEMENT: Call super.toString() and append brand and warranty details.
        return super.toString();
    }
}