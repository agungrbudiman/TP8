/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.FileIO;
import Model.Kategori;
import Model.Member;
import Model.Mobil;
import java.util.ArrayList;

/**
 *
 * @author agungrb
 */
public class Aplikasi {
    private ArrayList<Member> listMember;
    private ArrayList<Kategori> listKategori;
    private ArrayList<Mobil> listMobil;
    private FileIO database;
    public int noUrut = 1;

    public Aplikasi() {
        listMember = new ArrayList<Member>();
        listKategori = new ArrayList<Kategori>();
        listMobil = new ArrayList<Mobil>();
        database = new FileIO();
    }
      
    public void createAkun(String nama, String username, String password) {
        listMember.add(new Member(nama,username,password,noUrut));
        noUrut++;
    }
    
    public Member cariAkun(String username, String password) {
        for (Member member : listMember) {
            if(member.getUsername().equals(username) && member.getPasswword().equals(password)) {
                return member;
            }
        }
        return null;
    }
    
    public void addKategori(String nama, int jumlahKursi) {
        listKategori.add(new Kategori(nama, jumlahKursi));
    }
    
    public void addMobil(String nama, Kategori kategori, long harga) {
        listMobil.add(new Mobil(nama, kategori, harga));
    }

    public Kategori getKategori(int i) {
        return listKategori.get(i);
    }
    
    public Mobil getMobil(int i) {
        return listMobil.get(i);
    }

    public ArrayList<Mobil> getListMobil() {
        return listMobil;
    }
    
    public Member getMember(int i) {
        return listMember.get(i);
    }
     
    public void loadMobil() {
        listMobil = (ArrayList<Mobil>) database.loadMobil();
    }
    
    public void saveMobil() {
        database.saveMobil(listMobil);
    }
    
    public void loadKategori() {
        listKategori = (ArrayList<Kategori>) database.loadKategori();
    }
    
    public void saveKategori() {
        database.saveKategori(listKategori);
    }
}
