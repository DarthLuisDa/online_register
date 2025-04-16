package com.conference.registration.controller;

import com.conference.registration.model.Session;
import com.conference.registration.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @GetMapping
    public List<Session> getAllSessions() {
        return sessionService.getAllSessions();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Session> getSessionById(@PathVariable Long id) {
        Session session = sessionService.getSessionById(id);
        return session != null ? ResponseEntity.ok(session) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Session createSession(@RequestBody Session session) {
        return sessionService.createSession(session);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Session> updateSession(@PathVariable Long id, @RequestBody Session sessionDetails) {
        Session updatedSession = sessionService.updateSession(id, sessionDetails);
        return updatedSession != null ? ResponseEntity.ok(updatedSession) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSession(@PathVariable Long id) {
        sessionService.deleteSession(id);
        return ResponseEntity.noContent().build();
    }
}