package com.ernesto;

import java.sql.*;

public class Music {

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/ernestogarciasantana/IdeaProjects/Java/TestDB/music.db");

            Statement statement = conn.createStatement();

            ResultSet results = statement.executeQuery("SELECT * FROM artists");

            while (results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("_id"));
            }
            results.close();
            conn.close();

        }catch(SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }


    }

}
