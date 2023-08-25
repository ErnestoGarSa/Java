package com.ernesto;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "testJava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/ernestogarciasantana/IdeaProjects/Java/TestDB/" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";


    public static void main(String[] args) {

        try {
            //1-Crear conexion
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);

            //2-Crear el statement
            Statement statement = conn.createStatement();

            //3-Ejecutar el statement
            statement.execute("DROP TABLE  IF EXISTS " + TABLE_CONTACTS);
            System.out.println("DROPING");

            //statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS + " (" + COLUMN_NAME + " text, " + COLUMN_PHONE + " integer," + COLUMN_EMAIL + " text)");
            System.out.println("CREATING");

            statement.execute("INSERT INTO " + TABLE_CONTACTS + "(" + COLUMN_NAME + " ," + COLUMN_PHONE + " ," + COLUMN_EMAIL + ") VALUES ('Joe', 123456, 'joe@email.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS + "(" + COLUMN_NAME + " ," + COLUMN_PHONE + " ," + COLUMN_EMAIL + ") VALUES ('Ernesto', 654321, 'ernesto@email.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS + "(" + COLUMN_NAME + " ," + COLUMN_PHONE + " ," + COLUMN_EMAIL + ") VALUES ('Alex', 987654, 'alex@email.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS + "(" + COLUMN_NAME + " ," + COLUMN_PHONE + " ," + COLUMN_EMAIL + ") VALUES ('Tim', 852369, 'tim@email.com')");
            System.out.println("INSERTING");

            // statement.execute("UPDATE contacts SET phone = 987654 WHERE name = 'Joe'");
            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " + COLUMN_PHONE + " = 987654 WHERE " + COLUMN_NAME + " = 'Joe'");
            System.out.println("UPDATING");

            //statement.execute("DELETE FROM contacts WHERE name = 'Tim'");
            statement.execute("DELETE FROM " + TABLE_CONTACTS + " WHERE " + COLUMN_NAME + " = 'Tim'");
            System.out.println("DELETING");

            //statement.execute("SELECT * FROM contacts");
            //ResultSet results = statement.getResultSet();
            //ResultSet results = statement.executeQuery("SELECT * FROM contacts");
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " +
                        results.getString("email"));
            }
            results.close();

            //4-Cerrar el statement
            statement.close();

            //5-Cerrar la conexion
            conn.close();


        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
