/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.service;

import com.example.vo.LthMobilVo;
import java.util.List;

/**
 *
 * @author godonggedang
 */
public interface LthMobilService {
    
    public List<LthMobilVo> getDataMobil();
    
    public int getTotalDataMobil();
    
}
