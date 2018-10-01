package cz.uhk.fim.opakovani.model;

public class Word {

    private String obsah;
    private int pocetPismen;
    private char[] pismena;

    public Word(String word, int length) {
    }

    public Word(String obsah, int pocetPismen, char[] pismena) {
        this.obsah = obsah;
        this.pocetPismen = pocetPismen;
        this.pismena = pismena;
    }

    public void setObsah(String obsah) {
        this.obsah = obsah;

    }

    public String getObsah() {
        return obsah;
    }

    public void setPocetPismen(int pocetPismen) {
        this.pocetPismen = pocetPismen;

    }

    public int getPocetPismen() {
        return pocetPismen;
    }

    public void setPismena(char[] pismena) {
        this.pismena = pismena;
    }

    public char[] getPismena() {
        return pismena;
    }
}
