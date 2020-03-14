package com.nogal.nogal.Solicitudes.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

@Entity
@Table(name="solicitud")
public class Solicitud{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_solicitud")
    private long id;

    @Column(name="id_tecnico")
    private long tecnico;

    @Column(name="id_usuario")
    private long cliente;

    @Column(name="monto")
    private long monto;

    @Column(name="direccion")
    private String direccion;

    @Column(name="latitud")
    private float latitud;

    @Column(name="longitud")
    private float longitud;

    @Column(name="aceptada_cli")
    private boolean aceptada_cli = false;

    @Column(name = "aceptada_adm")
    private boolean aceptada_adm = false;

    @Column(name = "aceptada_tec")
    private boolean aceptada_tec = false;

    public Solicitud() {

    }

    public Solicitud(long id, long tecnico, long cliente, long monto, String direccion, float latitud, float longitud,
            boolean aceptada_cli, boolean aceptada_adm, boolean aceptada_tec) {
        this.id = id;
        this.tecnico = tecnico;
        this.cliente = cliente;
        this.monto = monto;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.aceptada_cli = aceptada_cli;
        this.aceptada_adm = aceptada_adm;
        this.aceptada_tec = aceptada_tec;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTecnico() {
        return this.tecnico;
    }

    public void setTecnico(long tecnico) {
        this.tecnico = tecnico;
    }

    public long getCliente() {
        return this.cliente;
    }

    public void setCliente(long cliente) {
        this.cliente = cliente;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public boolean isAceptada_cli() {
        return aceptada_cli;
    }

    public boolean isAceptada_adm() {
        return aceptada_adm;
    }

    public boolean isAceptada_tec() {
		return aceptada_tec;
    }

}

