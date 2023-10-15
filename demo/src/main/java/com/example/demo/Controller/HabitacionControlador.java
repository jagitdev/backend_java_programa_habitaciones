package com.example.demo.Controller;

import com.example.demo.model.Habitacion;
import com.example.demo.services.HabitacionServicioImplementacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HabitacionControlador {
    @Autowired
    private HabitacionServicioImplementacion habitacionServicio;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/habitaciones")
    public List<Habitacion> obtenerClientes() {
        return habitacionServicio.obtenerTodo();
    }

    public ResponseEntity<Habitacion> guardarHabitacion(@RequestBody Habitacion habitacion) {
        Habitacion nuevaHabitacion = habitacionServicio.guardar(habitacion);
        return new ResponseEntity<>(nuevaHabitacion, HttpStatus.CREATED);
    }
}