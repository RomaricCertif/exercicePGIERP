//package com.formation;
//
//import java.awt.BorderLayout;
//import java.awt.FlowLayout;
//import java.awt.Font;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//
//
//
//public class FormulaireRechercheCompte extends JFrame{
//	
//	public FormulaireRechercheCompte() {
//		 this.setSize(600, 600);
//		 setTitle("Affichage des comptes");
//		 setLayout(new FlowLayout());
//		 String[] columns = new String[] {
//		            "Id", "Nom", "Adresse", "Taux horaire", "A temps partiel"
//		        };
//		         
//		        //données pour JTable dans un tableau 2D
//		        Object[][] data = new Object[][] {
//		            {1, "Thomas", "Paris", 20.0, true },
//		            {2, "Jean", "Marseille", 50.0, false },
//		            {3, "Yohan", "Lyon", 30.0, true },
//		            {4, "Emily", "Toulouse", 60.0, false },
//		            {5, "Alex", "Nice", 10.0, false },
//		        };
//		 
//		        //crée un JTable avec des données
//		        JTable table = new JTable(data, columns);
//		    
//		        JScrollPane scroll = new JScrollPane(table);
//		        table.setFillsViewportHeight(true);
//		 
//		        JLabel labelHead = new JLabel("Liste des employes");
//		        labelHead.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));
//		 
//		        frame.getContentPane().add(labelHead,BorderLayout.PAGE_START);
//		        //ajouter la table au frame
//		        frame.getContentPane().add(scroll,BorderLayout.CENTER);
//		 
//		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		        frame.setSize(500, 200);
//	}
//
//}
