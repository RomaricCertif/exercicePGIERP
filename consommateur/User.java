package consommateur;

public class User {
	
	private String login;
	
	private String lastName;
	
	private String firstName;
	
	private String password;
	
	public User() {
		
	}
	
	public void createAccount () throws Exception{
		if (login==null || login.isEmpty()){
			throw new  Exception("Veuillez saisir votre login");
		}
		
		if (lastName==null || lastName.isEmpty()){
			throw new  Exception("Veuillez saisir votre nom");
		}
		
		if (firstName==null || firstName.isEmpty()){
			throw new  Exception("Veuillez saisir votre prenom");
		}
		
		if (password==null || password.isEmpty()){
			throw new  Exception("Veuillez saisir votre mot de passe");
		}
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
