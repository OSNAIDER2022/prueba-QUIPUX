package com.amsterdam.presentacionDePruebaQuipux.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    //ATRIBUTOS:
    private static final String SQL_VERIFY_TABLE_EXISTS = "DROP TABLE IF EXISTS JUGADOR, EQUIPO;"+
    "CREATE TABLE JUGADOR (ID INT PRIMARY KEY AUTO_INCREMENT, NOMBRE_JUGADOR VARCHAR(100) NOT NULL, POSICION_EN_EL_CAMPO VARCHAR(100) NOT NULL, ES_TITULAR VARCHAR(100) NOT NULL, EQUIPO_DE_FUTBOL_ID INT NOT NULL, FOREIGN KEY (EQUIPO_DE_FUTBOL_ID) REFERENCES EQUIPO(ID));"+
    "CREATE TABLE EQUIPO (ID INT PRIMARY KEY AUTO_INCREMENT, NOMBRE_DEL_EQUIPO VARCHAR(100) NOT NULL, NOMBRE_DEL_ESTADIO VARCHAR(100) NOT NULL, CANTIDAD_DE_TITULOS INT NOT NULL);";

    //METODOS:
    public static void crearTablas() {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_VERIFY_TABLE_EXISTS);

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~./presentacionDePruebaQuipux/src/main/resources/database/db", "admin", "admin");
    }

}