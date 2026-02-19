package MODELE;

public class PERSONNE {
	private int id;
	private String nom;
	private String prenom;
	private String password;
	private String login;
	
	//Elaboration des getteurs et setters dans source 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public PERSONNE() {
		super();
	}
	
	//Elaboration des Constructeurs dans source avec paramétre
	
	public PERSONNE(int id, String nom, String prenom, String password, String login) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.login = login;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
