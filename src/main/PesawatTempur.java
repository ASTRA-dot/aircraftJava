/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author nx
 */
public class PesawatTempur extends Pesawat implements FiturTambahan{
       private String senjata;
       private boolean modeKhusus;
       
       public PesawatTempur(String merk, String model, String tahunProduksi, String senjata){
           super(merk, model, tahunProduksi);
           this.senjata = senjata;
           this.modeKhusus = false;
       }
    
     @Override
    public void info() {
        System.out.println("Pesawat Tempur " + merk + " " + model + " (Tahun: " + tahunProduksi + "), " +
                "Senjata: " + senjata);
    }

    @Override
    public void terbang() {
        System.out.println("Pesawat Tempur " + merk + " " + model + " sedang terbang dengan kecepatan tinggi.");
    }

    @Override
    public void mendarat() {
        System.out.println("Pesawat Tempur " + merk + " " + model + " sedang mendarat di pangkalan militer.");
    }

    @Override
    public void modeKhususOn() {
        modeKhusus = true;
        System.out.println("Mode khusus pesawat tempur diaktifkan: Mode pertempuran.");
    }

    @Override
    public void modeKhususOff() {
        modeKhusus = false;
        System.out.println("Mode khusus pesawat tempur dimatikan.");
    }

    @Override
    public void cekModeKhusus() {
        String status = modeKhusus ? "aktif" : "non-aktif";
        System.out.println("Status mode khusus: " + status);
    }
}