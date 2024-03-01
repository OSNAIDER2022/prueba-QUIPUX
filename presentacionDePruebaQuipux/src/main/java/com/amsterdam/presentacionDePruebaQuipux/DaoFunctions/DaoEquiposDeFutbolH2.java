package com.amsterdam.presentacionDePruebaQuipux.DaoFunctions;

import com.amsterdam.presentacionDePruebaQuipux.DB.Database;
import com.amsterdam.presentacionDePruebaQuipux.IDao.IDaoGeneral;
import com.amsterdam.presentacionDePruebaQuipux.model.EquipoDeFutbol;


import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DaoEquiposDeFutbolH2 implements IDaoGeneral<EquipoDeFutbol> {
    //SQL QUERIES:
    private static final String SQL_INSERT = "insert into EQUIPO(NOMBRE_DEL_EQUIPO, NOMBRE_DEL_ESTADIO, CANTIDAD_DE_TITULOS) values(?,?,?);";
    private static final String SQL_SEARCH_BY_ID = "SELECT * FROM EQUIPO WHERE ID = ?;";
    private static final String SQL_UPDATE = "UPDATE EQUIPO SET NOMBRE_DEL_EQUIPO = ?, SET NOMBRE_DEL_ESTADIO = ?, SET CANTIDAD_DE_TITULOS = ? WHERE ID = ?;";
    private static final String SQL_DELETE = "DELETE FROM EQUIPO WHERE ID = ?;";
    private static final String SQL_ALLSEARCH = "SELECT * FROM EQUIPO INNER JOIN JUGADOR ON JUGADOR.ID = EQUIPO.JUGADOR_ID;";

    @Override
    public EquipoDeFutbol guardar(EquipoDeFutbol equipoDeFutbol) {
        Connection connection = null;

        try {
            connection = Database.getConnection();

            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            psInsert.setString(1,equipoDeFutbol.getNombreDelEquipo());
            psInsert.setString(2,equipoDeFutbol.getNombreDelEstadio());
            psInsert.setInt(3,equipoDeFutbol.getCantidadDeTitulos());
            psInsert.execute();

            ResultSet rs = psInsert.getGeneratedKeys();

            while (rs.next()){
                equipoDeFutbol.setId(rs.getInt(1));

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
        return equipoDeFutbol;
    }

    @Override
    public EquipoDeFutbol buscar(Integer id) {
        Connection connection = null;
        EquipoDeFutbol equipoDeFutbol = null;

        try{
            connection = Database.getConnection();
            PreparedStatement psSearchById = connection.prepareStatement(SQL_SEARCH_BY_ID);
            psSearchById.setInt(1,id);

            ResultSet rs = psSearchById.executeQuery();

            while (rs.next()){
                equipoDeFutbol = new EquipoDeFutbol(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
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
        return equipoDeFutbol;
    }

    @Override
    public void actualizar(EquipoDeFutbol equipoDeFutbol) {
        Connection connection = null;

        try {

            connection =  Database.getConnection();
            PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
            psUpdate.setString(1,equipoDeFutbol.getNombreDelEquipo());
            psUpdate.setString(2,equipoDeFutbol.getNombreDelEstadio());
            psUpdate.setInt(3,equipoDeFutbol.getCantidadDeTitulos());
            psUpdate.setInt(4,equipoDeFutbol.getId());
            psUpdate.execute();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

    @Override
    public void eliminar(Integer id) {
        Connection connection = null;

        try {

            connection = Database.getConnection();
            PreparedStatement psDelete = connection.prepareStatement(SQL_DELETE);
            psDelete.setInt(1,id);
            psDelete.execute();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

    @Override
    public List<EquipoDeFutbol> buscarTodos() {
        Connection connection = null;
        EquipoDeFutbol equipoDeFutbol = null;
        List<EquipoDeFutbol> equipoDeFutbolList = new ArrayList<>();

        try {

            connection = Database.getConnection();
            PreparedStatement psSearchAll = connection.prepareStatement(SQL_ALLSEARCH);

            ResultSet rs = psSearchAll.executeQuery();

            while (rs.next()){
                equipoDeFutbol = new EquipoDeFutbol(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                equipoDeFutbolList.add(equipoDeFutbol);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (SQLException e2){
                e2.printStackTrace();
            }
        }
        return equipoDeFutbolList;
    }

    @Override
    public String consultar(EquipoDeFutbol equipoDeFutbol) {
        return null;
    }
}
