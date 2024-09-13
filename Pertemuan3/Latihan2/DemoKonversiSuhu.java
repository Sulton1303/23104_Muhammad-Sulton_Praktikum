/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3.Latihan2;

/**
 *
 * @author Lenovo
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek knvrsi
        KonversiSuhu2 knvrsi = new KonversiSuhu2();
        
        knvrsi.setCelciusTemprature(25);
        
        // Memanggil nilai suhu dalam satuan celcius
        System.out.println("Suhu saat ini memiliki nilai : " + knvrsi.getCelciusTemprature() + " derajat celcius");
        
        // Mengonversi nilai suhu dari celcius ke fahrenheit
        System.out.println("Suhu saat ini memiliki nilai : " + knvrsi.celciusToFahrenheit() + " derajat fahrenheit");
        
        // Mengonversi suhu dari celcius ke reamur
        System.out.println("Suhu saat ini memiliki nilai : " + knvrsi.celciusToReamur() + " derajat reamur");
        
        // Mengonversi suhu dari fahrenheit ke reamur
        System.out.println("Suhu saat ini memiliki nilai : " + knvrsi.fahrenheitToReamur(knvrsi.celciusToFahrenheit()) + " derajat reamur");
    }
    
}
