package uvodniSkoleni;

public class Main {
    public static void main(String[] args) {

        int salku = 5;
        String druhKavy = "Černá";

        System.out.println("Vypil jsem " + salku + " kávy typu " + druhKavy);


        //cyklus for - dokud bude i menší než 10, cyklus se bude opakovat
        for (int i = 0; i < 10; i++) {
            System.out.println("Já se vypíšu desetkrát :) ");
        }
        // while

        while (salku < 10) {   //Dokud je tato podmínka pravdivá)
            System.out.println("Tento kód se bude vykonávát");
            salku++;        // Cyklus se zastaví, když bude proměná salku rovna deseti..

        }

        int[] pole = {8, 6, 3, 5, 7, 8}; // Zkrácená zápis do pole
        int[] pole2 = new int[10];  // Vytvoření pole o deseti prvcích
        pole2[4] = 55;              // Uložení hodnoty 55 do páté "škatulky" pole, tedy na index 4 (indexujeme od nuly, tzn. první prvek má index 0, druhý 1 atd...
        int[][] polePoli = {
                {2,3,5},
                {2,2,5}
        };
    }
}





