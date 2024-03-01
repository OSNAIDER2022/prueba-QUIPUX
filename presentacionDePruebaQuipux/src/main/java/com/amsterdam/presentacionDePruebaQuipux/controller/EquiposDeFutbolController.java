package com.amsterdam.presentacionDePruebaQuipux.controller;

import com.amsterdam.presentacionDePruebaQuipux.model.EquipoDeFutbol;
import com.amsterdam.presentacionDePruebaQuipux.service.EquiposDeFutbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equipo")
public class EquiposDeFutbolController {
    private EquiposDeFutbolService equiposDeFutbolService;

    //CONSTRUCTOR:
    @Autowired
    public EquiposDeFutbolController(EquiposDeFutbolService equiposDeFutbolService) {
        this.equiposDeFutbolService = equiposDeFutbolService;
    }

    //ENDPOINTS:
    @PostMapping
    public ResponseEntity<EquipoDeFutbol> guardarEquipo(@RequestBody EquipoDeFutbol equipoDeFutbol){
        return ResponseEntity.ok(equiposDeFutbolService.guardarEquipo(equipoDeFutbol));
    }


}
