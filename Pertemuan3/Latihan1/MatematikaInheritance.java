/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3.Latihan1;

/**
 *
 * @author Lenovo
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika2 matematika = new Matematika2();
        
        int hasilTambah = matematika.pertambahan(13, 25 );
        int hasilKurang = matematika.pengurangan(100, 30);
        int hasilKali = matematika.perkalian(25, 4);
        int hasilBagi = matematika.pembagian(20, 5);
        int sisaBagi = matematika.modulus(50, 3);
        
        System.out.println("Hasil pertambahan dari 13 + 25 = " + hasilTambah);
        System.out.println("Hasil pengurangan dari 100 - 30 = " + hasilKurang);
        System.out.println("Hasil perkalian dari 25 x 4 = " + hasilKali);
        System.out.println("Hasil pembagian dari 20 / 5 = " + hasilBagi);
        System.out.println("Sisa bagi dari 50 / 3 = " + sisaBagi);
    }
    
}
