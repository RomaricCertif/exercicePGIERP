package consommateur;

public class Person implements I1,I2{

//	public Person() {
//
//	}

	public Person(String nom) {

	}

	@Override
	public String toString() {
		return "Person [nom=" + nom + ", genre=" + genre + ", civilite="
				+ civilite + ", genreErrone=" + genreErrone + "]";
	}

	private String nom;

	private String matricule;

	private Genre genre;

	private Civilite civilite;

	private String genreErrone;
	
	public static void calculer (){
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getGenreErrone() {
		return genreErrone;
	}

	public void setGenreErrone(String genreErrone) {
		this.genreErrone = genreErrone;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
