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
public class Sewa24Jam implements StrategiPenyewaan {
    public double kalkulasiBiaya(long biaya) {
        return biaya*3-(biaya*0.2*3);
    }
}
