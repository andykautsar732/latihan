/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.constant;

/**
 *
 * @author godonggedang
 */
public class LthUsersConstant {
    
    public static final String GET_ALL_DATA_USERS = 
            " SELECT NAMA as nama, EMAIL as email, PASSWORD as password FROM USERS";
    
    public static final String GET_TOTAL_ALL_DATA_USERS = 
            "SELECT COUNT(*) FROM USERS";
    
}
