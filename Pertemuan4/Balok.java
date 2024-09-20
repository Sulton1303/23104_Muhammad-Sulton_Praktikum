/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Lenovo
 */
public class Balok extends BangunRuang {
    private int panjang, lebar, tinggi;

    // Membuat konstruktor
    public Balok(String nama, int panjang, int lebar, int tinggi) {
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    // Method untuk menghitung dan mengembalikan nilai volume balok
    @Override
    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // Method untuk menghitung dan mengembalikan nilai luas permukaan balok
    @Override
    public int hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    // Method untuk menampilkan detail pada balok
    @Override
    public String namaBangun() {
        return super.namaBangun() + "\nPanjang: " + panjang + "\nLebar: " + lebar + "\nTinggi: " + tinggi;
    }
}
