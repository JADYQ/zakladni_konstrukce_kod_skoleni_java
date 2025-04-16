package ukol_funkce;

public class Main {
    public static void main(String[] args) {
//        Pomocí cyklu zavolejte 3x funkci, která vypíše text “Hurá”
//        Vypište název dne v týdnu, který uživatel zadá číslicí. Využijte vstupní parametr funkce a její návratovou hodnotu.

        for (int i = 0; i < 3; i++) {
            hura();
        }
        System.out.println(nazevDne(1));
    }

    public static void hura() {
        System.out.println("Hurá");
    }

    public static String nazevDne(int index) {
        String[] dny = {"Pondělí", "Úterý", "Středa", "Čtvrtek", "Pátek", "Sobota", "Neděle"};
        if ((index > 0) && (index <= 7)) {
            return dny[index - 1];
        }
        return "Neplatný den";
    }
}
