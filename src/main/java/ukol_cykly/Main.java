package ukol_cykly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        1.Ozvěna - Pomocí cyklu vypište zadanou větu 3x
//        2.Odpočítejte od 1 do 10
//        3.Odpočítejte od 10 do 1
//        4.Upravte kalkulačku
//          Doplňte do kalkulačky cyklus tak, aby se po provedení operace dotázala na pokračování. Pokud bude odpověď kladná, provede znovu celý svůj početní běh. Jinak program skončí.
//        5.Vykreslete šachovnici - Její obrazovou reprezentaci pomocí mezer a #

        // 1.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadejte větu: ");
        String veta = scanner.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.println(veta);
        }
        // 2.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // 3.
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // 4.
        //(viz balíček kalkulacka)

        // 5.
        System.out.println("Šachovnice:");
        for (int j = 1; j <= 8; j++) {
            for (int i = 1; i <=8; i++) {
                if (( i + j) % 2 == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print("██");
                }
            }
            System.out.println();
        }




    }
}
