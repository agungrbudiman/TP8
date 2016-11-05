/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author agungrb
 */
public class Penyewaan {
    private StrategiPenyewaan jenisPenyewaan;
    private Mobil mobil;
    private double totalBiaya;

    public Penyewaan(int durasiSewa, Mobil mobil) {
        if(durasiSewa == 6) {
           jenisPenyewaan = new Sewa6Jam();
        }
        else if(durasiSewa == 12) {
            jenisPenyewaan = new Sewa12Jam(); 
        }
        else if(durasiSewa == 24) {
            jenisPenyewaan = new Sewa24Jam(); 
        }
        else if(durasiSewa == 1) {
            jenisPenyewaan = new Sewa1Minggu(); 
        }
        this.mobil = mobil;
        this.totalBiaya = jenisPenyewaan.kalkulasiBiaya(mobil.getHarga());
    }

    public Mobil getMobil() {
        return mobil;
    }
    
    public double getTotalBiaya() {
        return totalBiaya;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public StrategiPenyewaan getJenisPenyewaan() {
        return jenisPenyewaan;
    }
    
    
    
}
