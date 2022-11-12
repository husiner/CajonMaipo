package com.example.appcajon;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    private Connection connection;

    // For Amazon Postgresql
    // private final String host = "ssprojectinstance.csv2nbvvgbcb.us-east-2.rds.amazonaws.com"  

    // For Google Cloud Postgresql
    // private final String host = "35.44.16.169"; 

    private final String user = "postgres";
    private final String pass = "Guideme77maps";
    private String url = "jdbc:postgresql://%s:%d/%s";
    private boolean status;

    public Database()
    {
        // For Local PostgreSQL
        String host = "db.smhzjoffjpkiethbwyof.supabase.co";
        String database = "postgres";
        int port = 5432;
        this.url = String.format(this.url, host, port, database);
        connect();
        //this.disconnect();
        System.out.println("connection status:" + status);
    }

    private void connect()
    {
        Thread thread = new Thread(() -> {
            try
            {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(url, user, pass);
                status = true;
                System.out.println("connected:" + status);
            }
            catch (Exception e)
            {
                status = false;
                System.out.print(e.getMessage());
                e.printStackTrace();
            }
        });
        thread.start();
        try
        {
            thread.join();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            this.status = false;
        }
    }

    public Connection getExtraConnection()
    {
        Connection c = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(url, user, pass);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return c;
    }
}