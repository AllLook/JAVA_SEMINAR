package Java_seminar3_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;;

public class removal_of_even {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int size = iScanner.nextInt();
        System.out.println("Введите диапозон чисел списка: ");
        int range_num = iScanner.nextInt();
        // ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr_add(size, range_num));
    }

    public static ArrayList<Integer> arr_add(int size, int range_num) { // если передать сюда сам List из главного
                                                                        // метода, int arr третий аргумент
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();// не указал размер,вдруг еще добавить
        for (int i = 0; i < size; i++) {
            int rn = random.nextInt(range_num);
            arr.add(rn);
        }
        System.out.println(arr);
        boolean isSorted = false;// флаг что сортировка закончена
        while (!isSorted) {// пока не отсортирован
            isSorted = true; // переназначаем чтобы проверка на false была
            for (int k = 0; k < arr.size(); k++) {
                int j;
                j = arr.get(k);
                // System.out.print(j); если надо проверить корректность получения значения
                if (j % 2 == 0) {
                    arr.remove(k);
                    isSorted = false;
                }
            }

        }
        return arr;
    }
}