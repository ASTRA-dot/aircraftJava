/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author nx
 */
public class PesawatKomersial extends Pesawat implements FiturTambahan {
    private int passangerCapacity;
    private boolean modeKhusus;
    
    public PesawatKomersial(String merk, String model, String tahunProduksi, int passengerCapacity){
        
        super(merk, model, tahunProduksi);
        this.passangerCapacity = passengerCapacity;
        this.modeKhusus = false;
    }
    @Override
    public void info() {
        System.out.println("Pesawat Komersial " + merk + " " + model + " (Tahun: " + tahunProduksi + "), " +
                "Kapasitas Penumpang: " + passangerCapacity);
    }

    @Override
    public void terbang() {
        System.out.println("Pesawat Komersial " + merk + " " + model + " sedang terbang dengan penumpang.");
    }

    @Override
    public void mendarat() {
        System.out.println("Pesawat Komersial " + merk + " " + model + " sedang mendarat di bandara.");
    }

    @Override
    public void modeKhususOn() {
        modeKhusus = true;
        System.out.println("Mode khusus pesawat komersial diaktifkan: Penerbangan jarak jauh.");
    }

    @Override
    public void modeKhususOff() {
        modeKhusus = false;
        System.out.println("Mode khusus pesawat komersial dimatikan.");
    }

    @Override
    public void cekModeKhusus() {
        String status = modeKhusus ? "aktif" : "non-aktif";
        System.out.println("Status mode khusus: " + status);
    }
}
    

