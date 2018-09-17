package ru.geekbrains.algorithmsJava5;

public class Item {
    private int price;
    private double weight;

    public Item(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
