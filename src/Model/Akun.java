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
public abstract class Akun {
    private String nama;
    private String username;
    private String passwword;

    public Akun(String nama, String username, String passwword) {
        this.nama = nama;
        this.username = username;
        this.passwword = passwword;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswword() {
        return passwword;
    }

    public void setPasswword(String passwword) {
        this.passwword = passwword;
    }
    
    
}
