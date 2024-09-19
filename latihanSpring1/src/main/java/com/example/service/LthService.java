/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.service;

import com.example.vo.LthUsersVo;
import java.util.List;

/**
 *
 * @author godonggedang
 */
public interface LthService {
    
   public List<LthUsersVo> getDataUsers();
   
   public int getTotalDataUsers();
}
