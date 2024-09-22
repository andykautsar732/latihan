/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.impl;

import com.example.dao.LthServiceDao;
import com.example.dao.impl.LthServiceDaoImpl;
import com.example.model.LthUsersModel;
import com.example.service.LthService;
import com.example.vo.LthUsersVo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author godonggedang
 */
@Service("lthService")
public class LthUsersServiceImpl implements LthService {

    @Autowired
    private LthServiceDaoImpl lthServiceDaoImpl;

    @Autowired
    private LthServiceDao lthServiceDao;

    @Override
    public List<LthUsersVo> getDataUsers() {

        return lthServiceDaoImpl.getDataUsers();

    }

    @Override
    public int getTotalDataUsers() {

        return lthServiceDaoImpl.getTotalDataUsers();
    }

    @Override
    public ResponseEntity<Map<String, Object>> createUsers(LthUsersVo input) {

        Map<String, Object> msg = new HashMap<>();

        try {
            String checkEmail = lthServiceDaoImpl.CheckEmail(input.getEmail());

            if (checkEmail != null) {
                msg.put("msg", "email sudah terdaftar, mohon cek kembali");
                return ResponseEntity.badRequest().body(msg);
            }
            if (input.getEmail() == null || input.getEmail().equals("")) {
                msg.put("msg", "email wajib diisi, tidak boleh kosong");
                return ResponseEntity.badRequest().body(msg);
            }
            if (input.getNama() == null || input.getNama().equals("")) {
                msg.put("msg", "nama wajib diisi, tidak boleh kosong");
                return ResponseEntity.badRequest().body(msg);
            }
            if (input.getAlamat() == null || input.getAlamat().equals("")) {
                msg.put("msg", "alamat wajib diisi, tidak boleh kosong");
                return ResponseEntity.badRequest().body(msg);
            }
            if (input.getPassword() == null || input.getPassword().equals("")) {
                msg.put("msg", "password wajib diisi, tidak boleh kosong");
                return ResponseEntity.badRequest().body(msg);
            }

            LthUsersModel lthUsersModel = new LthUsersModel();
            UUID idUsers = UUID.randomUUID();
            lthUsersModel.setId(idUsers.toString());
            lthUsersModel.setNama(input.getNama());
            lthUsersModel.setEmail(input.getEmail());
            lthUsersModel.setAlamat(input.getAlamat());
            lthUsersModel.setPassword(input.getPassword());
            lthServiceDao.save(lthUsersModel);

            msg.put("msg", "sukses menyimpan data");
            return ResponseEntity.ok(msg);

        } catch (Exception e) {
            e.printStackTrace();
            msg.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);
        }

    }

    @Override
    public ResponseEntity<Map<String, Object>> updateUsers(LthUsersVo input) {
        Map<String, Object> msg = new HashMap<>();
        String checkIdUsers = lthServiceDaoImpl.CheckIdUsers(input.getId());
        try {
            LthUsersModel lthUsersModel = new LthUsersModel();

            if (checkIdUsers == null || checkIdUsers.equals("")) {
                msg.put("msg", "tidak dapat ubah data, mohon periksa kembali!");
                return ResponseEntity.badRequest().body(msg);
            }
            lthUsersModel.setId(input.getId());
            lthUsersModel.setEmail(input.getEmail());
            lthUsersModel.setNama(input.getNama());
            lthUsersModel.setEmail(input.getEmail());
            lthUsersModel.setAlamat(input.getAlamat());
            lthUsersModel.setPassword(input.getPassword());
            lthServiceDao.save(lthUsersModel);

            msg.put("msg", "sukses ubah data ");
            return ResponseEntity.ok(msg);

        } catch (Exception e) {
            e.printStackTrace();
            msg.put("msg", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);
        }
    }

    @Override
    public ResponseEntity<Map<String, Object>> deleteUsers(LthUsersVo input) {
        
        Map<String, Object> msg = new HashMap<>();
        String checkIdUsers = lthServiceDaoImpl.CheckIdUsers(input.getId());
        try{
            
            if (checkIdUsers == null || checkIdUsers.equals("")) {
                msg.put("msg", "tidak dapat ubah data, mohon periksa kembali!");
                return ResponseEntity.badRequest().body(msg);
            }
            
           lthServiceDao.deleteById(input.getId());
           
           msg.put("msg", "sukses menghapus data");
           return ResponseEntity.ok(msg);
            
        }catch(Exception e){
            e.printStackTrace();
            msg.put("msg", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);
            
        }

    }

}
