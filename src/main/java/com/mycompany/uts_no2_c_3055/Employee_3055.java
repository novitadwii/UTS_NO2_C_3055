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

public class Employee_3055 {
    protected String nama_3055, nip_3055;
    protected double gaji_3055;
    
    public Employee_3055(){
        
    }

    public Employee_3055(String nama_3055, String nip_3055, int gaji_3055) {
        this.nama_3055 = nama_3055;
        this.nip_3055 = nip_3055;
        this.gaji_3055 = gaji_3055;
    }
    
    public void cetakEmployee_3055(){
        System.out.println("");
        System.out.println("Nama Karyaman   : "+ nama_3055);
        System.out.println("NIP             : "+ nip_3055);
    }
}
