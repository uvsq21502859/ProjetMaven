package fr.uvsq.coo.ex3_8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class PersonnelTest {
    
	Personnel perso = new Personnel.Builder("Nom","Prenom").fonction("Etudiant").telephone("05568658652").build() ;
	@Test
    public void ecrireObjet()  
    {
  	 try(ObjectOutputStream out = new 
  		ObjectOutputStream(new BufferedOutputStream(new FileOutputStream
  		("/home/user/eclipse-java-mars-workspace/ProjetMaven/fr.uvsq.coo/src/main/java/fr/uvsq/coo/ex3_8/dataFilePersonnel.xml")))){
				
			out.writeObject(perso);		
			}
    	catch(IOException e){}
	   }
    
	  @Test
	  public void lireObjet() {
	   try(ObjectInputStream in = new 
	    ObjectInputStream(new BufferedInputStream(new FileInputStream
	   ("/home/user/eclipse-java-mars-workspace/ProjetMaven/fr.uvsq.coo/src/main/java/fr/uvsq/coo/ex3_8/dataFilePersonnel.xml")))){
	   	
			try{ while(true){
					Personnel p= (Personnel)in.readObject();
					p.afficher();}							
				}
			catch(ClassNotFoundException e){}			
			}
					
		catch(IOException e){}
			}
	     
	
}


