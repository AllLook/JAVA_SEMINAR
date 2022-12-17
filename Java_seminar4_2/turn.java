package Java_seminar4_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class turn {
    public static void main(String[] args) {
            LinkedList<Integer> turn_list = new LinkedList<>();
            while(true){
                //LinkedList<Integer> turn_list = new LinkedList<>();
                System.out.printf("Введите действие для элемента: adding,delite,show,exit:");
                Scanner iScanner = new Scanner(System.in);
                System.out.println();
                String op = iScanner.nextLine();
                System.out.println();
                if(op.equals("adding")){
                    System.out.printf("Добавьте элемент: ");
                    int el = iScanner.nextInt();
                    enqueue(el, turn_list);
                }
                    
                if(op.equals("delite")){
                    dequeue(turn_list);
                }
                if(op.equals("show")){
                    System.out.println(first(turn_list));
                }

                if(op.equals("exit")){
                    break;
                }

            System.out.println();   
            System.out.println(turn_list);
            }
        
    }
        public static LinkedList enqueue(int el,  LinkedList<Integer> turn_list) {
            turn_list.add(el);
            return turn_list;
        }
        public static LinkedList dequeue(LinkedList<Integer> turn_list){
            turn_list.removeFirst();
            return turn_list;
        }
        public static Integer first(LinkedList<Integer> turn_list) {
            //int fst = turn_list.getFirst();
            //return fst;
            return turn_list.getFirst();
        }

}
