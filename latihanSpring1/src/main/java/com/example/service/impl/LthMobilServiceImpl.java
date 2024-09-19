/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.impl;

import com.example.dao.impl.LthMobilDaoImpl;
import com.example.service.LthMobilService;
import com.example.vo.LthMobilVo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<LthMobilVo> getDataMobil() {
        
        return lthMobilDaoImpl.getDataMobil();
        
    }

    @Override
    public int getTotalDataMobil() {
        
        return lthMobilDaoImpl.getTotalDataMobil();
    }
    
}
