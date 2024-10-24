/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan8;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Toserba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Jumlah maksimal jenis barang(item) 5
        final int MAX_ITEM = 5;

        System.out.println("Masukkan item barang (maksimal 5): ");
        int jumlahItem = input.nextInt();
        
        // Pengkondisian jika jumlah item melebihi 5
        if (jumlahItem > MAX_ITEM) {
            System.out.println("Jumlah item barang tidak boleh lebih dari 5. Silakan coba lagi.");
            return;
        }
        
        // Membuat array untuk menyimpan data jenis barang(item)
        String[][] items = new String[jumlahItem][5];
        
        // Membuat kode untuk kode barang, nama barang, dan harga barang
        String[] kodeBarang   = {"a001", "a002", "a003", "a004", "a005"};
        String[] namaBarang   = {"Buku", "Pensil", "Pulpen", "Penggaris", "Penghapus"};
        int[] hargaBarang     = {3000, 4000, 5000, 2000, 1000};
        
        // Memasukkan setiap data dari jenis-jenis barang(item) menggunakan konsep looping
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            
            // Memasukkan kode barang
            System.out.print("Masukkan Kode: ");
            String kode = input.next();
            items[i][0] = kode;
            
            // Mencari index dari kodeBarang untuk mendapatkan nama dan harga barang
            int index = -1;
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarang[j].equals(kode)) {
                    index = j;
                    break;
                }
            }
            
            // Menyimpan nama barang dan harga yang sesuai
            if (index != -1) {
                items[i][1] = namaBarang[index];
                items[i][2] = String.valueOf(hargaBarang[index]);
            } else {
                System.out.println("Kode barang tidak ditemukan.");
                i--;
                continue;
            }
            
            // Memasukkan jumlah pembelian yang diminta oleh user
            System.out.print("Masukkan jumlah Beli: ");
            int jumlahBeli = input.nextInt();
            items[i][3] = String.valueOf(jumlahBeli);
            
            // Menghitung total pembayaran dari barang yang ingin dibeli
            int totalBayar = hargaBarang[index] * jumlahBeli;
            items[i][4] = String.valueOf(totalBayar);
        }
            
        // Menampilkan struk pembayaran
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*******************************************");
        System.out.println("No  Kode Barang  Nama Barang   Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("===============================================================");
        
        int totalSeluruhPembayaran = 0;
        for (int i = 0; i < jumlahItem; i++) {
            System.out.print((i + 1) + "   ");
            System.out.print(items[i][0] + "        ");
            System.out.print(items[i][1] + "       ");
            System.out.print(items[i][2] + "      ");
            System.out.print(items[i][3] + "             ");
            System.out.println(items[i][4]);
        
            totalSeluruhPembayaran += Integer.parseInt(items[i][4]);
        }
        
        System.out.println("===============================================================");
        System.out.println("Total Bayar                      " + totalSeluruhPembayaran);   
    }
}
