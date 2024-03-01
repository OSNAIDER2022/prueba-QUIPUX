package com.amsterdam.presentacionDePruebaQuipux.service;

import com.amsterdam.presentacionDePruebaQuipux.IDao.IDaoGeneral;
import com.amsterdam.presentacionDePruebaQuipux.model.EquipoDeFutbol;
import org.springframework.stereotype.Service;

@Service
public class EquiposDeFutbolService {
    private IDaoGeneral<EquipoDeFutbol> equipoDeFutbolIDaoGeneral;

    //CONSTRUCTOR:
    public EquiposDeFutbolService(IDaoGeneral<EquipoDeFutbol> equipoDeFutbolIDaoGeneral) {
        this.equipoDeFutbolIDaoGeneral = equipoDeFutbolIDaoGeneral;
    }

    //SERVICIOS:
    public EquipoDeFutbol guardarEquipo(EquipoDeFutbol equipoDeFutbol){
        return equipoDeFutbolIDaoGeneral.guardar(equipoDeFutbol);
    }
}
