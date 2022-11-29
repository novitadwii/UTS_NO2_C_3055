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

public class ProjectPlanner_3055 extends Employee_3055 {
    private double gajiPokok_3055, komisi_3055, totalHasilProyek_3055, pajak_3055;

    public ProjectPlanner_3055(double gajiPokok_3055, double komisi_3055, double totalHasilProyek_3055, String nama_3055, String nip_3055, int gaji_3055) {
        super(nama_3055, nip_3055, gaji_3055);
        this.gajiPokok_3055 = gajiPokok_3055;
        this.komisi_3055 = komisi_3055;
        this.totalHasilProyek_3055 = totalHasilProyek_3055;
    }
    
    public double hitungGajiPP_3055(){
        pajak_3055 = gajiPokok_3055 * 0.05;
        gaji_3055 = gajiPokok_3055 + (komisi_3055 + totalHasilProyek_3055) - pajak_3055;
        return gaji_3055;
    }
    
    public void cetakProjectPlanner_3055(){
        super.cetakEmployee_3055();
        System.out.println("Total Gaji Project Planner  : " + gaji_3055);
    }
}
