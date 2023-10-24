package com.example.demo.services;

import com.example.demo.model.Habitacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IHabitacionServicio {
    public List<Habitacion> obtenerTodo();

    public Habitacion obtenerPorId(int id);

    public  Habitacion guardar(Habitacion habitacion);

    public void eliminar(int id);


    public List<Habitacion> findHabitacionMascotaFumar(Integer fumador, Integer permiteAnimal);

    public  Habitacion findHabitacionNumHabitacion(Integer numHabitacion);




}
