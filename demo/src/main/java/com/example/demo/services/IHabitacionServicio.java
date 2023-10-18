package com.example.demo.services;

import com.example.demo.model.Habitacion;

import java.util.List;

public interface IHabitacionServicio {
    public List<Habitacion> obtenerTodo();

    public Habitacion obtenerPorId(int id);

    public  Habitacion guardar(Habitacion habitacion);

    public void eliminar(int id);


}
