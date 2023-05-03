package org.hom3.task1;

public class Product {
    String name;
    Float price;
    Integer grade;

    public Product(String name, Float price, Integer grade) {
        this.name = name;
        this.price = price;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", grade='" + grade + '\'' +
                '}';
    }
}
