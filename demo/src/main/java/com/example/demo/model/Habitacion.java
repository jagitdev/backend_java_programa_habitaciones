package com.example.demo.model;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "habitaciones", schema = "PUBLIC")
@EntityListeners(AuditingEntityListener.class)
public class Habitacion {

    // atributos -------
    @Id
    @Column(name = "ID_habitaciones")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NumHabitacion")
    private int numHabitacion;
    @Column(name = "Precio")
    private float precio;
    @Column(name = "Permite_Animal")
    private int permiteAnimal;
    @Column(name = "Fumador")
    private int fumador;
    @Column(name = "numCamas")
    private int numCamas;
    @Column(name = "Ocupacion")
    private String ocupacion;

    //-----------------


    public void Habitacion() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getPermiteAnimal() {
        return permiteAnimal;
    }

    public void setPermiteAnimal(int permiteAnimal) {
        this.permiteAnimal = permiteAnimal;
    }

    public int getFumador() {
        return fumador;
    }

    public void setFumador(int fumador) {
        this.fumador = fumador;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}





