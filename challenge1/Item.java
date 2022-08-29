package com.smartinez.challenge1;

public class Item {
    private String brand;
    private String name;
    private int price;
    private boolean printable = true;

    public Item(String brand, String name, int price, boolean printable) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.printable = printable;
    }

    public Item(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public boolean isPrintable() {
        return printable;
    }

    @Override
    public String toString() {
        return "Item: " +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price + "\n"
                ;
    }
}
