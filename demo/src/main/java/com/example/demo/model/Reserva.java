package com.example.demo.model;

import javax.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "reserva_habitacion", schema = "PUBLIC")
@EntityListeners(AuditingEntityListener.class)
public class Reserva {
    @Id
    @Column(name = "ID_reserva_habitacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NumHabitacion")
    private int numHabitacion;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido1")
    private String apellidoUno;
    @Column(name = "Apellido2")
    private String apellidoDos;
    @Column(name = "DNI")
    private String dni;
    @Column(name = "Fecha_Llegada")
    @Temporal(TemporalType.DATE)
    private Date fechaLlegada;
    @Column(name = "Fecha_Finalizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaFinalizacion;

    public Reserva() {

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoUno() {
        return apellidoUno;
    }

    public void setApellidoUno(String apellidoUno) {
        this.apellidoUno = apellidoUno;
    }

    public String getApellidoDos() {
        return apellidoDos;
    }

    public void setApellidoDos(String apellidoDos) {
        this.apellidoDos = apellidoDos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
}
