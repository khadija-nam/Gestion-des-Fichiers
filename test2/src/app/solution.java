package app;


import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.util.Scanner;

public class solution extends JFrame {

    private JTextField info;
    Scanner input = new Scanner(System.in);

    public solution() {

        super("Rock Paper Scissors");

        //creates the text fields
        info = new JTextField("Creer une nouveau fichier");
        info.setEditable(false);
        JTextField userName = new JTextField("");
        JButton create = new JButton("Create");
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ee) {
                System.out.println("clicked !");

                PrintWriter writer = null;
                try {
                    writer = new PrintWriter(FileExtensionFilterDemo.selectedFolder + "/" + userName.getText(), "UTF-8");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                writer.close();
            }
        });


        //adds the fields to the Content Layout
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(info, BorderLayout.NORTH);
        content.add(userName, BorderLayout.SOUTH);
        content.add(create, BorderLayout.EAST);
        ////////////
        //////////
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(content);
        setTitle("Creer un nouveau fichier");
        pack();
        setVisible(true);


    }


}
