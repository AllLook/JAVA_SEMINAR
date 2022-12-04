import java.util.Scanner;

public class calc {
 
        public static void main(String [] args) {
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
            System.out.println("Введите операцию: ");
            String op = iScanner.next();
            System.out.printf(op);
            System.out.println();
            
            if (op.equals(sum)){
                System.out.printf("Результат %d ",sum_m(a, b));
            }
            if (op.equals(div)){
                System.out.printf("Результат %d ", div_v(a, b));
            }
            if (op.equals(work)){
                System.out.printf("Результат %d ", work_k(a, b));
            }
            if (op.equals(dif)){
                System.out.printf("Результат %d ", dif_f(a, b));
            }
}
        
        public static int sum_m(int a , int b) {

            return(a + b);
        }

    
        public static int div_v(int a , int b) {

            return(a / b);
        }

        public static int dif_f(int a , int b) {

            return(a - b);
        }

        public static int work_k(int a , int b) {

            return(a * b);
        }
    }

    

