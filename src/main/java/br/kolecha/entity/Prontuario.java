package br.kolecha.entity;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity(name = "prontuario")
@Table(name = "prontuario")
public class Prontuario extends BaseEntity {

    @Column(name = "diagnostico")
    private String diagnostico;

    @Column(name = "tratamento")
    private String tratamento;

    @ElementCollection
    private List<String> sintomas;

    public Prontuario() {
    }

    public Prontuario(String diagnostico, String tratamento, List<String> sintomas) {
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public List<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<String> sintomas) {
        this.sintomas = sintomas;
    }
}
