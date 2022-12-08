package Java_seminar2_1;

import java.io.IOException;
import java.util.Scanner;;

/**
 * array_sorting
 */
public class array_sorting {
    public static void main(String[] args) throws SecurityException, IOException {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arr_size = iScanner.nextInt();
        int[] arr = new int[arr_size];
        arr_add(arr_size, arr);
        System.out.println();
        for (int v : arr) {
            System.out.println(v); // вывод массива циклом чтобы не изменять его в строку или List
        }
        System.out.println();
        sort_arr(arr);
        for (int k : arr) {
            System.out.println(k);
        }
    }

    public static int[] arr_add(int arr_size, int[] arr) {

        for (int i = 0; i < arr_size; i++) {
            System.out.println("Введите элемент массива: ");
            Scanner iScanner = new Scanner(System.in);
            int num = iScanner.nextInt();
            arr[i] = num;
        }
        return arr;
    }

    public static int[] sort_arr(int[] arr) throws SecurityException, IOException {
        boolean isSorted = false;// флаг что сортировка закончена
        while (!isSorted) {// пока не отсортирован
            isSorted = true; // переназначаем чтобы проверка на false была
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {// если текущий больше следующего
                    int temp = arr[i];// текущий который больше во врем переменную
                    arr[i] = arr[i + 1];// значение текущего становиться равно знач следующего
                    arr[i + 1] = temp;// след становиться равен текущ знач которое больше и сравнение идет дальше
                    isSorted = false;
                }

            }

        }
        logging_op.log_ging();
        return arr;

    }
}
