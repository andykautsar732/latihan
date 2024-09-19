/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 *
 * @author godonggedang
 */
@Entity
@Table(name = "users")
public class LthUsersModel {
    
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "nama")
    private String nama;
    
    @Column(name = "password")
    private String passowrd;
    
    @Column(name = "alamat")
    private String alamat;

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
