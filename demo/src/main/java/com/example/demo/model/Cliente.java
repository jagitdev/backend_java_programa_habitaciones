package com.example.demo.model;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "clientes", schema = "PUBLIC")
@EntityListeners(AuditingEntityListener.class)
public class Cliente {

    // atributos -------
    @Id
    @Column(name = "ID_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NumHabitacion")
    private int numHabitacion;
    @Column(name = "Nombre_Cliente")
    private String nombreCliente;
    @Column(name = "Apellido1_Cliente")
    private String apellidoUnoCliente;
    @Column(name = "Apellido2_Cliente")
    private String apellidoDosCliente;
    @Column(name = "DNI_Cliente")
    private String Dni;
    @Column(name = "Telefono_Cliente")
    private String telefonoCliente;
    @Column(name = "Direccion_Cliente")
    private String direccionCliente;
    @Column(name = "Correo_Electronico_Cliente")
    private String correoElectronicoCliente;
    @Column(name = "Fecha_Llegada_Cliente")
    @Temporal(TemporalType.DATE)
    private Date fechaLlegadaCliente;
    @Column(name = "Fecha_Finalizacion_Cliente")
    @Temporal(TemporalType.DATE)
    private Date fechaFinalizacionCliente;


    public Cliente() {

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

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoUnoCliente() {
        return apellidoUnoCliente;
    }

    public void setApellidoUnoCliente(String apellidoUnoCliente) {
        this.apellidoUnoCliente = apellidoUnoCliente;
    }

    public String getApellidoDosCliente() {
        return apellidoDosCliente;
    }

    public void setApellidoDosCliente(String apellidoDosCliente) {
        this.apellidoDosCliente = apellidoDosCliente;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getCorreoElectronicoCliente() {
        return correoElectronicoCliente;
    }

    public void setCorreoElectronicoCliente(String correoElectronicoCliente) {
        this.correoElectronicoCliente = correoElectronicoCliente;
    }

    public Date getFechaLlegadaCliente() {
        return fechaLlegadaCliente;
    }

    public void setFechaLlegadaCliente(Date fechaLlegadaCliente) {
        this.fechaLlegadaCliente = fechaLlegadaCliente;
    }

    public Date getFechaFinalizacionCliente() {
        return fechaFinalizacionCliente;
    }

    public void setFechaFinalizacionCliente(Date fechaFinalizacionCliente) {
        this.fechaFinalizacionCliente = fechaFinalizacionCliente;
    }
}
