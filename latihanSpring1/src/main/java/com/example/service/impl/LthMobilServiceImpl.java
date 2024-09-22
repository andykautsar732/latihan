/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.impl;

import com.example.dao.impl.LthMobilDaoImpl;
import com.example.service.LthMobilService;
import com.example.vo.LthMobilVo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author godonggedang
 */
@Service("lthMobilService")
@Transactional(readOnly = true)
public class LthMobilServiceImpl implements LthMobilService{
    
    @Autowired
    private LthMobilDaoImpl lthMobilDaoImpl;

    @Override
    public ResponseEntity<Map<String, Object>> getDataMobil() {
        
       Map<String, Object> msg = new HashMap<>();
        
        try{
            
            List<LthMobilVo> dataMobil = lthMobilDaoImpl.getDataMobil();
            int totalDataMobil = lthMobilDaoImpl.getTotalDataMobil();
            
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
