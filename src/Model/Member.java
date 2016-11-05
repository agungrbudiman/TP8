/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author agungrb
 */
public class Member extends Akun {
    private String noMember;
    private ArrayList<Penyewaan> penyewaan;

    public Member(String nama, String username, String passwword, int number) {
        super(nama, username, passwword);
        this.noMember = "MEM-" + number;
        penyewaan = new ArrayList<Penyewaan>();
    }
    
    public void sewaMobil(int durasiSewa, Mobil mobil) {
        penyewaan.add(new Penyewaan(durasiSewa, mobil));
    }

    public ArrayList<Penyewaan> getPenyewaan() {
        return penyewaan;
    }

    public String getNoMember() {
        return noMember;
    }

    public void setNoMember(String noMember) {
        this.noMember = noMember;
    }
      
}
