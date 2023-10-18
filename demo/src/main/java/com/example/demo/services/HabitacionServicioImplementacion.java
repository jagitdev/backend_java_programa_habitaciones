package com.example.demo.services;

import com.example.demo.model.Habitacion;
import com.example.demo.repository.HabitacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionServicioImplementacion implements IHabitacionServicio{

    @Autowired
    HabitacionRepositorio habitacionRepositorio;

    @Override
    public List<Habitacion> obtenerTodo() {
        return habitacionRepositorio.findAll();
    }

    @Override
    public Habitacion guardar(Habitacion habitacion) {
        return habitacionRepositorio.save(habitacion);
    }

    @Override
    public Habitacion obtenerPorId(int id) {
        return habitacionRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(int id) {
        habitacionRepositorio.deleteById(id);
    }
}
