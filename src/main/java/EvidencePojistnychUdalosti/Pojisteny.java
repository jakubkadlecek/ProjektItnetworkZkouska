package EvidencePojistnychUdalosti;

/**
 * Reprezentuje pojištěnou osobu
 */
public class Pojisteny {
    /**
     * Jméno
     */
    private String jmeno;
    /**
     * Příjmení
     */
    private String prijmeni;
    /**
     * Věk
     */
    private int vek;
    /**
     * Telefonní číslo
     */
    private String telefonniCislo;

    /**
     * Inicializuje pojištěnou osobu
     *
     * @param jmeno          Jméno pojištěné osoby
     * @param prijmeni       Příjmení pojištěné osoby
     * @param vek            Věk pojištěné osoby
     * @param telefonniCislo Telefonní číslo pojištěné osoby
     */
    public Pojisteny(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Vrátí textovou reprezentaci pojištěné osoby
     *
     * @return Jméno, Příjmení, Věk, Telefonní číslo
     */
    @Override
    public String toString() {
        return "Jméno: " + jmeno + ", Příjmení: " + prijmeni + ", Věk: " + ", Telefon: " + telefonniCislo;
    }
}

