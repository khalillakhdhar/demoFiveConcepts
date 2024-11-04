package classes;

public class Etudiant extends User{
	private String groupe;
	private int niveau;
	private double moyenne;
	public String getGroupe() {
		return groupe;
	}
	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public double getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
	@Override
	public String toString() {
		return "Etudiant [groupe=" + groupe + ", niveau=" + niveau + ", moyenne=" + moyenne + ", toString()="
				+ super.toString() + "]";
	}
	public Etudiant(String nom, String prenom, int age, String email, String password, String adresse, String groupe,
			int niveau, double moyenne) {
		super(nom, prenom, age, email, password, adresse);
		this.groupe = groupe;
		this.niveau = niveau;
		this.moyenne = moyenne;
	}
	
	
	

}
