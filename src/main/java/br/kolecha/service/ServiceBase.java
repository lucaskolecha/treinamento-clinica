package br.kolecha.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


public abstract class ServiceBase<T, ID extends Serializable> implements OperacoesBase<T,ID> {

    protected final JpaRepository<T, ID> repository;

    public ServiceBase(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(ID id) {
        repository.delete(id);
    }

    @Override
    public List<T> getAll() {
        return repository.findAll();
    }

    @Override
    public T getById(ID id) {
        return repository.findOne(id);
    }

    @Override
    public Optional<T> update(ID id, T entity) {return Optional.ofNullable(repository.save(entity));}

}
