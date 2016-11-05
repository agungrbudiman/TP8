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
public class Sewa12Jam implements StrategiPenyewaan {
    public double kalkulasiBiaya(long biaya) {
        return biaya*2-(biaya*0.1*2);
    }
}
