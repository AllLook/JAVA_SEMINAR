import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите кретерий поиска:1-ОЗУ,2-ЖД,3-ОС,4-цвет");// запрос кретерия у пользователя
        System.out.println();
        String criterion = iScanner.nextLine();
        String temp = null;
        if (criterion.equals("1")) {
            System.out.println("Введите размер ОЗУ: ");
            temp = iScanner.nextLine();
        }
        if (criterion.equals("2")) {
            System.out.println("Введите размер ЖД: ");
            temp = iScanner.nextLine();
        }
        if (criterion.equals("3")) {
            System.out.println("Введите название OS: ");
            temp = iScanner.nextLine();
        }
        if (criterion.equals("4")) {
            System.out.println("Введите цвет: ");
            temp = iScanner.nextLine();
        }
        Laptop<String, Integer> laptop1 = new Laptop<>();
        laptop1.setName("HP");
        laptop1.setRam("2");
        laptop1.setHdd("120");
        laptop1.setOS("Windows");
        laptop1.setColor("Black");


        Laptop<String, Integer> laptop2 = new Laptop<>();
        laptop2.setName("Asus");
        laptop2.setRam("4");
        laptop2.setHdd("250");
        laptop2.setOS("Windows");
        laptop2.setColor("Red");


        Laptop<String, Integer> laptop3 = new Laptop<>();
        laptop3.setName("Dell");
        laptop3.setRam("6");
        laptop3.setHdd("500");
        laptop3.setOS("Windows");
        laptop3.setColor("Blue");

        Laptop<String, Integer> laptop4 = new Laptop<>();
        laptop3.setName("Lenovo");
        laptop3.setRam("8");
        laptop3.setHdd("750");
        laptop3.setOS("Windows");
        laptop3.setColor("yellow");

        List val_map_laptop1 = (List) laptop1.values();
        System.out.println(laptop1.values());
        List val_map_laptop2 = (List) laptop1.values();
        List val_map_laptop3 = (List) laptop1.values();
        List val_map_laptop4 = (List) laptop1.values();

        val_result(val_map_laptop1, val_map_laptop2, val_map_laptop3, val_map_laptop4, criterion, temp);


    }


    public static void val_result(List val_map_laptop1, List val_map_laptop2, List val_map_laptop3, List val_map_laptop4, String criterion, String temp) {
        for (int i = 0; i < val_map_laptop1.size(); i++) {
            if (val_map_laptop1.get(i).equals(temp)) {
                System.out.println(val_map_laptop1);
            }
            if (val_map_laptop2.get(i).equals(temp)) {
                System.out.println(val_map_laptop2);
            }
            if (val_map_laptop3.get(i).equals(temp)) {
                System.out.println(val_map_laptop3);
            }
            if (val_map_laptop4.get(i).equals(temp)) {
                System.out.println(val_map_laptop4);
            }
        }
    }


}