package com.amsterdam.presentacionDePruebaQuipux.service;

import com.amsterdam.presentacionDePruebaQuipux.IDao.IDaoGeneral;
import com.amsterdam.presentacionDePruebaQuipux.model.NumeroEntero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumeroEnterosService {
    private IDaoGeneral<NumeroEntero> numeroEnteroIDaoGeneral;

    //CONSTRUCTOR:
    public NumeroEnterosService(IDaoGeneral<NumeroEntero> numeroEnteroIDaoGeneral) {
        this.numeroEnteroIDaoGeneral = numeroEnteroIDaoGeneral;
    }

    //SERVICIOS:
    public String consultarNumeroEntero(NumeroEntero numeroEntero){
        return numeroEnteroIDaoGeneral.consultar(numeroEntero);
    }
}
