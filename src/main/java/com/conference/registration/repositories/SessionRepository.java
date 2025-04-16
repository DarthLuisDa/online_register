package com.conference.registration.repositories;

import com.conference.registration.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
    // Aquí puede agregar métodos personalizados si es necesario
}