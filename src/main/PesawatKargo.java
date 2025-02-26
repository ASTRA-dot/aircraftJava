/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author nx
 */
public class PesawatKargo extends Pesawat implements FiturTambahan {
    private double cargoCapacity;
    private boolean modeKhusus;
    
    public PesawatKargo(String merk, String model, String tahunProduksi, double cargoCapacity){
        super(merk, model, tahunProduksi);
        this.cargoCapacity = cargoCapacity;
        this.modeKhusus = false;        
    }
    
    @Override
    public void info(){
        System.out.println("Pesawat Kargo " + merk + " " + model + " (Tahun: " + tahunProduksi + "), " +
                "Kapasitas Kargo: " + cargoCapacity + " ton");
    }

    @Override
    public void terbang() {
        System.out.println("Pesawat Kargo " + merk + " " + model + " sedang terbang dengan muatan berat.");
    }

    @Override
    public void mendarat() {
        System.out.println("Pesawat Kargo " + merk + " " + model + " sedang mendarat di bandara kargo.");
    }

    @Override
    public void modeKhususOn() {
        modeKhusus = true;
        System.out.println("Mode khusus pesawat kargo diaktifkan: Pengiriman darurat.");
    }

    @Override
    public void modeKhususOff() {
        modeKhusus = false;
        System.out.println("Mode khusus pesawat kargo dimatikan.");
    }

    @Override
    public void cekModeKhusus() {
        String status = modeKhusus ? "aktif" : "non-aktif";
        System.out.println("Status mode khusus: " + status);
    }
}
    
