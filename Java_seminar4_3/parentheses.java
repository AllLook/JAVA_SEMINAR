package Java_seminar4_3;

import java.util.Scanner;
import java.util.Stack;

/**
 * parentheses
 */
public class parentheses {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String expression = iScanner.nextLine();
        System.out.println(examination(expression));
    }

    public static boolean examination(String expression) {
        Stack<Character> stack = new Stack<Character>();// создаем стек
        if (expression != null) { // проверка что выражение введино
            for (int i = 0; i < expression.length(); i++) { // пробег по длинне выражения
                char symbol = expression.charAt(i);// текущий символ
                if (symbol == '(' || symbol == '{' || symbol == '[')// если символ равен одной из скобок
                    stack.push(symbol);// добавляем в стек
                else if (symbol == ']') {
                    if (stack.empty() || stack.pop() != '[')// если стек не пуст и последний элемент не открывающий
                        return false;
                } else if (symbol == '}') {
                    if (stack.empty() || stack.pop() != '{')
                        return false;
                } else if (symbol == ')') {
                    if (stack.empty() || stack.pop() != '(')
                        return false;
                }
            }

        }
        return stack.empty();
    }

}
