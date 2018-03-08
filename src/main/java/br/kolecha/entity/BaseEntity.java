package br.kolecha.entity;

import javax.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class BaseEntity {

    @Id
    @Column(name = "id")
    private String id;

    public BaseEntity() {
        this.id = GenerateID.gerarID();
    }

    public String getId() {
        return id;
    }
}
