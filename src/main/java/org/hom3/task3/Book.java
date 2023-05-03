package org.hom3.task3;

public class Book {
    String name;
    String author;
    Float price;
    Integer year;
    Integer pages;

    public Book(String name, String author, Float price, Integer year, Integer pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.year = year;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}
