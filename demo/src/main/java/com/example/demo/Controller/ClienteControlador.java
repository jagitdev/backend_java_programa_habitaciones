package com.example.demo.Controller;


import com.example.demo.model.Cliente;
import com.example.demo.model.Habitacion;
import com.example.demo.services.ClienteServicioImplementacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class ClienteControlador {

    @Autowired
    private ClienteServicioImplementacion clienteServicio;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/clientes")
    public List<Cliente> obtenerClientes(){
        return clienteServicio.obtenerTodoCliente();
    }


    @GetMapping(value = "/clientes", params = "numHabitacion")
    @ResponseBody
    public ResponseEntity<List<Cliente>> buscarHabitaciones(@RequestParam int numHabitacion) {
        List<Cliente> cliente = clienteServicio.findClienteNumHabitacion(numHabitacion);
        if (!cliente.isEmpty()) {

            return new ResponseEntity<>(cliente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/clientes/guardar")
    public ResponseEntity<Cliente> guardarCliente(@RequestBody Cliente cliente) {
        Cliente nuevoCliente = clienteServicio.guardar(cliente);
        return new ResponseEntity<>(nuevoCliente, HttpStatus.CREATED);
    }

    @PostMapping("/clientes/guardar/lista")
    public List<Cliente> guardarClientes(@RequestBody List<Cliente> clientes) {
       return clienteServicio.guardarTodo(clientes);
    }

    @DeleteMapping(value = "/clientes/eliminar", params = "numHabitacion")
    @ResponseBody
    public ResponseEntity<HashMap<String, Boolean>> eliminarClienteNumHabitacion(@RequestParam int numHabitacion){

        //llamamos al metodo deleteNumHabitacion lo hacemos con this ya que como la funcion es void no podemos crear un tipo <Cliente>
        this.clienteServicio.deleteNumHabitacion(numHabitacion);

        //HashMap es para la respuesta que nos dara ya que DELETE no devuelve nada
        HashMap<String, Boolean> estadoClienteEliminado = new HashMap<>();
        estadoClienteEliminado.put("eliminado", true);
        return ResponseEntity.ok(estadoClienteEliminado);
    }



}
