/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.dao;

import com.example.model.LthMobilModel;
import com.example.repository.LthMobilRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author godonggedang
 */
public interface LthMobilDao extends JpaRepository<LthMobilModel, Integer>, LthMobilRepository{
    
}
