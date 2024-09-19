/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.repository;

import com.example.vo.LthUsersVo;
import java.util.List;

/**
 *
 * @author godonggedang
 */
public interface LthUsersRepository {

    public List<LthUsersVo> getDataUsers();

    public int getTotalDataUsers();
    
    public String CheckEmail(String email);

}
