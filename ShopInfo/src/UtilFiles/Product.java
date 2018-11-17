
package UtilFiles;

import java.util.Date;

public class Product {
    private int p_id;
    private String p_name;
    private int p_quantity;
    private double p_unitPrice;
    private double p_totalPrice;
    private Date p_purchaseDate;
    private Catagory catragory;

    public Product() {
    }

    public Product(int p_id, String p_name, int p_quantity, double p_unitPrice, double p_totalPrice, Date p_purchaseDate, Catagory catragory) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_quantity = p_quantity;
        this.p_unitPrice = p_unitPrice;
        this.p_totalPrice = p_totalPrice;
        this.p_purchaseDate = p_purchaseDate;
        this.catragory = catragory;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getP_quantity() {
        return p_quantity;
    }

    public void setP_quantity(int p_quantity) {
        this.p_quantity = p_quantity;
    }

    public double getP_unitPrice() {
        return p_unitPrice;
    }

    public void setP_unitPrice(double p_unitPrice) {
        this.p_unitPrice = p_unitPrice;
    }

    public double getP_totalPrice() {
        return p_totalPrice;
    }

    public void setP_totalPrice(double p_totalPrice) {
        this.p_totalPrice = p_totalPrice;
    }

    public Date getP_purchaseDate() {
        return p_purchaseDate;
    }

    public void setP_purchaseDate(Date p_purchaseDate) {
        this.p_purchaseDate = p_purchaseDate;
    }

    public Catagory getCatragory() {
        return catragory;
    }

    public void setCatragory(Catagory catragory) {
        this.catragory = catragory;
    }

    

    
}
