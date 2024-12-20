package com.example.task1.Service;

import com.example.task1.Model.Conference;
import com.example.task1.Repositoty.ConferenceRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ConferenceService {
    private final ConferenceRepository conferenceRepository;

    @Transactional
    public Conference save(Conference conference) {
        return conferenceRepository.save(conference);
    }

    public long count() {
        return conferenceRepository.count();
    }

    public Optional<Conference> findById(long id) {
        return conferenceRepository.findById(id);
    }
}