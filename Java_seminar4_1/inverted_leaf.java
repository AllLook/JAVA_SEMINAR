package Java_seminar4_1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * inverted_leaf
 */
public class inverted_leaf {

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

    public static void arr_add(int size, int range_num) {

        Random random = new Random();
        LinkedList<Integer> arr = new LinkedList<>();// не указал размер,вдруг еще добавить
        for (int i = 0; i < size; i++) {
            int rn = random.nextInt(range_num);
            arr.add(rn);// заполнение List рандомно
        }
        System.out.println(arr);
        LinkedList<Integer> array = new LinkedList<>();
        System.out.println(array);
        for (int k = arr.size() - 1; k >= 0; k--) {
            array.add(arr.get(k));
        }

        System.out.println(array);
    }

}