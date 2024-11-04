package classes;

public class Enseignant extends User{
	private String grade;
	private String specialite;
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	@Override
	public String toString() {
		return "Enseignant [grade=" + grade + ", specialite=" + specialite + ", toString()=" + super.toString() + "]";
	}
	public Enseignant(String nom, String prenom, int age, String email, String password, String adresse, String grade,
			String specialite) {
		super(nom, prenom, age, email, password, adresse);
		this.grade = grade;
		this.specialite = specialite;
	}
	

}
