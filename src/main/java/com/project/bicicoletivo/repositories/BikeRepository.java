package com.project.bicicoletivo.repositories;

import com.project.bicicoletivo.entities.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BikeRepository extends JpaRepository<Bike, Long> {
    Optional<Bike> findBySerialNumber(String serialNumber);
}
