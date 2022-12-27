package Java_seminar5_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class list_worker {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();// лист для имен
        List<String> first = new ArrayList<>();// лист для фамилий
        // TreeMap<Integer,String> name_num = new TreeMap<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите список сотрудников через пробел:");
        String list_temp = iScanner.nextLine();// ВВОД ПОЛЬЗОВАТЕЛЯ
        String[] list_work = list_temp.split(" ");
        name.add(list_work[0]);
        for (int i = 1; i < list_work.length; i++) {// отсчет индексов с 0 нечетный фамилия
            if (i % 2 != 0) {
                first.add(list_work[i]);
            } else {
                name.add(list_work[i]); // если четный имя
            }
        }
        System.out.println(name);
        System.out.println(first);
        Set<Object> name_coint = new HashSet<>(name);// множество из списка
        for (Object el : name_coint) {
            System.out.println(Collections.frequency(name, el) + ":" + el);// пробегаем по именам и подсчитываем и выводим количество
                                                                           
        }
        // System.out.println();
    }
}
