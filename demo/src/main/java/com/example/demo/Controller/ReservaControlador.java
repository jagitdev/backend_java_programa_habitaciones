package com.example.demo.Controller;


import com.example.demo.model.Habitacion;
import com.example.demo.model.Reserva;
import com.example.demo.services.ReservaServicioImplementacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ReservaControlador {

    @Autowired
    private ReservaServicioImplementacion reservaServicio;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/reservas")
    public List<Reserva> obtenerReservas() {
        return reservaServicio.obtenerTodo();
    }
}
