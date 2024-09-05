/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2.Latihan2;

/**
 *
 * @author Lenovo
 */
public class BingoLagu {
    private String nama;
    private String tepukan;

    //Membuat konstruktor
    public BingoLagu(String nama, String tepukan) {
        this.nama = nama;
        this.tepukan = tepukan;
    }

    //Method untuk menampilkan satu bait lagu
    public void baitLagu(int jmlhTepuk) {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And " + nama + " was his name-o.");
        for (int i = 0; i < 3; i++) {
            System.out.println(buatBaris(jmlhTepuk));
        }
        System.out.println("And " + nama + " was his name-o.\n");
    }

    // Method untuk menghasilkan baris lagu dengan tepukan
    private String buatBaris(int jmlhTepuk) {
                String line = "";

        // Pengkondisian jika tidak ada 
        if (jmlhTepuk == 0) {
            line = "B-I-N-G-O";
        } else {
            // Tambahkan tepukan sebanyak jmlhTepuk
            for (int i = 0; i < jmlhTepuk; i++) {
                line += tepukan;
                if (i < jmlhTepuk - 1) {
                    line += "-";
                }
            }
            // Jika jumlah tepukan kurang dari 5, tambahkan sisa huruf
            if (jmlhTepuk < 5) {
                line += "-" + "B-I-N-G-O".substring(jmlhTepuk * 2);
            }
        }
        return line;
    }
}

