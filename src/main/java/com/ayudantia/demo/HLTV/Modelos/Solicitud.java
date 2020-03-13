package com.ayudantia.demo.HLTV.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="SOLICITUD")
@Entity
public class Solicitud{
    @Id
    @GenericGenerator(name="incrementSolicitud", strategy="increment")
    @GeneratedValue(generator="incrementSolicitud")
    @Column(name="id_Solicitud")
    long id;

    @Column(name="id_Tecnico")
    long idTecnico;

    @Column(name="id_Usuario")
    long idUsuario;

    Solicitud (){

    }

    public Solicitud(long id, long idTecnico, long idUsuario) {
        this.id = id;
        this.idTecnico = idTecnico;
        this.idUsuario = idUsuario;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdTecnico() {
        return this.idTecnico;
    }

    public void setIdTecnico(long idTecnico) {
        this.idTecnico = idTecnico;
    }
    
    public long getIdUsuario(){
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario){
        this.idUsuario = idUsuario;
    }
}