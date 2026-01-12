package at.htlhl.sew2.oop.list;

import java.util.ArrayList;

class ShoppingBasket {
    void main() {
        String input = IO.readln("Welche Zahl gibst du ein? ");
        int number = Integer.parseInt(input);

        ArrayList<String> einkaufsListe = new ArrayList<>();
        while (true) {
            String s = IO.readln("Brauchen wir noch etwas j/n");
            if (s.equals("j")) {
                String produkt = IO.readln("Was brauchen wir noch?");
                einkaufsListe.add(produkt);
            } else if (s.equals("n")) {
                IO.println("Hier ist die Einkaufsliste: ");
                for (String produkt : einkaufsListe) {
                    IO.println(produkt);
                }
                break;
            }
        }
    }
}
