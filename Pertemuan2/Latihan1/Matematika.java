/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2.Latihan1;

/**
 *
 * @author Lenovo
 */
public class Matematika implements InterfaceMatematika {
       
    //Membuat method pertamabahan
    @Override
    public int pertambahan(int a, int b) {
        return a + b;
    }
    
    //Membuat method pengurangan 
    @Override
    public int pengurangan(int a, int b) {
        return a - b;
    }
    
    //Membuat method perkalian
    @Override
    public int perkalian(int a, int b) {
        return a * b;
    }
    
    //Membuat method pembagian
    @Override
    public int pembagian(int a, int b) {
        return a / b;
    }


    
    
}
