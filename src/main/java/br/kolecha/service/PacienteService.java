package br.kolecha.service;

import br.kolecha.entity.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PacienteService extends ServiceBase<Paciente, String> {

    @Autowired
    public PacienteService(@Qualifier("pacienteRepository") JpaRepository<Paciente, String> repository) {
        super(repository);
    }

    public Paciente save(Paciente entity) {
        return repository.save(entity);
    }

}
