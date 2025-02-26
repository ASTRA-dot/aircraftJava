/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author nx
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari setiap subclass
        PesawatKomersial pesawatKomersial = new PesawatKomersial("Boeing", "737", "2020", 200);
        PesawatTempur pesawatTempur = new PesawatTempur("Lockheed Martin", "F-22", "2015", "Rudal");
        PesawatKargo pesawatKargo = new PesawatKargo("Antonov", "An-225", "1988", 250);

        // Menggunakan metode dari abstract class dan interface
        Pesawat[] pesawatArray = {pesawatKomersial, pesawatTempur, pesawatKargo};
        for (Pesawat pesawat : pesawatArray) {
            pesawat.info();
            pesawat.terbang();
            pesawat.mendarat();
            ((FiturTambahan) pesawat).modeKhususOn();
            ((FiturTambahan) pesawat).cekModeKhusus();
            ((FiturTambahan) pesawat).modeKhususOff();
            ((FiturTambahan) pesawat).cekModeKhusus();
            pesawat.perbaikan();
            System.out.println();
        }
    }
}
}
