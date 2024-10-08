/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao.impl;

import com.example.constant.LthMobilConstant;
import com.example.repository.LthMobilRepository;
import com.example.vo.LthMobilVo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author godonggedang
 */
@Repository("lthMobilDaoImpl")
public class LthMobilDaoImpl implements LthMobilRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<LthMobilVo> getDataMobil() {
        List<LthMobilVo> result = new ArrayList<>();
        Query query = entityManager.createNativeQuery(LthMobilConstant.GET_DATA_MOBIL);
        List<Object[]> res = query.getResultList();
        if (res != null) {
            for (Object object : res) {
                Object[] obj = (Object[]) object;
                LthMobilVo vo = new LthMobilVo();
                vo.setId((int) obj[0]);
                vo.setPlat((String) obj[1]);
                vo.setMerk((String) obj[2]);
                vo.setWarna((String) obj[3]);
                vo.setPemilik((String) obj[4]);
                vo.setIdUsers((String) obj[5]);

                result.add(vo);
            }

        }

        return result;

    }

    @Override
    public int getTotalDataMobil() {

        Query query = entityManager.createNativeQuery(LthMobilConstant.GET_TOTAL_DATA_MOBIL);

        return ((Number) query.getSingleResult()).intValue();

    }

    @Override
    public int getCheckIdMobil(int id) {
        Query query = entityManager.createNativeQuery(LthMobilConstant.CHECK_ID_MOBIL);
        query.setParameter("id", id);
        
        return ((Number) query.getSingleResult()).intValue();
    }

}
