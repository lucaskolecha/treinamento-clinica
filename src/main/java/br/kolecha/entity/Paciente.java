package br.kolecha.entity;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity(name = "pessoa")
@Table(name = "pessoa")
public class Paciente extends Pessoa {

    @Column(name = "fuma")
    private Boolean fuma;

    @Column(name = "bebe")
    private Boolean bebe;

    @Column(name = "diabete")
    private Boolean diabete;

    @Column(name = "cardicado")
    private Boolean cardiaco;

    @ElementCollection
    private List<String> cirurgias;

    @ElementCollection
    private List<String> alergias;

    public Paciente() {
    }

    public Boolean getFuma() {
        return fuma;
    }

    public void setFuma(Boolean fuma) {
        this.fuma = fuma;
    }

    public Boolean getBebe() {
        return bebe;
    }

    public void setBebe(Boolean bebe) {
        this.bebe = bebe;
    }

    public Boolean getDiabete() {
        return diabete;
    }

    public void setDiabete(Boolean diabete) {
        this.diabete = diabete;
    }

    public Boolean getCardiaco() {
        return cardiaco;
    }

    public void setCardiaco(Boolean cardiaco) {
        this.cardiaco = cardiaco;
    }

    public List<String> getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(List<String> cirurgias) {
        this.cirurgias = cirurgias;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }
}
