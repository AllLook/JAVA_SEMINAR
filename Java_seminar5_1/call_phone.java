package Java_seminar5_1;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class call_phone {

    public static void main(String[] args) {
        HashMap<String, List<String>> call_list = new HashMap<String, List<String>>(10, 1.0f);//создаем hashmap с возможностью расширения и списком для значений(чтобы можно было добавлять значения)
        while (true) {
            Scanner iScanner = new Scanner(System.in);
            System.out.println();
            System.out.printf("Введите команду: subs-добавить абонента,show-показать,add-добавить номер,exit-выход");
            System.out.println();
            String op = iScanner.nextLine();
            if (op.equals("subs")) { //меню вызывает действие в зависимости от требования
                add_subs(call_list);
            } else if (op.equals("show")) {
                show_list(call_list);
            } else if (op.equals("add")) {
                add_num(call_list);
            } else if (op.equals("exit")) {
                break;
            }
        }

    }

    public static HashMap add_subs(HashMap<String, List<String>> call_list) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя абонента:");
        String name = iScanner.nextLine();
        System.out.printf("Введите номер абонента или номера через пробел:");
        String number = iScanner.nextLine();
        List<String> val_num = new ArrayList<String>();//создаем список для значений hashmap
        val_num.add(number);//добавляем значение в список значений
        call_list.put(name, val_num);//ключ(имя) и список значений добавляем в hashmap
        return call_list;//возвращаем заполненный hashmap
    }

    public static HashMap add_num(HashMap<String, List<String>> call_list) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя абонента:");
        String name = iScanner.nextLine();
        if (call_list.containsKey(name)) {//если есть ключ(абонент) для добавления
            System.out.printf("Введите номер для добавления:");
            String num = iScanner.nextLine();
            List<String> val = call_list.get(name);//новая переменная типа List для извлечения значения(списка) этого ключа
            // System.out.println(val);
            val.add(num);//добавляем к значению этого ключа то что нужно добавить
        } else {
            System.out.println("Такого абонента нет");
        }
        return call_list;
    }

    public static void show_list(HashMap<String, List<String>> call_list) {
        for (var el : call_list.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + " ,");
        }

    }

}
