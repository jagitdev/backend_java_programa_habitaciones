package com.example.demo.services;

import com.example.demo.model.Cliente;
import java.util.List;

public interface IClienteServicio {
    public List<Cliente> obtenerTodoCliente();

    public  List<Cliente> findClienteNumHabitacion(int numHabitacion);

    public Cliente obtenerPorId(int id);

    public Cliente guardar(Cliente cliente);

    public List<Cliente> guardarTodo(List<Cliente> clientes);

    public void eliminar(int id);

    public void deleteNumHabitacion(int numHabitacion);
}
