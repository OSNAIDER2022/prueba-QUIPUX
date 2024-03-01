package com.amsterdam.presentacionDePruebaQuipux.IDao;

import com.amsterdam.presentacionDePruebaQuipux.model.NumeroEntero;

import java.util.List;

public interface IDaoGeneral<T> {
    T guardar(T t);
    T buscar(Integer id);
    void actualizar(T t);
    void eliminar(Integer id);
    List<T> buscarTodos();
    String consultar(T t);

}
