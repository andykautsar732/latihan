/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.impl;

import com.example.dao.LthMobilDao;
import com.example.dao.impl.LthMobilDaoImpl;
import com.example.model.LthMobilModel;
import com.example.service.LthMobilService;
import com.example.vo.LthMobilVo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author godonggedang
 */
@Service("lthMobilService")
public class LthMobilServiceImpl implements LthMobilService {

    @Autowired
    private LthMobilDaoImpl lthMobilDaoImpl;

    @Autowired
    private LthMobilDao lthMobilDao;

    @Override
    public ResponseEntity<Map<String, Object>> getDataMobil() {

        Map<String, Object> msg = new HashMap<>();

        try {

            List<LthMobilVo> dataMobil = lthMobilDaoImpl.getDataMobil();
            int totalDataMobil = lthMobilDaoImpl.getTotalDataMobil();

            msg.put("data", dataMobil);
            msg.put("total", totalDataMobil);

            return ResponseEntity.ok(msg);

        } catch (Exception e) {
            e.printStackTrace();
            msg.put("error", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);

        }

    }

    @Override
    public ResponseEntity<Map<String, Object>> createMobil(LthMobilVo input) {

        Map<String, Object> msg = new HashMap<>();
        try {
            LthMobilModel lthMobilModel = new LthMobilModel();

            if (input.getMerk() == null || input.getMerk().equals("")) {
                msg.put("msg", "merk mobil tidak boleh kosong");
                return ResponseEntity.badRequest().body(msg);
            }
            if (input.getPlat() == null || input.getPlat().equals("")) {
                msg.put("msg", "plat mobil tidak boleh kosong");
                return ResponseEntity.badRequest().body(msg);
            }
            if (input.getWarna() == null || input.getWarna().equals("")) {
                msg.put("msg", "warna mobil tidak boleh kosong");
                return ResponseEntity.badRequest().body(msg);
            }

            lthMobilModel.setMerk(input.getMerk());
            lthMobilModel.setPlat(input.getPlat());
            lthMobilModel.setWarna(input.getWarna());
            lthMobilModel.setIdUsers(input.getIdUsers());
            lthMobilDao.save(lthMobilModel);

            msg.put("msg", "sukses menyimpan data mobil baru");
            return ResponseEntity.ok(msg);

        } catch (Exception e) {
            e.printStackTrace();;
            msg.put("msg", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);
        }

    }

    @Override
    public ResponseEntity<Map<String, Object>> updateMobil(LthMobilVo input) {

        Map<String, Object> msg = new HashMap<>();

        int checkIdMobil = lthMobilDaoImpl.getCheckIdMobil(input.getId());
        try {
            if (checkIdMobil == 0) {
                msg.put("msg", "cek kembali data mobil yang akan di update");
                return ResponseEntity.badRequest().body(msg);
            }

            LthMobilModel lthMobilModel = new LthMobilModel();
            lthMobilModel.setId(input.getId());
            lthMobilModel.setMerk(input.getMerk());
            lthMobilModel.setPlat(input.getPlat());
            lthMobilModel.setWarna(input.getWarna());
            lthMobilModel.setIdUsers(input.getIdUsers());
            lthMobilDao.save(lthMobilModel);

            msg.put("msg", "sukses data berhasil diupdate");
            return ResponseEntity.ok(msg);

        } catch (Exception e) {
            e.printStackTrace();
            msg.put("msg", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);
        }
    }

    @Override
    public ResponseEntity<Map<String, Object>> deleteMobil(LthMobilVo input) {
        
       Map<String, Object> msg = new HashMap<>();
       int checkIdMobil = lthMobilDaoImpl.getCheckIdMobil(input.getId());
       
       try{
           
           if(checkIdMobil == 0){
               msg.put("msg", "periksa kembali data yang akan di hapus");
               return ResponseEntity.badRequest().body(msg);
           }
           
           lthMobilDao.deleteById(input.getId());
           
           msg.put("msg", "sukses menghapus data mobil");
           return ResponseEntity.ok(msg);
           
       }catch(Exception e){
           e.printStackTrace();
           msg.put("msg", e.getMessage());
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);
       }

    }

}
