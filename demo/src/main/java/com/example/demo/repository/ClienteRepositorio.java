package com.example.demo.repository;

import com.example.demo.model.Cliente;
import com.example.demo.model.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
    @Query(value = "select * from clientes where NumHabitacion = :numHabitacion", nativeQuery = true)
    List<Cliente> findClienteNumHabitacion(@Param("numHabitacion") int numHabitacion);

    @Transactional
    @Modifying
    @Query(value = "delete from clientes where NumHabitacion = :numHabitacion", nativeQuery = true)
    void deleteNumHabitacion(@Param("numHabitacion") int numHabitacion);
}
