package com.example.demo.Controller;


import com.example.demo.model.Cliente;
import com.example.demo.model.Habitacion;
import com.example.demo.services.ClienteServicioImplementacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/clientes/guardar")
    public ResponseEntity<Cliente> guardarCliente(@RequestBody Cliente cliente) {
        Cliente nuevoCliente = clienteServicio.guardar(cliente);
        return new ResponseEntity<>(nuevoCliente, HttpStatus.CREATED);
    }


}
