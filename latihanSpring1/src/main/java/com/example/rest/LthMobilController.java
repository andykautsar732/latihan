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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
       
        return lthMobilService.getDataMobil();
    }
    
    @PostMapping("/create-mobil")
    public ResponseEntity<Map<String, Object>> createMobil(@RequestBody LthMobilVo input){
        
        return lthMobilService.createMobil(input);
        
    }
    
    @PostMapping("/update-mobil")
    public ResponseEntity<Map<String, Object>> updateMobil(@RequestBody LthMobilVo input){
        
        return lthMobilService.updateMobil(input);
    }
    
    @PostMapping("/delete-mobil")
    public ResponseEntity<Map<String, Object>> deleteMobil(@RequestBody LthMobilVo input){
        
        return lthMobilService.deleteMobil(input);
    }
}
