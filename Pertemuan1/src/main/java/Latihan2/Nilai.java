/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author Lenovo
 */
public class Nilai {
    String nim, nama;
    int nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS;
    double nilaiAkhir;

    //Membuat method Nilai
    void Nilai(String nim, String nama, int nilaiAbsen, int nilaiTugas, int nilaiUTS, int nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiAkhir = (0.1 * nilaiAbsen) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }
    
    //Membuat method CetakNilai
    void CetakNilai() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Nilai Absen [10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] :" + nilaiTugas);
        System.out.println("Nilai UTS   [30%] :" + nilaiUTS);
        System.out.println("Nilai UAS   [40%] : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}
