package com.example.demo.services;

import com.example.demo.model.Cliente;
import com.example.demo.model.Reserva;
import com.example.demo.repository.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServicioImplementacion implements IReservaServicio{

    @Autowired
    ReservaRepositorio reservaRepositorio;

    @Override
    public List<Reserva> obtenerTodo() {
        return reservaRepositorio.findAll();
    }

    @Override
    public Reserva findReservaDni(@Param("dni") String dni){
        return reservaRepositorio.findReservaDni(dni);
    };

    @Override
    public Reserva guardar(Reserva reserva) {
        return reservaRepositorio.save(reserva);
    }

    @Override
    public Reserva obtenerPorId(int id) {
        return reservaRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(int id) {
        reservaRepositorio.deleteById(id);
    }
}
