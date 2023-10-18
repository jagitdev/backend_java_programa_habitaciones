package com.example.demo.services;

import com.example.demo.model.Reserva;

import java.util.List;

public interface IReservaServicio {
    public List<Reserva> obtenerTodo();

    public Reserva obtenerPorId(int id);

    public Reserva guardar(Reserva reserva);

    public void eliminar(int id);
}
