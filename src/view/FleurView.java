package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FleurView extends JPanel
{
    private static JButton ajouterFleur, supprFleur, modifierProduit;
    private static JTable table;

    public FleurView()
    {
        //Creation du panel principale
        this.setLayout(new BorderLayout(0, 0));
        this.setBackground(new Color(78, 160, 164));

        //Creation panel de gauche pour mettre les boutons
        JPanel panel = new JPanel();
        this.add(panel, BorderLayout.WEST);

        //Creation d'une boite pour insérer les boutons
        Box boiteVertical = Box.createVerticalBox();
        panel.add(boiteVertical);

        //Initialisation de la table
        //Donnée de la table / Devra être connecté à la BDD
        String[][] data = {{"Rose","100","Rouge","10","2","5","2"},{"Tiare","200","Blanc","50","3","4","3"}};
        String[] colonne = {"Nom", "Prix", "Couleur", "Taille","Age","Durée de vie", "Quantité", };

        table = new JTable(data, colonne);
        table.setBounds(20,20,200,400);
        this.add(table);

        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane);
        this.setVisible(true);

        //Création du bouton pour rajouter une fleur
        ajouterFleur = new JButton("Ajouter");
        boiteVertical.add(ajouterFleur);
        String textBox = "some text here";
        ajouterFleur.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ajouterFleur, textBox);
            }
        });
    }

    //Action des boutons
    public static void ajouterFleurListener(ActionListener ajouterFleurListener)
    {
        ajouterFleur.addActionListener(ajouterFleurListener);
    }
}