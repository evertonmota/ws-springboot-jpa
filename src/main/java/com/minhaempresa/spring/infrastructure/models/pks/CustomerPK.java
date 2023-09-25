package com.minhaempresa.spring.infrastructure.models.pks;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/*
    Esta Classe representa a chava composta do modelo da entidade.

    - Implementar Interface Serializable
    - Ter os atributos da chave (PK) da entidadae que representa
    - Ter construtores
    - Ter metodos Getters/setters
    - Ter métodos  hashcode / equals
    - Colocar as anotações para definir a PK da entidade.

 */
@Embeddable
public class CustomerPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name="telephone", length = 11)
    private String telephone;

    @Column(name = "cpf",length = 11)
    private String cpf;

    public CustomerPK() {
    }

    public CustomerPK(String telephone, String cpf) {
        this.telephone = telephone;
        this.cpf = cpf;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerPK that = (CustomerPK) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
