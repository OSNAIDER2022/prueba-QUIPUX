package com.amsterdam.presentacionDePruebaQuipux.controller;

import com.amsterdam.presentacionDePruebaQuipux.model.NumeroEntero;
import com.amsterdam.presentacionDePruebaQuipux.service.NumeroEnterosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/numero")
public class NumeroEnteroController {
    private NumeroEnterosService numeroEnterosService;

   //CONSTRUCTOR:
    @Autowired
    public NumeroEnteroController(NumeroEnterosService numeroEnterosService) {
        this.numeroEnterosService = numeroEnterosService;
    }

    //ENDPOINTS:
    @PostMapping
    public ResponseEntity<String> consultarNumero(@RequestBody NumeroEntero numeroEntero){
        return ResponseEntity.ok(numeroEnterosService.consultarNumeroEntero(numeroEntero));
    }
}
