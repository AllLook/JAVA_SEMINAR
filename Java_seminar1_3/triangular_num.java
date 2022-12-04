package Java_seminar1_3;
import java.util.ArrayList;
import java.util.Scanner;

public class triangular_num {

    public static void main(String[] args) {
        System.out.println("Введите треугольное число: ");
        Scanner iScanner =  new Scanner(System.in);
        int number = iScanner.nextInt();
        triangular(number);
       
    }

        public static void triangular( int number) {
            int num = 0;
            int i = 0;
            ArrayList<Integer> Int_Range = new ArrayList<>();
            for(i = 0; i < number;){
                i = i + 1; // раскладываем число начиная с 1 
                Int_Range.add(i);
            }
            System.out.println(Int_Range);
            
            for(i = 0; i < number;i ++){ // индексы считаются с 0
                num += Int_Range.get(i);// накапливаются(суммируются) значения индексов
            }
            System.out.println(num);
          
 
        
    }

}         

        
        
