package com.amsterdam.presentacionDePruebaQuipux.controller;

import com.amsterdam.presentacionDePruebaQuipux.model.Jugador;
import com.amsterdam.presentacionDePruebaQuipux.service.JugadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jugador")
public class JugadoresController {
    private JugadoresService jugadoresService;

    //CONSTRUCTORES:
    @Autowired
    public JugadoresController(JugadoresService jugadoresService) {
        this.jugadoresService = jugadoresService;
    }

    //ENDPOINTS:
    @PostMapping
    public ResponseEntity<Jugador> guardarJugador(@RequestBody Jugador jugador){
        return ResponseEntity.ok(jugadoresService.guardarJugador(jugador));
    }
}
