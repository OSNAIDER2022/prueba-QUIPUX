package com.amsterdam.presentacionDePruebaQuipux.service;

import com.amsterdam.presentacionDePruebaQuipux.IDao.IDaoGeneral;
import com.amsterdam.presentacionDePruebaQuipux.model.HoraAConsultar;
import org.springframework.stereotype.Service;

@Service
public class HoraAConsultarService {
    private IDaoGeneral<HoraAConsultar> horaAConsultarIDaoGeneral;

    //CONSTRUCTOR:
    public HoraAConsultarService(IDaoGeneral<HoraAConsultar> horaAConsultarIDaoGeneral) {
        this.horaAConsultarIDaoGeneral = horaAConsultarIDaoGeneral;
    }

    //SERVICIOS:
    public String consultarHora(HoraAConsultar horaAConsultar){
        return horaAConsultarIDaoGeneral.consultar(horaAConsultar);
    }
}
