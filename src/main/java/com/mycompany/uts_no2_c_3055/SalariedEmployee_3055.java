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

public class SalariedEmployee_3055 extends Employee_3055 {
    private double upahMingguan_3055;

    public SalariedEmployee_3055(String nama_3055, String nip_3055, int gaji_3055) {
        super(nama_3055, nip_3055, gaji_3055);
        this.upahMingguan_3055 = gaji_3055;
    }
    
    public void cetakSalaried_3055(){
    super.cetakEmployee_3055();
    System.out.println("Upah Mingguan   : " + upahMingguan_3055);
        
    }
}
