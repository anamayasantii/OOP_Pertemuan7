/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author 2201010156_ Anamaya Santi
 * 06 Mei 2024
 */
public class Pertemuan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        turunan1 a1 = new turunan1();
        
        System.out.println("1. Isi dari variabel nama "+a1.getNAMA());
        a1.setNAMA("I Wayan Putra");
        System.out.println("2. Isi dari variabel nama "+a1.getNAMA());
        
        a1.setNAMA();
        System.out.print("3. Isi dari variabel nama "+a1.getNAMA());
        
        a1.cetakNAMA();
    }
    
}
