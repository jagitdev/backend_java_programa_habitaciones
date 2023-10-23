package com.example.demo.Controller;

import com.example.demo.model.Cliente;
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
    @GetMapping(value = "/habitaciones")
    public List<Habitacion> obtenerHabitaciones() {
        return habitacionServicio.obtenerTodo();
    }


    public ResponseEntity<Habitacion> guardarHabitacion(@RequestBody Habitacion habitacion) {
        Habitacion nuevaHabitacion = habitacionServicio.guardar(habitacion);
        return new ResponseEntity<>(nuevaHabitacion, HttpStatus.CREATED);
    }

    @GetMapping(value = "/habitaciones", params = {"fumador", "permiteAnimal"})
    @ResponseBody
    public ResponseEntity<List<Habitacion>> buscarHabitaciones(@RequestParam Integer fumador, @RequestParam Integer permiteAnimal) {
        List<Habitacion> habitaciones = habitacionServicio.findHabitacionMascotaFumar(fumador, permiteAnimal);

        if (!habitaciones.isEmpty()) {

            return new ResponseEntity<>(habitaciones, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/habitaciones/{id}")
    public ResponseEntity<Habitacion> actualizar(@PathVariable int id, @RequestBody Habitacion habitacion){
        Habitacion habitacionPorId = habitacionServicio.obtenerPorId(id);
        habitacionPorId.setOcupacion(habitacion.getOcupacion());

        Habitacion habitacionActualizado = habitacionServicio.guardar(habitacionPorId);
        return new ResponseEntity<>(habitacionActualizado, HttpStatus.CREATED);
    }

}