package com.amsterdam.presentacionDePruebaQuipux.model;

import java.util.Objects;

public class Jugador {
    //ATRIBUTOS:
    private Integer id;
    private String nombreJugador;
    private String posicionEnElCampo;
    private String esTitular;
    private Integer equipoDeFutbol_id;

    //CONSTRUCTORES:
    //CON ID:
    public Jugador(Integer id, String nombreJugador, String posicionEnElCampo, String esTitular, Integer equipoDeFutbol_id) {
        this.id = id;
        this.nombreJugador = nombreJugador;
        this.posicionEnElCampo = posicionEnElCampo;
        this.esTitular = esTitular;
        this.equipoDeFutbol_id = equipoDeFutbol_id;
    }

    //SIN ID:
    public Jugador(String nombreJugador, String posicionEnElCampo, String esTitular, Integer equipoDeFutbol_id) {
        this.nombreJugador = nombreJugador;
        this.posicionEnElCampo = posicionEnElCampo;
        this.esTitular = esTitular;
        this.equipoDeFutbol_id = equipoDeFutbol_id;
    }

    //POR DEFAULT:
    public Jugador() {
    }

    //GETTERS AND SETTERS:
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getPosicionEnElCampo() {
        return posicionEnElCampo;
    }

    public void setPosicionEnElCampo(String posicionEnElCampo) {
        this.posicionEnElCampo = posicionEnElCampo;
    }

    public String getEsTitular() {
        return esTitular;
    }

    public void setEsTitular(String esTitular) {
        this.esTitular = esTitular;
    }

    public Integer getEquipoDeFutbol_id() {
        return equipoDeFutbol_id;
    }

    public void setEquipoDeFutbol_id(Integer equipoDeFutbol_id) {
        this.equipoDeFutbol_id = equipoDeFutbol_id;
    }

    //HASCODE AND EQUALS:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(id, jugador.id) && Objects.equals(nombreJugador, jugador.nombreJugador) && Objects.equals(posicionEnElCampo, jugador.posicionEnElCampo) && Objects.equals(esTitular, jugador.esTitular) && Objects.equals(equipoDeFutbol_id, jugador.equipoDeFutbol_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreJugador, posicionEnElCampo, esTitular, equipoDeFutbol_id);
    }
}