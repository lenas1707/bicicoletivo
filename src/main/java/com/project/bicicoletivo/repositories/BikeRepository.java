package com.project.bicicoletivo.repositories;

import com.project.bicicoletivo.entities.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
