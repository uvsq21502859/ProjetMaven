package fr.uvsq.coo.ex3_8;

public class Client {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Personnel perso = new Personnel.Builder("Nom","Prenom").build() ;
		 Personnel perso1 = new Personnel.Builder("N","P").build() ;
		 //perso.afficher();
		 
		 Groupe g1 = new Groupe("groupe1");
		 Groupe g2 = new Groupe("groupe2");
		 g1.add(perso);
		 g1.add(g2);
		 g2.add(perso1);
		 g1.affichageEnLargeur();
	}

}
