package Java_seminar1_2;

import java.util.ArrayList;

/**
 * prime_numbers
 */
public class prime_numbers {

    public static void main(String[] args) {
        int i, j ;
        boolean isprime;
        ArrayList <Integer> Range_list = new ArrayList<>();
      
        for (i=2; i<1000; i++) {
           isprime = true;// цикл работает пока true
       
           // Проверить, делится ли число без остатка.
           for ( j = 2; j < i; j++)// до текущего индекса проверка делителя начиная с 2
               // Если число делится без остатка, оно простое
               if ((i%j) == 0) isprime = false;// если текущее число делиться на индекс диапозона числа начиная с 2 то оно составное
     
           if(isprime) // если предидущая проверка не сработала то число простое
                Range_list.add(i);// добавление в список числа прошедшего проверку
        }
        System.out.println(Range_list);//вывод списка
    }
}
        

 

