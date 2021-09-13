package td1.models;

import java.util.ArrayList;
import java.util.List;
import td1.models.Td1; 
import td1.models.statistique;
public class UtilisateurTest {

	public static void main(String[] args) {
		
		List<Td1> users=new ArrayList<>();
		
		// TODO Auto-generated method stub
		System.out.println("hello world !");
		Td1 u=new Td1("Romanov","Oui",5);
		u.setNom("Oui");
		System.out.println(u);
		Td1 usansage=new Td1("pére","Fouras");
		System.out.println(usansage);
		
		
		statistique stats=new statistique();
		System.out.println(stats.ageMoyen(users));
	}

}
