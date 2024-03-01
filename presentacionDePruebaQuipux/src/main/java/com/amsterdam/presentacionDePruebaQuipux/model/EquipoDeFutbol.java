package com.amsterdam.presentacionDePruebaQuipux.model;

import java.util.Objects;

public class EquipoDeFutbol {
    //ATRIBUTOS:
    private Integer id;
    private String nombreDelEquipo;
    private String nombreDelEstadio;
    private Integer cantidadDeTitulos;

    //CONSTRUCTORES:
    //CON ID:
    public EquipoDeFutbol(Integer id, String nombreDelEquipo, String nombreDelEstadio, Integer cantidadDeTitulos) {
        this.id = id;
        this.nombreDelEquipo = nombreDelEquipo;
        this.nombreDelEstadio = nombreDelEstadio;
        this.cantidadDeTitulos = cantidadDeTitulos;
    }

    //SIN ID:
    public EquipoDeFutbol(String nombreDelEquipo, String nombreDelEstadio, Integer cantidadDeTitulos) {
        this.nombreDelEquipo = nombreDelEquipo;
        this.nombreDelEstadio = nombreDelEstadio;
        this.cantidadDeTitulos = cantidadDeTitulos;
    }

    //POR DEFAULT:
    public EquipoDeFutbol() {
    }

    //GETTERS AND SETTERS:
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreDelEquipo() {
        return nombreDelEquipo;
    }

    public void setNombreDelEquipo(String nombreDelEquipo) {
        this.nombreDelEquipo = nombreDelEquipo;
    }

    public String getNombreDelEstadio() {
        return nombreDelEstadio;
    }

    public void setNombreDelEstadio(String nombreDelEstadio) {
        this.nombreDelEstadio = nombreDelEstadio;
    }

    public Integer getCantidadDeTitulos() {
        return cantidadDeTitulos;
    }

    public void setCantidadDeTitulos(Integer cantidadDeTitulos) {
        this.cantidadDeTitulos = cantidadDeTitulos;
    }

    //HASHCODE AND EQUALS:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipoDeFutbol that = (EquipoDeFutbol) o;
        return Objects.equals(id, that.id) && Objects.equals(nombreDelEquipo, that.nombreDelEquipo) && Objects.equals(nombreDelEstadio, that.nombreDelEstadio) && Objects.equals(cantidadDeTitulos, that.cantidadDeTitulos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreDelEquipo, nombreDelEstadio, cantidadDeTitulos);
    }
}
