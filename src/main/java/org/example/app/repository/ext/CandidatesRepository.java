package org.example.app.repository.ext;

import org.example.app.entity.Candidate;
import org.example.app.repository.BaseRepository;

import java.util.List;

public interface CandidatesRepository extends BaseRepository<Candidate> {
    void save(Candidate candidate);
    List<Candidate> fetchAll();
    Candidate fetchById(Long id);
    void delete(Long id);
}
