/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.rest;

import com.example.service.LthMobilService;
import com.example.vo.LthMobilVo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author godonggedang
 */
@RestController
@RequestMapping("/lth")
public class LthMobilController {
    
    
    @Autowired
    private LthMobilService lthMobilService;
    
    @GetMapping("/get-data-mobil")
    public ResponseEntity<Map<String, Object>> getDataMobil(){
        Map<String, Object> msg = new HashMap<>();
        
        try{
            
            List<LthMobilVo> dataMobil = lthMobilService.getDataMobil();
            int totalDataMobil = lthMobilService.getTotalDataMobil();
            
            msg.put("data", dataMobil);
            msg.put("total", totalDataMobil);
            
            return ResponseEntity.ok(msg);
            
        }catch(Exception e){
            e.printStackTrace();
            msg.put("error", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);
            
        }
    }
    
}
