package Java_seminar3_2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * min_max_average
 */
public class min_max_average {

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int size = iScanner.nextInt();
        System.out.println("Введите диапозон чисел списка: ");
        int range_num = iScanner.nextInt();
        // ArrayList<Integer> arr = new ArrayList<>();
        System.out.println();
        arr_add(size, range_num);

    }

    public static void arr_add(int size, int range_num) { // если передать сюда сам List из главного
        // метода, int arr третий аргумент
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();// не указал размер,вдруг еще добавить
        for (int i = 0; i < size; i++) {
            int rn = random.nextInt(range_num);
            arr.add(rn);// заполнение List рандомно
        }
        System.out.println(arr);
        int min = arr.get(0);
        int max = arr.get(0);

        for (int k = 0; k < arr.size(); k++) {
            // int min = arr.get(0);
            // int max = arr.get(0);
            if (arr.get(k) <= min) {// если текущий меньше или равен первого
                min = arr.get(k); // то текущий становиться минимальным
            }

            if (arr.get(k) >= max) { // если текущий больше максимального
                max = arr.get(k);// то текущий становиться максимальным
            }
        }
        System.out.printf("min element : %s , max element : %s", min, max);
        int amount_el = arr.size();// кол во элементов
        int sum_el = 0;
        for (int j = 0; j < arr.size(); j++) {
            sum_el += arr.get(j);// сумма элементов
        }
        int result = sum_el / amount_el;// сумма делиться на кол во для поиска среднего
        System.out.printf(", mean : %s", result);

    }
}