package com.amsterdam.presentacionDePruebaQuipux.controller;

import com.amsterdam.presentacionDePruebaQuipux.model.HoraAConsultar;
import com.amsterdam.presentacionDePruebaQuipux.service.HoraAConsultarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hora")
public class HoraAConsultarController {
    private HoraAConsultarService horaAConsultarService;

    //CONSTRUCTOR:
    @Autowired
    public HoraAConsultarController(HoraAConsultarService horaAConsultarService) {
        this.horaAConsultarService = horaAConsultarService;
    }

    //ENDPOINTS:
    @PostMapping
    public ResponseEntity<String> consultarHora(@RequestBody HoraAConsultar horaAConsultar){
        return ResponseEntity.ok(horaAConsultarService.consultarHora(horaAConsultar));
    }
}
