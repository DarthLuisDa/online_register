package com.conference.registration.service;

import com.conference.registration.model.Attendance;
import com.conference.registration.repositories.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;

    public List<Attendance> getAllAttendanceRecords() {
        return attendanceRepository.findAll();
    }

    public Attendance getAttendanceById(Long id) {
        return attendanceRepository.findById(id).orElse(null);
    }

    public Attendance createAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    public Attendance updateAttendance(Long id, Attendance attendanceDetails) {
        Attendance attendance = getAttendanceById(id);
        if (attendance != null) {
            attendance.setUserId(attendanceDetails.getUserId());
            attendance.setSessionId(attendanceDetails.getSessionId());
            attendance.setRegisteredAt(attendanceDetails.getRegisteredAt());
            return attendanceRepository.save(attendance);
        }
        return null;
    }

    public void deleteAttendance(Long id) {
        attendanceRepository.deleteById(id);
    }
}