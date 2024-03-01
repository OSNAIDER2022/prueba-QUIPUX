package com.amsterdam.presentacionDePruebaQuipux.model;

import java.util.Objects;

public class NumeroEntero {
    //ATRIBUTOS
    private Integer valor;

    //CONSTRUCTOR:
    public NumeroEntero(Integer valor) {
        this.valor = valor;
    }

    //constructor por defecto:
    public NumeroEntero() {
    }

    //GETTERS AND SETTERS
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroEntero that = (NumeroEntero) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
