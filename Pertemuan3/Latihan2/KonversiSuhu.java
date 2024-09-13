/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3.Latihan2;

/**
 *
 * @author Lenovo
 */
public class KonversiSuhu {
    // Membuat access modifier private pada instance variable
    private double celciusTemprature;
    
    // Membuat getter untuk suhu celcius
    public double getCelciusTemprature(){
        return celciusTemprature;
    }
    
    //Membuat setter untuk suhu celcius
    public void setCelciusTemprature(int celciusTemprature){
        this.celciusTemprature = celciusTemprature;
    }
    
    // Membuat method celciusToFahrenheit
    public double celciusToFahrenheit(){
        return (celciusTemprature * 9/5) + 32;
    }
    
    // Membuat method celciusToReamur
    public double celciusToReamur(){
        return celciusTemprature * 4/5;
    }
}
