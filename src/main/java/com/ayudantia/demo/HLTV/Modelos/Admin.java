package com.ayudantia.demo.HLTV.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="ADMINISTRADOR")
@Entity
public class Admin{
    @Id
    @GenericGenerator(name="incrementadmin", strategy="increment")
    @GeneratedValue(generator="incrementadmin")
    @Column(name="id_admin")
    long id;
    
    @Column(name="nombre")
    String nombre;

    public Admin(){

    }

    public Admin(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}