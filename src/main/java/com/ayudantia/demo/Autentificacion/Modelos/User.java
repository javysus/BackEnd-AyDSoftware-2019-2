package com.ayudantia.demo.Autentificacion.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_usuario")
    private long id;

    @Column(name="nombre")
    private String userName;

    @Column(name="password")
    private String password;

    public User(){
        
    }

    public User(long id, String userName, String password, boolean active, String roles) {
        this.id = id;
        this.userName = userName;
        this.password = password;

    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}