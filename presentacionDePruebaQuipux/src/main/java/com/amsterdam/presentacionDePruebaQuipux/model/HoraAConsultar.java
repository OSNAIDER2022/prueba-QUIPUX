package com.amsterdam.presentacionDePruebaQuipux.model;

import java.util.Objects;

public class HoraAConsultar {
    //ATRIBUTOS:
    private Integer digitoH;
    private Integer digitoM;

    //CONSTRUCTORES
    public HoraAConsultar(Integer digitoH, Integer digitoM) {
        this.digitoH = digitoH;
        this.digitoM = digitoM;
    }

    //GETTERS AND SETTERS:

    public Integer getDigitoH() {
        return digitoH;
    }

    public void setDigitoH(Integer digitoH) {
        this.digitoH = digitoH;
    }

    public Integer getDigitoM() {
        return digitoM;
    }

    public void setDigitoM(Integer digitoM) {
        this.digitoM = digitoM;
    }

    //HASHCODE AND EQUALS:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraAConsultar that = (HoraAConsultar) o;
        return Objects.equals(digitoH, that.digitoH) && Objects.equals(digitoM, that.digitoM);
    }

    @Override
    public int hashCode() {
        return Objects.hash(digitoH, digitoM);
    }
}
