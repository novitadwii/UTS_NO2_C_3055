/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_c_3055;

/**
 *
 * @author User
 * Novita Dwi Sabekti
 * 21103055
 * SI05C
 */

public class UTS_NO2_C_3055 {

    public static void main(String[] args) {
        SalariedEmployee_3055 sal = new SalariedEmployee_3055("Alexandra", "000123", 2000000);
        CommissionEmployee_3055 comm = new CommissionEmployee_3055(500000, 200000, 5, "Melinda", "000345", 0);
        ProjectPlanner_3055 pp = new ProjectPlanner_3055(800000, 100000, 2, "Antonio", "000998", 0);
        
        sal.cetakSalaried_3055();
        comm.hitungGaji_3055();
        comm.cetakCommission();
        pp.hitungGajiPP_3055();
        pp.cetakProjectPlanner_3055();
                
    }
}

