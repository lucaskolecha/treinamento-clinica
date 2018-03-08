package br.kolecha.resource;

import br.kolecha.entity.Paciente;
import br.kolecha.service.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/pacientes")
public class PacienteResource extends ResourceBase<Paciente, String> {

    @Autowired
    public PacienteResource(ServiceBase<Paciente, String> serviceBase) {
        super(serviceBase);
    }


//    @Autowired
//    public PacienteResource(ServiceBase<Paciente, String> serviceBase) {
//        super(serviceBase);
//    }


}
