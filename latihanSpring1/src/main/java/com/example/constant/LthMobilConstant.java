/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.constant;

/**
 *
 * @author godonggedang
 */
public class LthMobilConstant {

    public static final String GET_DATA_MOBIL
            = " select plat, merk, warna, users.nama from mobil \n"
            + " join users on mobil.id_users = users.id; ";
    
    public static final String GET_TOTAL_DATA_MOBIL
            = " select count(*) from mobil join users on mobil.id_users = users.id ";
    
}
