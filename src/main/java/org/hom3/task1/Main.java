package org.hom3.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Дан массив записей: наименование товара, цена, сорт.
     * Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
     * название которых содержит «высший».
     */
    public static void main(String[] args) {
        List<Product> prList = СompletionList();
        System.out.println("productList = " + prList);

        Integer searchGrade1 = 1;
        Integer searchGrade2 = 2;
        String searchNameWord = "высший";
        Float maxPrice = 0f;
        for (int i = 0; i < prList.size(); i++) {
            if (prList.get(i).grade.equals(searchGrade1)
                    || prList.get(i).grade.equals(searchGrade2)) {
                if (prList.get(i).name.contains(searchNameWord)) {
                    if (prList.get(i).price.floatValue() > maxPrice) {
                        maxPrice = prList.get(i).price.floatValue();
                    }
                }
            }
        }
        System.out.println("maxPrice = " + maxPrice);
    }

    private static List<Product> СompletionList() {
        Product pr1 = new Product("стул", 50.1f, 2);
        Product pr2 = new Product("хлеб", 4f, 3);
        Product pr3 = new Product("телефон", 100.5f, 1);
        Product pr4 = new Product("мука высший сорт", 3f, 2);
        Product pr5 = new Product("высший сорт говядины)))", 5f, 1);
        Product pr6 = new Product("колбаса высший вкус", 4.5f, 1);

        List<Product> productList = new ArrayList<>();
        productList.add(pr1);
        productList.add(pr2);
        productList.add(pr3);
        productList.add(pr4);
        productList.add(pr5);
        productList.add(pr6);

        return productList;
    }
}
