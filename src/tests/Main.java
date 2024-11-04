package tests;

import classes.Adminstrateur;
import classes.Enseignant;
import classes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User us1=new User("us1", "u1", 20, "user@gmail.com", "passuser", "DZ");
		System.out.println(us1.authentifier());
		Enseignant ens=new Enseignant("ens", "enseignant1", 40, "ens@gmail.com", "mypass","TN", "conference", "IOT");
		System.out.println(ens.authentifier());
		Adminstrateur admin=new Adminstrateur("admin", "admin", 60, "admin@gmail.com", "adminpass", "marroc", "RH","123AZERTY");
		System.out.println(admin.authentifier());
	}

}
