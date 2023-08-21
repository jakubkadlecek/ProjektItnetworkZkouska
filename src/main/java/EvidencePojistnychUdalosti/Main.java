package EvidencePojistnychUdalosti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        SeznamPojistenych seznamPojistenych = new SeznamPojistenych();

        System.out.println("-------------------------------");
        System.out.println("Vítejte v Evidenci pojištěných!");
        System.out.println("-------------------------------\n");

        /*
        Hlavní část programu, uživatel má na výběr přidat, odebrat
        nebo vyhledat uživatele a ukončit aplikaci:
         */

        String volba = "";
        while (!volba.equals("4")) {
            System.out.println("Vyberte si akci, stisknutím číslice:\n");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného podle jména a příjmení");
            System.out.println("4 - Konec");
            volba = scanner.nextLine();

            switch (volba) {
                case "1":
                    System.out.println("Zadejte jméno:");
                    String jmeno = scanner.nextLine().trim();
                    System.out.println("Zadejte příjmení:");
                    String prijmeni = scanner.nextLine().trim();
                    System.out.println("Zadejte věk:");
                    int vek = Integer.parseInt(scanner.nextLine().trim());
                    System.out.println("Zadejte telefonní číslo:");
                    String telefonniCislo = scanner.nextLine().trim();


                    Pojisteny pojisteny = new Pojisteny(jmeno, prijmeni, vek, telefonniCislo);
                    seznamPojistenych.pridatPojistenouOsobu(pojisteny);
                    System.out.println("Pojištěný byl úspěšně přidán!\n");
                    break;

                case "2":
                    System.out.println("Výpis všech pojištěných:");
                    seznamPojistenych.zobrazPojisteneOsoby();
                    break;

                case "3":
                    System.out.println("Zadejte jméno pojištěného:");
                    jmeno = scanner.nextLine();
                    System.out.println("Zadejte příjmení pojištěného:");
                    prijmeni = scanner.nextLine();
                    Pojisteny hledany = seznamPojistenych.vyhledatPodleJmenaPrijmeni(jmeno, prijmeni);

                    if (hledany != null) {
                        System.out.println("Pojištěný nalezen:" + hledany);
                    } else {
                        System.out.println("Pojištěný nenalezen!");
                    }
                    break;

                case "4":           //doplnit
                    System.out.println("Děkuji za použití aplikace!");
                    break;

                default:        // neplatná volba
                    System.out.println("Neplatná volba, vyberte jinou možnost");
            }
        }
    }
}
