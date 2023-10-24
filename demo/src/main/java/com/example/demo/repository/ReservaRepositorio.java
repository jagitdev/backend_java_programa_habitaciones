package com.example.demo.repository;

import com.example.demo.model.Cliente;
import com.example.demo.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservaRepositorio extends JpaRepository<Reserva,Integer> {
    @Query(value = "select * from reserva_habitacion where DNI = :dni", nativeQuery = true)
    Reserva findReservaDni(@Param("dni") String dni);
}
