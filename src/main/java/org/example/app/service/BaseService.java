package org.example.app.service;

import java.util.List;

public interface BaseService<T> {
    void save(T obj);
    List<T> fetchAll();
    T fetchById(Long id);
    void delete(Long id);
}
