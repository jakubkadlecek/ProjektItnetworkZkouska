package EvidencePojistnychUdalosti;

import java.util.ArrayList;
import java.util.List;

/**
 * Reprezentuje Seznam/Evidenci pojištěných osob
 */
public class SeznamPojistenych {
    /**
     * Kolekce pro ukládání pojištěných osob
     */
    private List<Pojisteny> seznam;

    /**
     * Inicializuje Seznam pojištěných
     */
    public SeznamPojistenych() {
        this.seznam = new ArrayList<>();
    }

    /**
     * Metoda přidá pojištěnou osobu do seznamu
     *
     * @param pojisteny Seznam pojištěných
     */
    public void pridatPojistenouOsobu(Pojisteny pojisteny) {
        seznam.add(pojisteny);
    }

    /**
     * Metoda zobrazí všechny pojištěné osoby
     */
    public void zobrazPojisteneOsoby() {
        for (Pojisteny pojisteny : seznam) {
            System.out.println(pojisteny);
        }
    }

    /**
     * Metoda pro vyhledávání pojištěné osoby podle jména a příjmení
     *
     * @param jmeno    Jméno pojištěné osoby
     * @param prijmeni Příjmení pojištěné osoby
     * @return vrátí Pojištěnou osobu
     */
    public Pojisteny vyhledatPodleJmenaPrijmeni(String jmeno, String prijmeni) {
        for (Pojisteny pojisteny : seznam) {
            if (pojisteny.getJmeno().equals(jmeno) && pojisteny.getPrijmeni().equals(prijmeni)) {
                return pojisteny;
            }
        }
        return null;
    }
}
