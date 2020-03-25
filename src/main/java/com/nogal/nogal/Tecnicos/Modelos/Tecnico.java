package com.nogal.nogal.Tecnicos.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tecnico")
public class Tecnico{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_tecnico")
    private long id;

    @Column(name="tecnico_name")
    private String tecnicoName;

    @Column(name="password")
    private String password;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="active")
    private boolean active = true;

    @Column(name="especialidad")
    private String especialidad;

    public Tecnico(){
        
    }

    public Tecnico(long id, String tecnicoName, String password, String nombre, String apellido, boolean active, String especialidad) {
        this.id = id;
        this.tecnicoName = tecnicoName;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.active = active;
        this.especialidad = especialidad;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTecnicoName() {
        return this.tecnicoName;
    }

    public void setTecnicoName(String tecnicoName) {
        this.tecnicoName = tecnicoName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getEspecialidad(){
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
}