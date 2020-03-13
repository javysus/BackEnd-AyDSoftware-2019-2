package com.ayudantia.demo.HLTV.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="USUARIO")
@Entity
public class Usuario{
    @Id
    @GenericGenerator(name="incrementusuario", strategy="increment")
    @GeneratedValue(generator="incrementusuario")
    @Column(name="id_usuario")
    long id;

    @Column(name="nombre")
    String nombre;
    
    public Usuario(){

    }

    public Usuario(long id, String nombre) {
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