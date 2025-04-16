package ukol_pole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Vypište název dne v týdnu, který uživatel zadá číslicí.
//        2. Vypište uživatelem zadaný text pozpátku.
//        3. Spočítejte průměr platů, které uživatel zadá v 1 řetězci. Jednotlivé hodnoty v zadání budou oddělené čárkami.
//        4. Sečtěte všechny cifry v libovolném řetězci.
//                Např. po zadání textu “30. narozeniny slavím 1.1.2020” program vypíše 9
//                 Nápověda - hodnota číslic v ASCII je 48 - 57
        // 1
        Scanner scanner = new Scanner(System.in);
        // Celé pole dnů
        String[] dny = {"Pondělí", "Úterý", "Středa", "Čtvrtek", "Pátek", "Sobota", "Neděle"};
        System.out.println("Zadejte číslo dne:");
        int a = Integer.parseInt(scanner.nextLine());
        if ((a > 0) && (a <= 7)) {
            System.out.println(dny[a - 1]);
        } else {
            System.out.println("Neplatný den");
        }


        // 2
        // Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte text:");
        String text = scanner.nextLine();
        System.out.println("Text pozpátku:");
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();

        //3
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte platy:");
        String[] platy = scanner.nextLine().split(",");
        int soucet = 0;
        for (String plat : platy) {
            soucet += Integer.parseInt(plat.trim());
        }
        System.out.println("Průměr platů je " + ((double) soucet) / platy.length);

        //4
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte text:");
        String retezec = scanner.nextLine();
        int souct = 0;
        for (int i = 0; i < retezec.length(); i++) {
            int znak = (int) retezec.charAt(i);
            if ((znak >= 48) && (znak <= 57)) {
                souct += znak - 48;
            }
        }
        System.out.println("Součet cifer je: " + souct);



    }
}
