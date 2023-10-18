package com.example.demo.services;

import com.example.demo.model.Cliente;
import com.example.demo.model.Habitacion;

import java.util.List;

public interface IClienteServicio {
    public List<Cliente> obtenerTodoCliente();

    public Cliente obtenerPorId(int id);

    public Cliente guardar(Cliente cliente);

    public void eliminar(int id);
}
