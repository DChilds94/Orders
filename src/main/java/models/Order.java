package models;

public class Order {

    private String item;
    private double price;
    private int id;

    public Order(String item, double price) {
        this.item = item;
        this.price = price;
    }
    public Order(){

    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
