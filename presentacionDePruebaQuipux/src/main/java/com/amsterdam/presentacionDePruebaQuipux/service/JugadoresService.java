package com.amsterdam.presentacionDePruebaQuipux.service;

import com.amsterdam.presentacionDePruebaQuipux.IDao.IDaoGeneral;
import com.amsterdam.presentacionDePruebaQuipux.model.Jugador;
import org.springframework.stereotype.Service;

@Service
public class JugadoresService {
    private IDaoGeneral<Jugador> jugadorIDaoGeneral;

    //CONSTRUCTOR:
    public JugadoresService(IDaoGeneral<Jugador> jugadorIDaoGeneral) {
        this.jugadorIDaoGeneral = jugadorIDaoGeneral;
    }

    //SERVICIOS:
    public Jugador guardarJugador(Jugador jugador){
        return jugadorIDaoGeneral.guardar(jugador);
    }
}
