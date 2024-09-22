/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao.impl;

import com.example.constant.LthUsersConstant;
import com.example.repository.LthUsersRepository;
import com.example.vo.LthUsersVo;
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
@Repository("LthServiceDaoImpl")
public class LthServiceDaoImpl implements LthUsersRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<LthUsersVo> getDataUsers() {
        List<LthUsersVo> results = new ArrayList<>();
        Query query = entityManager.createNativeQuery(LthUsersConstant.GET_ALL_DATA_USERS);
        List<Object[]> res = query.getResultList();
        if (res != null) {
            for (Object object : res) {
                Object[] obj = (Object[]) object;
                LthUsersVo vo = new LthUsersVo();
                vo.setId((String) obj[0]);
                vo.setNama((String) obj[1]);
                vo.setEmail((String) obj[2]);
                vo.setPassword((String) obj[3]);
                vo.setAlamat((String) obj[4]);

                results.add(vo);
            }
        }

        return results;
    }

    @Override
    public int getTotalDataUsers() {

        Query query = entityManager.createNativeQuery(LthUsersConstant.GET_TOTAL_ALL_DATA_USERS);

        return ((Number) query.getSingleResult()).intValue();

    }

    @Override
    public String CheckEmail(String email) {
        Query query = entityManager.createNativeQuery(LthUsersConstant.CHECK_EMAIL);
        query.setParameter("email", email);
        List<String> result = query.getResultList();

        return result.isEmpty() ? null : result.get(0);
    }

    @Override
    public String CheckIdUsers(String id) {
       Query query = entityManager.createNativeQuery(LthUsersConstant.CHECK_ID_USERS);
       query.setParameter("id", id);
       List<String> result = query.getResultList();
       
       return result.isEmpty() ? null : result.get(0);
    }

}
