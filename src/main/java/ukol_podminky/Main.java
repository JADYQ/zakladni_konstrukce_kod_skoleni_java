package ukol_podminky;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Na vstupu dostanete dvě čísla. Vypište, zda jsou si rovna, nebo jestli je první menší, či větší než druhé.
//        Na vstupu dostanete řetězec. Zjistěte, zda je zadaný celý velkými písmeny.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadejte první číslo:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadejte druhé číslo:");
        int b = Integer.parseInt(scanner.nextLine());
        if (a > b) {
            System.out.println("První větší");
        } else if (a < b) {
            System.out.println("Druhé větší");
        } else {
            System.out.println("Jsou stejná");
        }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadejte řetězec:");
//        String vstup = scanner.nextLine();
//        if (vstup.equals(vstup.toUpperCase())) {
//            System.out.println("Celý velkými");
//        } else {
//            System.out.println("Není velkými");
//        }


    }
}
