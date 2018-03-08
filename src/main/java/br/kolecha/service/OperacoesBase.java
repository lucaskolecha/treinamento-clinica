package br.kolecha.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Repository
public interface OperacoesBase<T, ID extends Serializable> {

    T save(T entity);

    void delete(ID id);

    List<T> getAll();

    T getById(ID id);

    Optional<T> update(ID id, T entity);

}
