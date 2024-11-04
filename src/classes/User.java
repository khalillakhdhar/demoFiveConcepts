package classes;

public class User {
	private String nom;
	private String prenom;
	private int age;
	private String email;
	private String password;
	private String adresse;
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public User(String nom, String prenom, int age, String email, String password, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.email = email;
		this.password = password;
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "User [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", email=" + email + ", password="
				+ password + ", adresse=" + adresse + "]";
	}
	public String authentifier()
	{
		if(this.getEmail().equals("user@gmail.com")&&this.password.equals("passuser"))
		{
			return "bienvenu "+this.getNom();
		}
		else 
			return "compte non reconnu";
		
	}
	
	
	

}
