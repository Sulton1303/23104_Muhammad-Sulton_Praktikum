/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan6;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari user
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();

        // Memeriksa apakah nilai n sesuai dengan batasan
        if (n <= 10 && n > 0) {
            // Mencetak tabel perkalian
            System.out.println();
            
            // Mencetak header baris pertama
            for (int i = 1; i <= n; i++) {
                System.out.print("\t" + i);
            }
            System.out.println();
            
            // Mencetak setiap baris tabel perkalian
            for (int i = 1; i <= n; i++) {
                // Mencetak angka di baris pertama (nomor baris)
                System.out.print(i);
                
                // Mencetak hasil perkalian
                for (int j = 1; j <= n; j++) {
                    System.out.print("\t" + (i * j));
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai n harus antara 1 hingga 10.");
        }

        scanner.close();
    }    
}
