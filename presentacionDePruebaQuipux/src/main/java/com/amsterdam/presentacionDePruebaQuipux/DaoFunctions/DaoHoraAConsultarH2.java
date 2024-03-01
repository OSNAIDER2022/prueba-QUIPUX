package com.amsterdam.presentacionDePruebaQuipux.DaoFunctions;

import com.amsterdam.presentacionDePruebaQuipux.IDao.IDaoGeneral;
import com.amsterdam.presentacionDePruebaQuipux.model.HoraAConsultar;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.List;

@Repository
public class DaoHoraAConsultarH2 implements IDaoGeneral<HoraAConsultar> {
    @Override
    public HoraAConsultar guardar(HoraAConsultar horaAConsultar) {
        return null;
    }

    @Override
    public HoraAConsultar buscar(Integer id) {
        return null;
    }

    @Override
    public void actualizar(HoraAConsultar horaAConsultar) {

    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public List<HoraAConsultar> buscarTodos() {
        return null;
    }

    @Override
    public String consultar(HoraAConsultar horaAConsultar) {
        Connection connection = null;
        String respuesta = null;
        String a = null;
        String b = null;

        try {
            if(1 <= horaAConsultar.getDigitoH() && horaAConsultar.getDigitoH() <= 12){
                if(0 <= horaAConsultar.getDigitoM() && horaAConsultar.getDigitoM() <= 60){
                    switch (horaAConsultar.getDigitoH()){
                        case 1:
                            a = "una";
                            break;
                        case 2:
                            a = "dos";
                            break;
                        case 3:
                            a = "tres";
                            break;
                        case 4:
                            a = "cuatro";
                            break;
                        case 5:
                            a = "cinco";
                            break;
                        case 6:
                            a = "seis";
                            break;
                        case 7:
                            a = "siete";
                            break;
                        case 8:
                            a = "ocho";
                            break;
                        case 9:
                            a = "nueve";
                            break;
                        case 10:
                            a = "diez";
                            break;
                        case 11:
                            a = "once";
                            break;
                        case 12:
                            a = "doce";
                            break;
                        default:
                    }
                    switch (horaAConsultar.getDigitoM()){
                        case 00 | 0:
                            b = "en punto";
                            break;
                        case 1:
                            b = "una";
                            break;
                        case 2:
                            b = "dos";
                            break;
                        case 3:
                            b = "tres";
                            break;
                        case 4:
                            b = "cuatro";
                            break;
                        case 5:
                            b = "cinco";
                            break;
                        case 6:
                            b = "seis";
                            break;
                        case 7:
                            b = "siete";
                            break;
                        case 8:
                            b = "ocho";
                            break;
                        case 9:
                            b = "nueve";
                            break;
                        case 10:
                            b = "diez";
                            break;
                        case 11:
                            b = "once";
                            break;
                        case 12:
                            b = "doce";
                            break;
                        case 13:
                            b = "trece";
                            break;
                        case 14:
                            b = "catorce";
                            break;
                        case 15:
                            b = "quice";
                            break;
                        case 16:
                            b = "dieciseis";
                            break;
                        case 17:
                            b = "diescisiete";
                            break;
                        case 18:
                            b = "diesciocho";
                            break;
                        case 19:
                            b = "diescinueve";
                            break;
                        case 20:
                            b = "veinte";
                            break;
                        case 21:
                            b = "veintiuna";
                            break;
                        case 22:
                            b = "veintidos";
                            break;
                        case 23:
                            b = "veintitres";
                            break;
                        case 24:
                            b = "veinticuatro";
                            break;
                        case 25:
                            b = "veinticinco";
                            break;
                        case 26:
                            b = "veintiseis";
                            break;
                        case 27:
                            b = "veintisiete";
                            break;
                        case 28:
                            b = "veintiocho";
                            break;
                        case 29:
                            b = "veintinueve";
                            break;
                        case 30:
                            b = "treinta";
                            break;
                        case 31:
                            b = "treinta y uno";
                            break;
                        case 32:
                            b = "treinta y dos";
                            break;
                        case 33:
                            b = "treinta y tres";
                            break;
                        case 34:
                            b = "treinta y cuatro";
                            break;
                        case 35:
                            b = "treinta y cinco";
                            break;
                        case 36:
                            b = "treinta y seis";
                            break;
                        case 37:
                            b = "treinta y siete";
                            break;
                        case 38:
                            b = "treinta y ocho";
                            break;
                        case 39:
                            b = "treinta y nueve";
                            break;
                        case 40:
                            b = "cuarenta";
                            break;
                        case 41:
                            b = "cuarenta y uno";
                            break;
                        case 42:
                            b = "cuarenta y dos";
                            break;
                        case 43:
                            b = "cuarenta y tres";
                            break;
                        case 44:
                            b = "cuarenta y cuatro";
                            break;
                        case 45:
                            b = "cuarenta y cinco";
                            break;
                        case 46:
                            b = "cuarenta y seis";
                            break;
                        case 47:
                            b = "cuarenta y siente";
                            break;
                        case 48:
                            b = "cuarenta y ocho";
                            break;
                        case 49:
                            b = "cuarenta y nueve";
                            break;
                        case 50:
                            b = "cincuenta";
                            break;
                        case 51:
                            b = "cincuenta y uno";
                            break;
                        case 52:
                            b = "cincuenta y dos";
                            break;
                        case 53:
                            b = "cincuenta y tres";
                            break;
                        case 54:
                            b = "cincuenta y cuatro";
                            break;
                        case 55:
                            b = "cincuenta y cinco";
                            break;
                        case 56:
                            b = "cincuenta y seis";
                            break;
                        case 57:
                            b = "cincuenta y siete";
                            break;
                        case 58:
                            b = "cincuenta y ocho";
                            break;
                        case 59:
                            b = "cincuenta y nueve";
                            break;
                        case 60:
                            b = "sesenta";
                            break;
                        default:
                    }
                    return respuesta = a + " y " + b;
                }
                return "por favor, introduce un valor válido";
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return respuesta;
    }
}
