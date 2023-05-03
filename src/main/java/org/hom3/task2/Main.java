package org.hom3.task2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Сведения о товаре состоят из наименования, страны-производителя, веса, цены,
     * сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
     */
    public static void main(String[] args) {
        List<Product> prList = СompletionList();
        print(prList, "Список товаров: ");

        System.out.println("Введите сорт товара (1 или 2): ");
        Scanner sc = new Scanner(System.in);
        Integer searchGrade = sc.nextInt();

        List<Product> prList1 = SearchProduct(prList, searchGrade);
        print(prList1, "Список товаров заданного сорта минимальной стоимости: ");
    }

    private static List<Product> СompletionList() {
        Product pr1 = new Product("стул", "Росиия", 3.2f, 25f, 1);
        Product pr2 = new Product("стул", "Росиия", 2.2f, 20f, 1);
        Product pr3 = new Product("кровать", "Росиия", 15.2f, 205f, 2);
        Product pr4 = new Product("шкаф", "Росиия", 17.2f, 182.4f, 2);
        Product pr5 = new Product("кресло", "Росиия", 9.2f, 90f, 2);
        Product pr6 = new Product("кресло", "Беларусия", 7.2f, 80f, 2);
        Product pr7 = new Product("кресло", "Германия", 10.2f, 200f, 1);
        Product pr8 = new Product("кровать", "Китай", 18.2f, 200f, 1);
        Product pr9 = new Product("кровать", "Германия", 19.2f, 300f, 1);

        List<Product> productList = new ArrayList<>();
        productList.add(pr1);
        productList.add(pr2);
        productList.add(pr3);
        productList.add(pr4);
        productList.add(pr5);
        productList.add(pr6);
        productList.add(pr7);
        productList.add(pr8);
        productList.add(pr9);

        return productList;
    }

    private static List<Product> SearchProduct(List<Product> list, Integer searchGrade){
        List<Product> prListMinPrice = new ArrayList<>();
        boolean flagWrite;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).grade.equals(searchGrade)) {
                flagWrite = true;
                for (int j = 0; j < prListMinPrice.size(); j++) {
                    if (list.get(i).name.equals(prListMinPrice.get(j).name)) {
                        if (list.get(i).price < prListMinPrice.get(j).price) {
                            prListMinPrice.set(j, list.get(i));
                        }
                        flagWrite = false;
                    }
                }
                if (flagWrite) {
                    prListMinPrice.add(list.get(i));
                }
            }
        }
        return prListMinPrice;
    }

    private static void print(List<Product> list, String info) {
        System.out.printf(info + "\n");
        for (Product a: list) {
            System.out.println(a);
        }
        System.out.printf("\n");
    }
}
