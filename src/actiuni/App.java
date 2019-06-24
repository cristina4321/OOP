package actiuni;

public class App {
    public static void main(String[] args) {
        Conducator conducator = new Conducator();
        Basculanta basculanta1 = new Basculanta(4,"B05JWX");
        Basculanta basculanta2 = new Basculanta(4,"IF02JKX");
        Tir tir1=new Tir(12,"B09TIU");
        Bicicleta bicicleta1 = new Bicicleta(2,"MountainBike");



//Tema:
        //Adauga bicileta( nu are nr de inmatriculare)
// cu model sau serie si nr de roti
// pentru setTir sau setBas. sa se afiseze un mesaj

        conducator.setBasculanta(basculanta1);

        conducator.setBasculanta(basculanta1);
        //conducator.setBasculanta(basculanta2);
        conducator.accelereaza();
        conducator.franeaza();
         conducator.dateJos();
        System.out.println("---------------");
        conducator.setTir(tir1);
        conducator.setTir(tir1);
        conducator.franeaza();
        conducator.dateJos();
        System.out.println("---------------");
        conducator.setBicicleta(bicicleta1);
        conducator.setBicicleta(bicicleta1);
        conducator.accelereaza();
        conducator.franeaza();
        conducator.dateJos();
        System.out.println("---------------");
         /* basculanta1.accelereaza();
        basculanta1.franeaza();
        tir1.accelereaza();
        tir1.getNrInmatriculare(); */



    }
}
