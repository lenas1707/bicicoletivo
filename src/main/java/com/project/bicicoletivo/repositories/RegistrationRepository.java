package com.project.bicicoletivo.repositories;

import com.project.bicicoletivo.entities.Registration;
import com.project.bicicoletivo.entities.RegistrationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RegistrationRepository extends JpaRepository<Registration,Long> {

    List<Registration> findByUserId(Long userId);
    Optional<Registration> findByUserIdAndStatus(Long userId, RegistrationStatus status);
    Optional<Registration> findByBikeIdAndStatus(Long bikeId, RegistrationStatus status);

}
