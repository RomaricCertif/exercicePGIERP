package consommateur;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FormCreationCompte {
	
	public static void main(String[] args) {
		
		
		HashMap<String, User> map=new HashMap<String, User>();
		
		JFrame formCreateAccompe=new JFrame();
		formCreateAccompe.setTitle("Creation e compte");
		formCreateAccompe.setSize(600, 600);
		
		formCreateAccompe.setLayout(new FlowLayout());
		
		JLabel jLabel=new JLabel("Votre compte");
		JTextField textAcompte =new JTextField(10);
		formCreateAccompe.getContentPane().add(jLabel);
		formCreateAccompe.getContentPane().add(textAcompte);
		
		JLabel lablePAssword=new JLabel("Votre mot de passe");
		JPasswordField jPasswordField=new JPasswordField(10);
		
		formCreateAccompe.getContentPane().add(lablePAssword);
		formCreateAccompe.getContentPane().add(jPasswordField);
		
		
		JLabel lablePrenom=new JLabel("Votre Prénom");
		JTextField textPrenom =new JTextField(10);
		
		formCreateAccompe.getContentPane().add(lablePrenom);
		formCreateAccompe.getContentPane().add(textPrenom);
		
		JLabel lableNom=new JLabel("Votre nom");
		JTextField textNom=new JTextField(10);
		
		formCreateAccompe.getContentPane().add(lableNom);
		formCreateAccompe.getContentPane().add(textNom);
		
		JButton button=new JButton("Créer un compte");
		formCreateAccompe.getContentPane().add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			   User user=new User();
			   user.setFirstName(textNom.getText().toString());
			   user.setLastName(textPrenom.getText().toString());
			   user.setPassword(jPasswordField.getText().toString());
			   user.setLogin(textAcompte.getText());
			   User alreadyUser=map.get(user.getLogin());
			   if (alreadyUser!=null){
				   JOptionPane.showMessageDialog(null,"Un utilisateur possedant le même login existe deja");
			   }else{
				   map.put(user.getLogin(), user);
				   map.put(null, user);
				    ArrayList l=new ArrayList();
				    Iterator iterator=l.iterator();
				    while(iterator.hasNext()){
				    	Object object=iterator.next();
				    	System.out.println("hdqhqdh");
				    }
				    
				   JOptionPane.showMessageDialog(null,"Utilisateur crée");
			   }
			   try {
				user.createAccount();
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}
			}
		});
		
		formCreateAccompe.setVisible(true);
	}

}
