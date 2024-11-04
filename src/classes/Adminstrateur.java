package classes;

public class Adminstrateur extends User{
private String departement;
private String secret;
public String getDepartement() {
	return departement;
}

public void setDepartement(String departement) {
	this.departement = departement;
}

public Adminstrateur() {
	super();
	// TODO Auto-generated constructor stub
}





public String getSecret() {
	return secret;
}

public void setSecret(String secret) {
	this.secret = secret;
}

public Adminstrateur(String nom, String prenom, int age, String email, String password, String adresse,
		String departement, String secret) {
	super(nom, prenom, age, email, password, adresse);
	this.departement = departement;
	this.secret = secret;
}

@Override
public String toString() {
	return "Adminstrateur [departement=" + departement + ", Coordonnées=" + super.toString() + "]";
}
@Override
public String authentifier()
{
	if(this.getSecret().equals("123AZERTY")&&super.getPassword().equals("adminpass"))
	{
		return "bienvenu admin";
	}
	else 
		return "compte non reconnu";
	
}


}
