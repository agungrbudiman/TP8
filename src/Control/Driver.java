/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.Aplikasi;

/**
 *
 * @author agungrb
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplikasi app = new Aplikasi();
//        app.addKategori("Sedan", 5);
//        app.addKategori("SUV", 7);
//        app.addKategori("MPV", 7);
//        app.addMobil("Xenia", app.getKategori(2),130000);
//        app.addMobil("Pajero", app.getKategori(1),150000);
//        app.addMobil("Calya", app.getKategori(2), 100000);
//        app.addMobil("Civic", app.getKategori(0), 175000);
        app.createAkun("agung", "agung", "1234");
        app.createAkun("bayu", "bayu", "4321");
        app.createAkun("santi", "santi", "0000");
//        app.saveMobil();
//        app.saveKategori();
        app.loadKategori();
        app.loadMobil();

        Controller control = new Controller(app);
    }
    
}
