package com.example.demo.repository;

import com.example.demo.model.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HabitacionRepositorio extends JpaRepository<Habitacion, Integer> {
    @Query(value = "select * from habitaciones where fumador = :fumador and permite_Animal = :permiteAnimal and Ocupacion='libre'", nativeQuery = true)
    List<Habitacion> findHabitacionMascotaFumar(@Param("fumador") Integer fumador, @Param("permiteAnimal") Integer permiteAnimal);


}
