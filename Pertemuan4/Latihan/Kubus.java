/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Latihan;

/**
 *
 * @author Lenovo
 */
public class Kubus extends BangunRuang {
    private int sisi;

    // Membuat konstruktor
    public Kubus(String nama, int sisi) {
        super(nama);
        this.sisi = sisi;
    }

    // Method untuk menghitung dan mengembalikan nilai volume kubus
    @Override
    public int hitungVolume() {
        return sisi * sisi * sisi;
    }

    // Method untuk menghitung dan mengembalikan nilai luas permukaan kubus
    @Override
    public int hitungLuasPermukaan() {
        return 6 * (sisi * sisi);
    }

    // Method untuk menampilkan detail pada kubus
    @Override
    public String namaBangun() {
        return super.namaBangun() + "\nSisi: " + sisi;
    }
}
