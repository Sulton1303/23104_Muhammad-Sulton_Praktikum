/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4.Latihan;

/**
 *
 * @author Lenovo
 */
public class BangunRuang {
    protected String nama;
    
    // Membuat konstruktor
    public BangunRuang(String nama) {
        this.nama = nama;
    }
    
    // Membuat method untuk menampilkan nama pada setiap bangun ruang
    public String namaBangun() {
        return "Nama Bangun Ruang: " + nama;
    }
    
    // Method default untuk menghitung volume
    public int hitungVolume() {
        return 0;
    }

    // Method default untuk menghitung luas permukaan
    public int hitungLuasPermukaan() {
        return 0;
    }
}
