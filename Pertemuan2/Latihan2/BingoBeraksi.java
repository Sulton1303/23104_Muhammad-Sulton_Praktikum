/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2.Latihan2;

/**
 *
 * @author Lenovo
 */
public class BingoBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek bingo
        BingoLagu bingo = new BingoLagu("Bingo", "(clap)");

        // Tampilkan semua bait
        for (int i = 0; i <= 5; i++) {
            bingo.baitLagu(i);
        }
    }
    
}
