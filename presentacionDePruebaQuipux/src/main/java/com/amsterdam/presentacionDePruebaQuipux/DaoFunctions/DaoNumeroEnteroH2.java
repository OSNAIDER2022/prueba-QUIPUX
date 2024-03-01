package com.amsterdam.presentacionDePruebaQuipux.DaoFunctions;

import com.amsterdam.presentacionDePruebaQuipux.IDao.IDaoGeneral;
import com.amsterdam.presentacionDePruebaQuipux.model.NumeroEntero;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DaoNumeroEnteroH2 implements IDaoGeneral<NumeroEntero> {

    @Override
    public NumeroEntero guardar(NumeroEntero numeroEntero) {
        return null;
    }

    @Override
    public NumeroEntero buscar(Integer id) {
        return null;
    }

    @Override
    public void actualizar(NumeroEntero numeroEntero) {

    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public List<NumeroEntero> buscarTodos() {
        return null;
    }

    @Override
    public String consultar(NumeroEntero numeroEntero) {
        Connection connection = null;
        String respuesta = null;

        try{
            //restricciones
            if(1 <= numeroEntero.getValor() && numeroEntero.getValor() <= 100){
                //con fines de prueba
                if(numeroEntero.getValor() % 2 == 0 && numeroEntero.getValor() > 2 && numeroEntero.getValor() < 5 || numeroEntero.getValor() % 2 == 0 && numeroEntero.getValor() > 20) {
                    respuesta = "no Quipux";
                }
                else{
                    respuesta = "Quipux";
                }
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
