/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3055;

/**
 *
 * @author User
 * Novita Dwi Sabekti
 * 21103055
 * SI05C
 */

public class CommissionEmployee_3055 extends Employee_3055 {
    private double gajiPokok_3055, komisi_3055, totalPenjualan_3055;

    public CommissionEmployee_3055(double gajiPokok_3055, double komisi_3055, double totalPenjualan_3055, String nama_3055, String nip_3055, int gaji_3055) {
        super(nama_3055, nip_3055, gaji_3055);
        this.gajiPokok_3055 = gajiPokok_3055;
        this.komisi_3055 = komisi_3055;
        this.totalPenjualan_3055 = totalPenjualan_3055;
    }
    
    public double hitungGaji_3055(){
        gaji_3055 = gajiPokok_3055 + (komisi_3055 * totalPenjualan_3055);
        return gaji_3055;
    }
    
    public void cetakCommission(){
        super.cetakEmployee_3055();
        System.out.println("Total Gaji  : " + gaji_3055);
    }
}
