/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.rest;

import com.example.service.LthService;
import com.example.vo.LthUsersVo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author godonggedang
 */
@RestController
@RequestMapping("/lth")
public class LthUsersController {

    @Autowired
    private LthService lthService;

    @GetMapping("/get-data-users")
    public ResponseEntity<Map<String, Object>> getDataUsers() {
        Map<String, Object> msg = new HashMap<String, Object>();

        try {
            List<LthUsersVo> dataUsers = lthService.getDataUsers();
            int totalUsers = lthService.getTotalDataUsers();

            msg.put("data", dataUsers);
            msg.put("total", totalUsers);

            return ResponseEntity.ok(msg);

        } catch (Exception e) {
            e.printStackTrace();
            msg.put("data", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);
        }

    }

    @PostMapping("/create-users")
    public ResponseEntity<Map<String, Object>> createUsers(@RequestBody LthUsersVo input) {
        return lthService.createUsers(input);
    }
    
    @PostMapping("/update-users")
    public ResponseEntity<Map<String, Object>> updateUsers(@RequestBody LthUsersVo input){
        return lthService.updateUsers(input);
    }

}
