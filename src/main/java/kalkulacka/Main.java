package kalkulacka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cislo1;
        double cislo2;
        String pokracovat = "ANO";

        while (pokracovat.equals("ANO")) {
            System.out.println("Zadejte první číslo");
            cislo1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Zadejte druhé číslo");
            cislo2 = Double.parseDouble(scanner.nextLine());

            double soucet = cislo1 + cislo2;
            double rozdil = cislo1 - cislo2;
            double soucin = cislo1 * cislo2;
            double podil = cislo1 / cislo2;

            System.out.println("Součet čísel je: " + soucet);
            System.out.println("Rozdíl čísel je: " + rozdil);
            System.out.println("Součin čísel je: " + soucin);
            System.out.println("Podíl čísel je: " + podil);

            System.out.println("Chcete pokračovat?");
            pokracovat = scanner.nextLine();
        }


    }
}
