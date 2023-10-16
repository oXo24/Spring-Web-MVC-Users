package org.example.app.repository.impl;

import org.example.app.entity.Candidate;
import org.example.app.repository.ext.CandidatesRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CandidatesRepositoryImpl implements CandidatesRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Candidate candidate) {
        Session currentSession = sessionFactory.getCurrentSession();
        String hql = "INSERT INTO Candidate (name, surname, email) " +
                "VALUES (:name, :surname, :email)";
        MutationQuery query = currentSession.createMutationQuery(hql);
        query.setParameter("name", candidate.getName());
        query.setParameter("surname", candidate.getSurname());
        query.setParameter("email", candidate.getEmail());
        query.executeUpdate();
    }

    @Override
    public List<Candidate> fetchAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Candidate", Candidate.class).list();
    }

    @Override
    public Candidate fetchById(Long id) {
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.get(Candidate.class, id);
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Candidate candidate = session.byId(Candidate.class).load(id);
        session.remove(candidate);
    }
}
