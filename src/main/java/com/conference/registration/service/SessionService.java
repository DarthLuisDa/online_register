package com.conference.registration.service;

import com.conference.registration.model.Session;
import com.conference.registration.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {
    @Autowired
    private SessionRepository sessionRepository;

    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    public Session getSessionById(Long id) {
        return sessionRepository.findById(id).orElse(null);
    }

    public Session createSession(Session session) {
        return sessionRepository.save(session);
    }

    public Session updateSession(Long id, Session sessionDetails) {
        Session session = getSessionById(id);
        if (session != null) {
            session.setTitle(sessionDetails.getTitle());
            session.setDescription(sessionDetails.getDescription());
            session.setSpeaker(sessionDetails.getSpeaker());
            session.setStartTime(sessionDetails.getStartTime());
            session.setEndTime(sessionDetails.getEndTime());
            session.setCapacity(sessionDetails.getCapacity());
            return sessionRepository.save(session);
        }
        return null;
    }

    public void deleteSession(Long id) {
        sessionRepository.deleteById(id);
    }
}