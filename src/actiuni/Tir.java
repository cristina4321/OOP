package actiuni;

public class Tir {

    private int nrRoti;
    private String nrInmatriculare;

    public Tir(int nrRoti, String nrInmatriculare) {

        this.nrRoti = nrRoti;
        this.nrInmatriculare = nrInmatriculare;
    }

    public int getNrRoti() {
        return this.nrRoti;
    }

    public void accelereaza() {
        System.out.println("Tirul " + this.nrInmatriculare + " accelereaza");
    }

    public void franeaza() {
        System.out.println("Tirul " + this.nrInmatriculare + " a franat");
    }

    public String getNrInmatriculare() {
        return this.nrInmatriculare;
    }
}
