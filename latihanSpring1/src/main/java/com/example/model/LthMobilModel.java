/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 *
 * @author godonggedang
 */
@Entity
@Table(name = "mobil")
public class LthMobilModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "plat")
    private String plat;
    
    @Column(name = "merk")
    private String merk;
    
    @Column(name = "warna")
    private String warna;
    
    @Column(name = "pemilik")
    private String pemilik;
    
    @Column(name = "id_users")
    private String idUsers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(String idUsers) {
        this.idUsers = idUsers;
    }
    
    
    
}
