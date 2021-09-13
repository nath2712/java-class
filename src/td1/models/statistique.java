package td1.models;

import java.util.List;

public class statistique {
	public double ageMoyen(List<Td1> Utilisateur) {
		double r =0;
		for (Td1 u:Utilisateur) {
			r+=u.getAge();
			
		}
	return r/Utilisateur.size();
	}
	
	public static List<Td1> getUtilisateursParPrenom(List<Td1> utilisateurs, String prenom){
		
	}
	public static List<Td1> getUtilisateursParPrenom(List<Td1> utilisateurs, int age){
		
	}
}
