package actiuni;

public class Bicicleta {
    private int nrRoti;
    private String model;

    public Bicicleta(int nrRoti, String model) {
        this.nrRoti = nrRoti;
        this.model = model;
    }

    public int getNrRoti() {
        return this.nrRoti;
    }

    public String getModel(){
        return this.model;
    }

    public void franeaza(){
        System.out.println("Bicicleta franeaza");
    }

    public void accelereaza(){
        System.out.println("Bicicleta accelereaza");
    }
}
