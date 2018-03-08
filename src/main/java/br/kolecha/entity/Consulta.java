package br.kolecha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "consulta")
@Table(name = "consulta")
public class Consulta extends BaseEntity {

    @Column(name = "data")
    private String data;

    @Column(name = "horario")
    private String horario;

    @Column(name = "retorno")
    private Boolean retorno;

    public Consulta() {
    }

    public Consulta(String data, String horario, Boolean retorno) {
        this.data = data;
        this.horario = horario;
        this.retorno = retorno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Boolean getRetorno() {
        return retorno;
    }

    public void setRetorno(Boolean retorno) {
        this.retorno = retorno;
    }
}
