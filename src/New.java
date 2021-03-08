/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author I d e a P a d
 */
public class New {
    int panjang;
    int lebar;
    int tinggi;
    int hasil;
    
    void New (int panjang, int lebar, int tinggi){
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
    }
    int panjang(){
        return panjang;
    }
    int lebar(){
        return lebar;
    }
    int tinggi(){
        return tinggi;
    }
    int hitung (){
        hasil = panjang * lebar * tinggi;
        System.out.println("Volume Balok : "+hasil);
        return hasil;
    }
}