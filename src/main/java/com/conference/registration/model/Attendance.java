package com.conference.registration.model;

import java.time.LocalDateTime;

public class Attendance {
    private Long id;
    private Long userId;
    private Long sessionId;
    private LocalDateTime registeredAt;

    public Attendance() {}

    public Attendance(Long id, Long userId, Long sessionId, LocalDateTime registeredAt) {
        this.id = id;
        this.userId = userId;
        this.sessionId = sessionId;
        this.registeredAt = registeredAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(LocalDateTime registeredAt) {
        this.registeredAt = registeredAt;
    }
}
