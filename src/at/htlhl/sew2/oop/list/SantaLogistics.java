package at.htlhl.sew2.oop.list;

import java.util.ArrayList;

public class SantaLogistics {
    public static ArrayList<Wish> getWishesFromSanta() {
        Child max = new Child("Max", "Mustermann", "12.11.2009");
        Child freddie = new Child("Freddie", "Faulig", "10.07.1975");
        Child robert = new Child("Robert", "Reiter", "11.11.2009");
        Child ben = new Child("Ben", "Besenstiel", "03.04.2007");
        Child ursula = new Child("Ursula", "Unschuldig", "03.04.2007");
        Child kathi = new Child("Kathi", "Kübel", "17.06.2012");

        Wish wishOfMax = new Wish(max, "Fußball");
        Wish wish1OfFreddie = new Wish(freddie, "Auto");
        Wish wish2OfFreddie = new Wish(freddie, "Geld");
        Wish wishOfRobert = new Wish(robert, "Pferd");
        Wish wishOfBen = new Wish(ben, "Besen");
        Wish wishOfUrsula = new Wish(ursula, "Kerze");
        Wish wishOfKathi = new Wish(kathi, "Buch");

        ArrayList<Wish> wishes = new ArrayList<>();
        wishes.add(wishOfMax);
        wishes.add(wish1OfFreddie);
        wishes.add(wish2OfFreddie);
        wishes.add(wishOfRobert);
        wishes.add(wishOfBen);
        wishes.add(wishOfUrsula);
        wishes.add(wishOfKathi);

        return wishes;
    }

    public static ArrayList<String> getNaughtyListFromSanta() {
        ArrayList<String> naughtyList = new ArrayList<>();
        naughtyList.add("Freddie Faulig");
        naughtyList.add("Robert Reiter");
        naughtyList.add("Ben Besenstiel");

        return naughtyList;
    }

    public static void sendMessageToSanta(ArrayList<Wish> approvedWishes) {
        int numberOfWishes = approvedWishes.size();

        System.out.println("\n--------------------------------------------------------------------------------\n");

        System.out.println("Dear Santa,\n\n" +
                "I have reviewed all the wish lists for you.\n" +
                "This year will be an easy one, as you only need to fulfill " + numberOfWishes + " wishes:\n"
        );

        for (Wish wish : approvedWishes) {
            System.out.println("- " + wish.getChild().getName() + " wants '" + wish.getDescription() + "'");
        }

        System.out.println("""

                Good luck on Christmas Eve!

                Kind regards,
                Chief Elf of Operations
                Santa Logistics Department"""
        );

        System.out.println("\n--------------------------------------------------------------------------------\n");
    }

    public static boolean isMaxWishGranted(ArrayList<Wish> approvedWishes) {
        Child child = new Child("Max", "Mustermann", "12.11.2009");
        Wish wish = new Wish(child, "Fußball");

        return approvedWishes.contains(wish);
    }

    public static void markNaughtyChildren(ArrayList<Wish> wishes, ArrayList<String> naughtyList) {
        for (Wish wish : wishes) {
            if (naughtyList.contains(wish.getChild().getName())) {
                wish.getChild().setNaughty(true);
            }
        }
    }

    public static ArrayList<Wish> approveOrDenyWishes(ArrayList<Wish> wishes) {
        ArrayList<Wish> approvedWishes = new ArrayList<Wish>();
        for (Wish wish : wishes) {
            if (wish.getChild().isOver18OnChristmasEve() && wish.getChild().isNaughty()) {
                approvedWishes.add(wish);
            }
        }
        return approvedWishes;
    }

    static void main(String[] args) {
        // TODO - Infos:
        //  1. Analysiere die gegebenen Klassen 'Wish' und 'Child'.
        //  2. Implementiere die folgenden TODOs der Reihe nach.
        //  Hierfür musst (und sollst) du keinen gegebenen Code ändern, sondern nur eigenen Code implementieren.
        //  Die TODOs 1-3 sind in der Klasse 'SantaLogistics' zu implementieren, für 4
        //  musst du eventuell auch Methoden in den Klassen 'Wish' und/oder 'Child' hinzufügen.
        //  Sieh dir, bevor du beginnst, eine Methode zu implementieren, den Aufruf im psvm() an.
        //  Daraus kannst du ableiten, wie die Methodendeklaration aussehen soll.
        //  Viel Erfolg! :)

        ArrayList<Wish> wishes = getWishesFromSanta();
        ArrayList<String> naughtyList = getNaughtyListFromSanta();

        // TODO 1: Implementiere die Methode 'markNaughtyChildren',
        //  die für jedes unartige Kind das Attribut 'isNaughty' setzt.
        markNaughtyChildren(wishes, naughtyList);

        // TODO 2: Implementiere die Methode 'approveOrDenyWishes',
        //  die prüft, ob Wünsche erfüllt werden, oder nicht.
        //  Ein Wunsch wird genau dann erfüllt, wenn ein Kind,
        //  das an Heilig Abend noch unter 18 ist, artig ist.
        //  Gib alle Wunschzettel auf der Konsole aus, mit der Anmerkung,
        //  ob ein Wunsch erfüllt wird (="APPROVED") oder nicht (="DENIED").
        ArrayList<Wish> approvedWishes = approveOrDenyWishes(wishes);

        // TODO 3: Erstelle in der Methode 'sendMessageToSanta' die Variable 'numberOfWishes',
        //  die angibt, wie viele Wünsche der Weihnachtsmann erfüllen muss.
        sendMessageToSanta(approvedWishes);

        // TODO 4: Max wohnt in Österreich.
        //  Dort ist das Christkind verantwortlich für die Wünsche an Weihnachten.
        //  Das Christkind fragt daher den Weihnachtsmann, ob Max Wunsch dieses Jahr erfüllt werden soll.
        //  Dieser ist allerdings sehr beschäftigt, und bittet dich daher, nachzusehen.
        //  Du siehst also in der Liste 'approvedWishes' nach, ob sie Max Wunschzettel enthält.
        //  Hierbei entdeckst du allerdings etwas seltsames:
        //  Wenn du die Liste ausgibst, enthält sie Max Wunschzettel.
        //  Doch laut der 'contains'-Methode (in der Methode 'isMaxWishGranted') ist dieser nicht enthalten.
        //  Versuche, den "Fehler" zu finden, und implementiere den nötigen Code,
        //  damit Max Wunsch vom Christkind doch noch erfüllt wird.
        //  (Hinweis: Finde heraus, was die 'contains'-Methode tatsächlich prüft.)
        System.out.println(approvedWishes);
        boolean isMaxWishGranted = isMaxWishGranted(approvedWishes);
        System.out.println("Max wish is " + (isMaxWishGranted ? "GRANTED" : "NOT GRANTED") + "!");
    }
}
