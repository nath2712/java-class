package td1.models;

public class Td1 {

		private String nom;
		private String prenom;
		private int age;
		public Td1(String prenom, String nom, int age) {
			this.prenom=prenom;
			this.nom=nom;
			setAge(age);
			
		}
		public Td1(String prenom, String nom) {
			this.prenom=prenom;
			this.nom=nom;
			
			
		}
		public String getNom() {
			return nom;
		}
		public String setNom(String nom) {
			return this.nom= nom;
		}
		
		@Override
		public String toString() {
			return nom+" "+prenom;
			
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
			if(age<18){  		
				this.age = 18;
			}
			else if (age>126) {
			  		
					this.age = 126;
				
			}
			}
			
		}
	
		 
			
		
		
	

