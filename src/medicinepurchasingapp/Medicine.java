/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicinepurchasingapp;

/**
 *
 * @author 2ndyrGroupB
 */
public class Medicine {
    private String type;
    private String brandName;
    private String genericName;
    private double price;

    public Medicine() {
    }

    public Medicine(String type, String brandName, String genericName, double price) {
        this.type = type;
        this.brandName = brandName;
        this.genericName = genericName;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getGenericName() {
        return genericName;
    }

    public double getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public void setPrice(double price) {
        this.price = price;
    }    
}
