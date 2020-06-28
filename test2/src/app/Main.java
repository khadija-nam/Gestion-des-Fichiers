package app;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JFileChooser;

public class Main {
    public Main() throws SQLException {
    }

    public static void main(String[] args)  {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (Exception e) {
        }


        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileExtensionFilterDemo();

            }
        });
        {
            JFileChooser dialogue = new JFileChooser();

            // affichage
            dialogue.showOpenDialog(null);

            // récupération du fichier sélectionné
            System.out.println("Fichier choisi : " + dialogue.getSelectedFile());
        }

    }
 Connexion c =new Connexion();
}