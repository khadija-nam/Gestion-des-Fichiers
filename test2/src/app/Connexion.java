package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    public Connexion() throws SQLException{
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection connect =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/newdatabase","root" , "");
            System.out.println("Connecte ");
        } catch (ClassNotFoundException e) {
            System.err.println("Erreur");
        }
    }
    }
