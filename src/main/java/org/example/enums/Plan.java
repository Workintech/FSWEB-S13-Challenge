package org.example.enums;

public enum Plan {
    BASIC("basic",1000),
    PLATINIUM("basic",1000),
    GOLD("basic",1000);

    private String name;
    private Integer price;

    Plan(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }





}
