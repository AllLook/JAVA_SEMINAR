package Java_seminar2_2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SecurityException, IOException {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число a: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите число b: ");
        int b = iScanner.nextInt();
        System.out.println("Список операций: sum, div,work,dif");
        String sum = "sum";
        String div = "div";
        String work = "work";
        String dif = "dif";
        String op = "";
        op = op_name(op);

        if (op.equals(sum)) {
            System.out.printf("Результат %d ", sum_m(a, b));
            System.out.println();
            logging_op.log_ging();
        }
        if (op.equals(div)) {
            System.out.printf("Результат %d ", div_v(a, b));
            System.out.println();
            logging_op.log_ging();
        }
        if (op.equals(work)) {
            System.out.printf("Результат %d ", work_k(a, b));
            System.out.println();
            logging_op.log_ging();
        }
        if (op.equals(dif)) {
            System.out.printf("Результат %d ", dif_f(a, b));
            System.out.println();
            logging_op.log_ging();
        }
    }

    public static int sum_m(int a, int b) {

        return (a + b);
    }

    public static int div_v(int a, int b) {

        return (a / b);
    }

    public static int dif_f(int a, int b) {

        return (a - b);
    }

    public static int work_k(int a, int b) {

        return (a * b);
    }

    public static String op_name(String op) {
        System.out.println("Введите операцию: ");
        Scanner iScanner = new Scanner(System.in);
        op = iScanner.next();
        System.out.println();
        return op;
    }

}
