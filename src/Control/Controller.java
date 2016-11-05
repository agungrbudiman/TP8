/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Aplikasi;
import Model.Member;
import Model.Mobil;
import Model.Penyewaan;
import Model.Sewa12Jam;
import Model.Sewa24Jam;
import Model.Sewa6Jam;
import View.View;
import View.ViewLogin;
import View.ViewMenuPenyewaan;
import View.ViewMenuUtama;
import View.ViewRegistrasi;
import View.ViewRiwayatPenyewaan;
import javax.swing.JOptionPane;

/**
 *
 * @author agungrb
 */
public class Controller implements ActionListener {

    private Aplikasi app;
    private View view;
    private Member user;
    
    
    public Controller(Aplikasi app) {
        this.app = app;
        gotoLogin();
    }
    
    private void gotoLogin() {
        ViewLogin x = new ViewLogin();
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    private void gotoMenuUtama() {
        ViewMenuUtama x = new ViewMenuUtama();
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    private void gotoMenuPenyewaan() {
        int i = 0;
        ViewMenuPenyewaan x = new ViewMenuPenyewaan();
        for (Mobil m : app.getListMobil()) {
            x.showMobil(m.getNama(), m.getKategori().getNama(), m.getKategori().getJumlahKursi(), m.getHarga(), i);
            i++;
        }
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    private void gotoRegistrasi() {
        ViewRegistrasi x = new ViewRegistrasi();
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    private void gotoRiwayatPenyewaan() {
        int i = 0;
        ViewRiwayatPenyewaan x = new ViewRiwayatPenyewaan();
        for (Penyewaan p : user.getPenyewaan()) {
            x.showRiwayat(user.getNoMember(), p.getMobil().getNama(), 
                    p.getMobil().getKategori().getNama(),
                    p.getMobil().getKategori().getJumlahKursi(), p.getTotalBiaya(), i);
            i++;
        }
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(view instanceof ViewLogin) {
            ViewLogin x = (ViewLogin) view;
            if(source.equals(x.getBtnLogin())) {
                user = app.cariAkun(x.getTxFieldUsername(), x.getTxFieldPassword());
                if(user != null) {
                    gotoMenuUtama();
                    x.dispose();
                } 
                else {
                    JOptionPane.showMessageDialog(null, "User tidak ditemukan");
                }
            }
            else if(source.equals(x.getBtnRegister())) {
                gotoRegistrasi();
                x.dispose();
            }
        }
        else if(view instanceof ViewRegistrasi) {
            try {
                ViewRegistrasi x = (ViewRegistrasi) view;
                if(source.equals(x.getBtnRegister())) {
                    String nama = x.getTxFieldNama();
                    String username = x.getTxFieldUsername();
                    String psw = x.getTxFieldPassword();
                    String psw2 = x.getTxFieldPassword2();
                    if(!nama.isEmpty() && !username.isEmpty() && !psw.isEmpty() && !psw2.isEmpty()) {
                        if(psw.equals(psw2)) {
                            app.createAkun(nama, username, psw);
                            JOptionPane.showMessageDialog(null, "Registrasi berhasil");
                            gotoLogin();
                            x.dispose();
                        }
                        else {
                           JOptionPane.showMessageDialog(null, "Password tidak sama"); 
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Field tidak boleh kosong");
                    }
                }
                else if(source.equals(x.getBtnKembali())) {
                    gotoLogin();
                    x.dispose();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Registrasi Gagal"); 
            }
            
        }
        else if(view instanceof ViewMenuUtama) {
            ViewMenuUtama x = (ViewMenuUtama) view;
            if(source.equals(x.getBtnPenyewaan())) {
                gotoMenuPenyewaan();
                x.dispose();
            }
            else if(source.equals(x.getBtnRiwayat())) {
                gotoRiwayatPenyewaan();
                x.dispose();
            }
            else if(source.equals(x.getBtnLogout())) {
                user = null;
                gotoLogin();
                x.dispose();
            }
        }
        else if(view instanceof ViewMenuPenyewaan) {
            try {
                ViewMenuPenyewaan x = (ViewMenuPenyewaan) view;
                if(source.equals(x.getBtnSewa())) {
                    user.sewaMobil(x.getLamaSewa(), app.getMobil(x.getMobil()));
                    JOptionPane.showMessageDialog(null, "Penyewaan Berhasil");
                    gotoMenuUtama();
                    x.dispose();
                }
                else if(source.equals(x.getBtnKembali())) {
                    gotoMenuUtama();
                    x.dispose();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Penyewaan Gagal"); 
            }
            
            
        }
        else if(view instanceof ViewRiwayatPenyewaan) {
            ViewRiwayatPenyewaan x = (ViewRiwayatPenyewaan) view;
            if(source.equals(x.getBtnKembali())) {
                gotoMenuUtama();
                x.dispose();
            }
        }
    }
    
}
