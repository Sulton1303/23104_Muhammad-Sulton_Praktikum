/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Lenovo
 */
public class BalokKubusBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        // Membuat objek balok
        Balok balok = new Balok("Balok", 4, 3, 2);
        // Membuat kubus
        Kubus kubus = new Kubus("Kubus", 3);

        // Menampilkan hasil perhitungan balok
        System.out.println("Data Balok : \n" + balok.namaBangun());
        System.out.println("Volume Balok : " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok : " + balok.hitungLuasPermukaan());

        System.out.println("\n-------------------------------\n");

        // Menampilkan hasil perhitungan kubus
        System.out.println("Data Kubus : \n" + kubus.namaBangun());
        System.out.println("Volume Kubus : " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus : " + kubus.hitungLuasPermukaan());
    }
}
