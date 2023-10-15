package com.example.demo.services;

import com.example.demo.model.Habitacion;

import java.util.List;

public interface IHabitacionServicio {
    public List<Habitacion> obtenerTodo();

    public  Habitacion guardar(Habitacion habitacion);

    public Habitacion obtenerPorId(long id);


    public void eliminar(long id);
}
