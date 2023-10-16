package org.example.app.service.ext;

import org.example.app.entity.Candidate;
import org.example.app.service.BaseService;

import java.util.List;

public interface CandidateService extends BaseService<Candidate> {
    void save(Candidate candidate);
    List<Candidate> fetchAll();
    Candidate fetchById(Long id);
    void delete(Long id);
}
