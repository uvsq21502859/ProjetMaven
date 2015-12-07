package fr.uvsq.coo.ex3_8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class GroupeTest {

	
		
		
		
		@Test
		public void ecrireObjet()  
	      {
			Personnel perso = new Personnel.Builder("","Nom","Prenom").fonction("Etudiant").telephone("05568658652").build() ;
			 Personnel perso1 = new Personnel.Builder("","N","P").fonction("Etudiant").telephone("05568658652").build() ;
			 Groupe g1=new Groupe("g1");
			 Groupe g2 = new Groupe("groupe2");
			 g1.add(perso);
			 
			 g2.add(perso1);
			 g1.add(g2);
	    	try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream
	              (new FileOutputStream(
	               "/home/user/eclipse-java-mars-workspace/ProjetMaven/fr.uvsq.coo/src/main/java/fr/uvsq/coo/ex3_8/dataFileGroupe.xml")))){
						
				for(int i=0;i<g1.liste.size();i++)
					out.writeObject(g1.liste.get(i));}
			
			catch(IOException e){System.out.println(e);}
		   }
	
		@Test
		  public void lireObjet() {
			try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream
			 (new FileInputStream(
			 "/home/user/eclipse-java-mars-workspace/ProjetMaven/fr.uvsq.coo/src/main/java/fr/uvsq/coo/ex3_8/dataFileGroupe.xml")))){    	
			try{while(true)
			{Racine g= (Racine)in.readObject();
			g.afficher();}
				}
			
			catch(ClassNotFoundException e){}	}
						
			catch(IOException e){System.out.println(e);}
				
			 }
		
    


}
