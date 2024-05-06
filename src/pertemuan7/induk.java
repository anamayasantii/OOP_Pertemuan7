/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author LAB F
 * 06 Mei 2024
 */
public class induk {
    private String nama;
    public int nilai=0;
    
    public void setNAMA(String nVAL){
        nama = nVAL;
            this.nama = nVAL;
    }
    public void setNAMA(){
        this.nama = "Siapa ya?";
    }
    public String getNAMA(){
        return this.nama;
    }
    public void cetakNAMA(){
        System.out.printf("Isi variabel nama: %s dengan tinggi badan %d\n\n",this.nama,this.nilai);
    }
}
