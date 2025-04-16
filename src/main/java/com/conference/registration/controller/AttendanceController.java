package com.conference.registration.controller;

import com.conference.registration.model.Attendance;
import com.conference.registration.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    @GetMapping
    public List<Attendance> getAllAttendanceRecords() {
        return attendanceService.getAllAttendanceRecords();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Attendance> getAttendanceById(@PathVariable Long id) {
        Attendance attendance = attendanceService.getAttendanceById(id);
        return attendance != null ? ResponseEntity.ok(attendance) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Attendance createAttendance(@RequestBody Attendance attendance) {
        return attendanceService.createAttendance(attendance);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Attendance> updateAttendance(@PathVariable Long id, @RequestBody Attendance attendanceDetails) {
        Attendance updatedAttendance = attendanceService.updateAttendance(id, attendanceDetails);
        return updatedAttendance != null ? ResponseEntity.ok(updatedAttendance) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAttendance(@PathVariable Long id) {
        attendanceService.deleteAttendance(id);
        return ResponseEntity.noContent().build();
    }
}