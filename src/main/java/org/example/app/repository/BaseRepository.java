package org.example.app.repository;

import java.util.List;

public interface BaseRepository <T> {
    void save(T obj);
    List<T> fetchAll();
    T fetchById(Long id);
    void delete(Long id);
}