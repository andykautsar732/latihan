/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.impl;

import com.example.dao.impl.LthServiceDaoImpl;
import com.example.service.LthService;
import com.example.vo.LthUsersVo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author godonggedang
 */
@Service("lthService")
@Transactional(readOnly = true)
public class LthUsersServiceImpl implements LthService{
    
    @Autowired
    private LthServiceDaoImpl lthServiceDaoImpl;

    @Override
    public List<LthUsersVo> getDataUsers() {
        
       return lthServiceDaoImpl.getDataUsers();
        
    }

    @Override
    public int getTotalDataUsers() {
        
        return lthServiceDaoImpl.getTotalDataUsers();
    }
    
    
}
