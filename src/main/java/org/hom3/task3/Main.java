package org.hom3.task3;


import java.util.ArrayList;
import java.util.List;


public class Main {
    /**
     * Сведения о книге состоят из названия, фамилии автора, цены,
     * года издания и количества страниц.
     * Найти названия книг, в которых простое количество страниц,
     * фамилия автора содержит «А» и год издания после 2010 г, включительно.
     */
    public static void main(String[] args) {
        List<Book> bookList = library();
        print(bookList, "Список книг: ");

        List<Book> searchBook = SearchBook(bookList);
        print(searchBook, "Список найденных книг у которых простое количество страниц,\n" +
                "фамилия автора содержит «А» и год издания после 2010 г (включительно): ");
    }

    private static boolean PrimeNumber(Integer number) {
        int numberAbs = Math.abs(number);
        int j = 2;
        while (j <= Math.sqrt(numberAbs)) {
            if (numberAbs % j == 0) {
                return false;
            }
            j += 1;
        }
        return true;
    }

    private static List<Book> SearchBook(List<Book> bookList) {
        List<Book> searchList = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (PrimeNumber(bookList.get(i).pages)
                    && bookList.get(i).author.charAt(0) == 'А'
                    && bookList.get(i).year >= 2010) {
                searchList.add(bookList.get(i));
            }
        }
        return searchList;
    }

    private static void print(List<Book> list, String info) {
        System.out.printf(info + "\n");
        for (Book a : list) {
            System.out.println(a);
        }
        System.out.printf("\n");
    }

    private static List<Book> library() {
        Book b1 = new Book("Физика", "Александров", 12.6f, 2005, 37);
        Book b2 = new Book("Алгебра", "Абромович", 18.2f, 2011, 35);
        Book b3 = new Book("Геометрия", "Лисимов", 4.8f, 2010, 37);
        Book b4 = new Book("Биология", "Сидоров", 14.1f, 1999, 50);
        Book b5 = new Book("Химия", "Асеев", 9.5f, 2010, 23);
        Book b6 = new Book("Астрономия", "Текшаев", 11.1f, 2013, 35);
        Book b7 = new Book("География", "Токтосопиев", 15.4f, 2012, 42);
        Book b8 = new Book("Экономика", "Адамс", 13.7f, 2020, 17);
        Book b9 = new Book("Информатика", "Сидоров", 8.9f, 2000, 53);
        Book b10 = new Book("Анатомия", "Алесьев", 17.1f, 2012, 28);

        List<Book> lib = new ArrayList<>();
        lib.add(b1);
        lib.add(b2);
        lib.add(b3);
        lib.add(b4);
        lib.add(b5);
        lib.add(b6);
        lib.add(b7);
        lib.add(b8);
        lib.add(b9);
        lib.add(b10);

        return lib;
    }
}
