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

    // Membuat konstruktor
    public BingoLagu(String nama, String tepukan) {
        this.nama = nama;
        this.tepukan = tepukan;
    }

    // Method untuk menampilkan satu bait lagu
    public void baitLagu(int jmlhTepuk) {
        // output bagian awal
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And " + nama + " was his name-o.");

        // Menampilkan tiga baris tepukan
        for (int i = 0; i < 3; i++) {
            buatBaris(jmlhTepuk);  
        }

        // Output bagian akhir bait lagu
        System.out.println("And " + nama + " was his name-o.\n");
    }

    // Method untuk menghasilkan baris lagu dengan tepukan
    private void buatBaris(int jmlhTepuk) {
        // Jika tidak ada tepukan, langsung mencetak kata Bingo
        if (jmlhTepuk == 0) {
            System.out.println("B-I-N-G-O");
        } else {
            // Tambahkan tepukan sebanyak jmlhTepuk
            for (int i = 0; i < jmlhTepuk; i++) {
                System.out.print(tepukan);
                if (i < jmlhTepuk - 1) {
                    System.out.print("-");
                }
            }

            // Jika jumlah tepukan kurang dari 5, tambahkan sisa huruf
            if (jmlhTepuk == 1) {
                System.out.println("-I-N-G-O");
            } else if (jmlhTepuk == 2) {
                System.out.println("-N-G-O");
            } else if (jmlhTepuk == 3) {
                System.out.println("-G-O");
            } else if (jmlhTepuk == 4) {
                System.out.println("-O");
            } else {
                System.out.println();
            }
        }
    }
}

