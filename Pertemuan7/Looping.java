/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author Lenovo
 */
public class Looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // a. Menghitung Deret bilangan prima dan bukan dari 0 – 20
         System.out.println("a. Deret Bilangan Prima dan Bukan Prima dari 0 - 20:");
        int i = 0;
        int angka = 0;

        String bilanganPrima = "";
        String bukanBilanganPrima = "";

        for (i = 0; i <= 20; i++) {
            int pembagi = 0;
            for (angka = i; angka >= 1; angka--) {
                if (i % angka == 0) {
                    pembagi = pembagi + 1;
                }
            }

            if (pembagi == 2) {  // Bilangan prima memiliki tepat 2 faktor
                bilanganPrima = bilanganPrima + i + " ";
            } else {
                bukanBilanganPrima = bukanBilanganPrima + i + " ";
            }
        }

        System.out.println("Bilangan Prima dari 0 - 20 adalah:");
        System.out.println(bilanganPrima);

        System.out.println("Yang Bukan Bilangan Prima dari 0 - 20 adalah:");
        System.out.println(bukanBilanganPrima);
        
        
        // b. Deret bilangan ganjil dan genap
        System.out.println("\nb. Deret Bilangan Ganjil dan Genap dari 0 - 20:");
        int j = 0;
        while (j <= 20) {
            if (j % 2 == 0) {
                System.out.println(j + " adalah bilangan genap");
            } else {
                System.out.println(j + " adalah bilangan ganjil");
            }
            j++;
        }
        
        
        // c. Mengurutkan huruf dari Z-A
        System.out.println("\nc. Huruf Z - A:");
        char huruf = 'Z';
        do {
            System.out.print(huruf + " ");
            huruf--;
        } while (huruf >= 'A');
        System.out.println();
        
        
        // d. Lagu anak ayam
        int anakAyam = 4;  // Mulai dari anak ayam ke-4
        
        System.out.println("\nd. Lagu \"Anak Ayam Turun N\":");
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turunlah berkotek");
        
        while (anakAyam > 0) {
            System.out.println("Anak ayam turunlah " + anakAyam);
            anakAyam--; // Mati satu
            if (anakAyam > 0) {
                System.out.println("Mati satu tinggallah " + anakAyam);
            } else {
                System.out.println("Mati satu tinggallah induknya");
            }
        }
        
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turunlah berkotek");
        System.out.println("Tek kotek, kotek kotek");
        System.out.println("Anak ayam turunlah berkotek");
        
        anakAyam = 2;  // Mulai lagi dari anak ayam ke-2
        while (anakAyam > 0) {
            System.out.println("Anak ayam turunlah " + anakAyam);
            anakAyam--; // Mati satu
            if (anakAyam > 0) {
                System.out.println("Mati satu tinggallah " + anakAyam);
            } else {
                System.out.println("Mati satu tinggallah induknya");
            }
        }
    }
 }
