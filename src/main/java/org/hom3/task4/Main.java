package org.hom3.task4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Main {
    /**
     * Задан целочисленный список ArrayList.
     * Найти минимальное, максимальное и среднее из этого списка.
     */
    public static void main(String[] args) {
        int[] array = {61, 24, 34, 47, 50, 18, 79, 28, 91};
        List<Integer> list = new ArrayList<>(array.length);
        for (Integer i : array) {
            list.add(Integer.valueOf(i));
        }
        System.out.println("List = " + list);
        System.out.println("Maximum Element in List = " + Collections.max(list));
        System.out.println("Minimum Element in List = " + Collections.min(list));
        float middle;
        float sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        middle = sum / list.size();
        System.out.println("Middle in List = " + middle);

    }
}
