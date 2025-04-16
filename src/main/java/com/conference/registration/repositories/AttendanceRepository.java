package com.conference.registration.repositories;

import com.conference.registration.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    // Aquí puede agregar métodos personalizados si es necesario
}
