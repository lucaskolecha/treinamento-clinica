package br.kolecha.resource;

import br.kolecha.service.OperacoesBase;
import br.kolecha.service.ServiceBase;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


public abstract class ResourceBase<T, ID extends Serializable> implements OperacoesBase<T, ID> {

    protected ServiceBase<T, ID> serviceBase;

    public ResourceBase(ServiceBase<T, ID> serviceBase) {
        this.serviceBase = serviceBase;
    }

    @Override
    @RequestMapping(method = RequestMethod.POST)
    public T save(@RequestBody T entidade) {
        this.serviceBase.save(entidade);
        ResponseEntity.ok().body("FOI");
        return entidade;
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable ID id) {
        serviceBase.delete(id);
    }

    @Override
    @RequestMapping
    public List<T> getAll() {
        return serviceBase.getAll();
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public T getById(@PathVariable ID id) {
        return serviceBase.getById(id);
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Optional<T> update(@PathVariable ID id,@RequestBody T entidade) {
        return serviceBase.update(id, entidade);
    }

}
