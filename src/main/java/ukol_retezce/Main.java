package ukol_retezce;

public class Main {
    public static void main(String[] args) {

//       1. Pomocí metod Stringu odstraňte z věty přebytečné mezery.
//       2. Převeďte vše na malá písmena.
//       3. Nahraďte slovo “C++” za “Java”.
//       4. Ujistěte se, že věta začíná slovem “Java” a obsahuje slovo “krát” (jen vypište, co vrací příslušné metody).
//       5. Větu vypište s tím, že nastavíte kolikrát je lepší na počet znaků ve větě krát 3.

        String vstup = " C++ je %d KRÁT lepší! ";
        String vystup = vstup.trim().toLowerCase().replace("c++", "Java");

        // true
        System.out.println(vystup.startsWith("Java"));

        // true
        System.out.println(vystup.contains("krát"));

        // Java je 66 krát lepší!
        System.out.printf(vystup, vystup.length() * 3);


    }
}
