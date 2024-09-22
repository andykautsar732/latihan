/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.service;

import com.example.vo.LthMobilVo;
import java.util.Map;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author godonggedang
 */
public interface LthMobilService {
    
    public ResponseEntity<Map<String, Object>> getDataMobil();
    
    public ResponseEntity<Map<String, Object>> createMobil(LthMobilVo input);
    
}