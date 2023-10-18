package com.example.demo.services;

import com.example.demo.model.Cliente;
import com.example.demo.model.Habitacion;
import com.example.demo.repository.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicioImplementacion implements IClienteServicio{

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> obtenerTodoCliente() {
        return clienteRepositorio.findAll();
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    @Override
    public Cliente obtenerPorId(int id) {
        return clienteRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(int id) {
        clienteRepositorio.deleteById(id);
    }


}
