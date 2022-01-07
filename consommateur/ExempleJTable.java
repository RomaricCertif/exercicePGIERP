package consommateur;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import fournisseur.MonExeception;
import fournisseur.SuperCalculette;

public class ExempleJTable {

	public static void main(String[] args) {
		 final JFrame frame = new JFrame("Exemple de JTable");
		 
	        //En-t�tes pour JTable 
	        String[] columns = new String[] {
	            "Id", "Nom", "Adresse", "Taux horaire", "A temps partiel"
	        };
	         
	        //donn�es pour JTable dans un tableau 2D
	        Object[][] data = new Object[][] {
	            {1, "Thomas", "Paris", 20.0, true },
	            {2, "Jean", "Marseille", 50.0, false },
	            {3, "Yohan", "Lyon", 30.0, true },
	            {4, "Emily", "Toulouse", 60.0, false },
	            {5, "Alex", "Nice", 10.0, false },
	        };
	 
	        //cr�e un JTable avec des donn�es
	        JTable table = new JTable(data, columns);
	    
	        JScrollPane scroll = new JScrollPane(table);
	        table.setFillsViewportHeight(true);
	 
	        JLabel labelHead = new JLabel("Liste des employes");
	        labelHead.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));
	 
	        frame.getContentPane().add(labelHead,BorderLayout.PAGE_START);
	        //ajouter la table au frame
	        frame.getContentPane().add(scroll,BorderLayout.CENTER);
	 
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(500, 200);
	        frame.setVisible(true);
		
	}
}
