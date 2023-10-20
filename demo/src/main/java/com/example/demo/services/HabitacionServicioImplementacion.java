package com.example.demo.services;

import com.example.demo.model.Habitacion;
import com.example.demo.repository.HabitacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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



    //prueba llamada por permite fumar y permite mascota

    @Override
    public List<Habitacion> findHabitacionMascotaFumar(@Param("fumador") Integer fumador, @Param("permiteAnimal") Integer permiteAnimal) {
        return habitacionRepositorio.findHabitacionMascotaFumar(fumador, permiteAnimal);
    }
}
