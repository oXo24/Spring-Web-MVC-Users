package org.example.app.service.impl;

import jakarta.transaction.Transactional;
import org.example.app.entity.Candidate;
import org.example.app.repository.ext.CandidatesRepository;
import org.example.app.service.ext.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service використовується для анотування
// класів реалізації сервісів.
// @Transactional застосовується до сервісного шару
// для підтримки транзакцій.
@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    CandidatesRepository repository;

    @Override
    @Transactional
    public void save(Candidate candidate) {
        repository.save(candidate);
    }

    @Override
    @Transactional
    public List<Candidate> fetchAll() {
        return repository.fetchAll();
    }

    @Override
    @Transactional
    public Candidate fetchById(Long id) {
        return repository.fetchById(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.delete(id);
    }
}
