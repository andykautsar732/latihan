/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.service;

import com.example.vo.LthUsersVo;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author godonggedang
 */
public interface LthService {
    
   public ResponseEntity<Map<String, Object>> getDataUsers();
   
   public int getTotalDataUsers();
   
   public ResponseEntity<Map<String, Object>> createUsers(LthUsersVo input);
   
   public ResponseEntity<Map<String, Object>> updateUsers(LthUsersVo input);
   
   public ResponseEntity<Map<String, Object>> deleteUsers(LthUsersVo input);
}
