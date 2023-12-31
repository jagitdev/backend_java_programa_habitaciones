package com.example.demo.Controller;


import com.example.demo.model.Cliente;
import com.example.demo.model.Habitacion;
import com.example.demo.model.Reserva;
import com.example.demo.services.ReservaServicioImplementacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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

    @GetMapping(value = "/reservas", params = "dni")
    @ResponseBody
    public ResponseEntity<Reserva> buscarRerservaDni(@RequestParam String dni) {
        Reserva reserva = reservaServicio.findReservaDni(dni);
        return new ResponseEntity<>(reserva, HttpStatus.OK);

    }

    @PostMapping("/reservas/guardar")
    public ResponseEntity<Reserva> guardarReserva(@RequestBody Reserva reserva) {
        Reserva nuevaReserva = reservaServicio.guardar(reserva);
        return new ResponseEntity<>(nuevaReserva, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/reservas/eliminar/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarReserva(@PathVariable int id){

        //llamamos al metodo deleteNumHabitacion lo hacemos con this ya que como la funcion es void no podemos crear un tipo <Cliente>
        this.reservaServicio.eliminar(id);

        //HashMap es para la respuesta que nos dara ya que DELETE no devuelve nada
        HashMap<String, Boolean> estadoReservaEliminado = new HashMap<>();
        estadoReservaEliminado.put("eliminado", true);
        return ResponseEntity.ok(estadoReservaEliminado);
    }
}
