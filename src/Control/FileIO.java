/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author agungrb
 */
public class FileIO {
    public void saveMobil(Object o) {
        try(FileOutputStream fout = new FileOutputStream("mobil.dat")) {
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(o);
            oout.flush();
        }catch(Exception e) {
            System.out.println(e);
            
        }
    }
    public Object loadMobil() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mobil.dat"))) {
//            ois.close();
            return ois.readObject();
        }catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public void saveKategori(Object o) {
        try(FileOutputStream fout = new FileOutputStream("kategori.dat")) {
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(o);
            oout.flush();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    public Object loadKategori() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("kategori.dat"))) {
//            ois.close();
            return ois.readObject();
        }catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
