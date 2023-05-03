package org.hom3.task2;

public class Product {
    String name;
    String country;
    Float weight;
    Float price;
    Integer grade;

    public Product(String name, String country, Float weight, Float price, Integer grade) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", grade=" + grade +
                '}';
    }
}
