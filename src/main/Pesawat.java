/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author nx
 */
public abstract class Pesawat {
    protected String merk;
    protected String model;
    protected String tahunProduksi;
    
    public Pesawat(String merk, String model, String tahunProduksi){
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }


public abstract void info();
public abstract void terbang();
public abstract void mendarat();

public void perbaikan(){
    System.out.println("Pesawat " + merk + " " + model + " sedang diperbaiki..");
    }
}