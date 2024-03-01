package com.amsterdam.presentacionDePruebaQuipux.DaoFunctions;

import com.amsterdam.presentacionDePruebaQuipux.DB.Database;
import com.amsterdam.presentacionDePruebaQuipux.IDao.IDaoGeneral;
import com.amsterdam.presentacionDePruebaQuipux.model.Jugador;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class DaoJugadoresH2 implements IDaoGeneral<Jugador> {
    //SQL QUERIES:
    private static final String SQL_INSERT = "INSERT INTO JUGADOR(NOMBRE_JUGADOR, POSICION_EN_EL_CAMPO, ES_TITULAR, EQUIPO_DE_FUTBOL_ID ) VALUES(?,?,?,?);";
    private static final String SQL_SEARCH_BY_ID = "SELECT * FROM JUGADOR WHERE ID = ?;";
    private static final String SQL_UPDATE = "UPDATE JUGADOR SET NOMBRE_JUGADOR = ?, SET POSICION_EN_EL_CAMPO = ?, SET ES_TITULAR = ?, SET EQUIPO_DE_FUTBOL_ID =? WHERE ID = ?;";
    private static final String SQL_DELETE = "DELETE FROM JUGADOR WHERE ID = ?;";
    private static final String SQL_ALLSEARCH = "SELECT * FROM JUGADOR;";


    //METODOS:
    @Override
    public Jugador guardar(Jugador jugador) {
        Connection connection = null;

        try{
            connection = Database.getConnection();

            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            psInsert.setString(1, jugador.getNombreJugador());
            psInsert.setString(2, jugador.getPosicionEnElCampo());
            psInsert.setString(3, jugador.getEsTitular());
            psInsert.setInt(4,jugador.getEquipoDeFutbol_id());
            psInsert.execute();

            ResultSet rs = psInsert.getGeneratedKeys();

            while (rs.next()){
                jugador.setId(rs.getInt(1));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return jugador;
    }

    @Override
    public Jugador buscar(Integer id) {
        Connection connection = null;
        Jugador jugador = null;

        try{
            connection = Database.getConnection();
            PreparedStatement psSearchById = connection.prepareStatement(SQL_SEARCH_BY_ID);
            psSearchById.setInt(1,id);

            ResultSet rs = psSearchById.executeQuery();

            while (rs.next()){
                jugador = new Jugador(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return jugador;
    }

    @Override
    public void actualizar(Jugador jugador) {
        Connection connection = null;

        try{
            connection = Database.getConnection();
            PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
            psUpdate.setString(1, jugador.getNombreJugador());
            psUpdate.setString(2,jugador.getPosicionEnElCampo());
            psUpdate.setString(3,jugador.getEsTitular());
            psUpdate.setInt(4, jugador.getEquipoDeFutbol_id());
            psUpdate.execute();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

    @Override
    public void eliminar(Integer id) {
        Connection connection = null;
        Jugador jugador = null;

        try{
            connection = Database.getConnection();
            PreparedStatement psDelete = connection.prepareStatement(SQL_DELETE);
            psDelete.setInt(1,id);
            psDelete.execute();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

    @Override
    public List<Jugador> buscarTodos() {
        Connection connection = null;
        Jugador jugador = null;
        List<Jugador> jugadorList = new ArrayList<>();

        try{
            connection = Database.getConnection();
            PreparedStatement psSearchAll = connection.prepareStatement(SQL_ALLSEARCH);

            ResultSet rs = psSearchAll.executeQuery();

            while (rs.next()){
                jugador = new Jugador(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
                jugadorList.add(jugador);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return jugadorList;
    }

    @Override
    public String consultar(Jugador jugador) {
        return null;
    }
}
