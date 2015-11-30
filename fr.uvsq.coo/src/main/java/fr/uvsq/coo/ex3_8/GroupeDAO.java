package fr.uvsq.coo.ex3_8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GroupeDAO extends DAO<Groupe> {

	@Override
	public Groupe create(Groupe obj) {
		try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream
	              (new FileOutputStream(
	               "/home/user/eclipse-java-mars-workspace/ProjetMaven/fr.uvsq.coo/src/main/java/fr/uvsq/coo/ex3_8/dataFileGroupe.xml")))){
						
				for(int i=0;i<obj.liste.size();i++)
					out.writeObject(obj.liste.get(i));
				return obj;}
			
			catch(IOException e){System.out.println(e);}
		return null;
	}

	@Override
	public Groupe find(String id) {
		
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream
				 (new FileInputStream(
				 "/home/user/eclipse-java-mars-workspace/ProjetMaven/fr.uvsq.coo/src/main/java/fr/uvsq/coo/ex3_8/dataFileGroupe.xml")))){    	
				try{while(true)
				{Groupe g= (Groupe)in.readObject();
				if(g.getNom().equals(id)) return g;
				}
					}
				
				catch(ClassNotFoundException e){}	}
							
				catch(IOException e){System.out.println(e);}
		
		
		return null;
	}

	@Override
	public Groupe update(Groupe obj) {
		try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream
	              (new FileOutputStream(
	               "/home/user/eclipse-java-mars-workspace/ProjetMaven/fr.uvsq.coo/src/main/java/fr/uvsq/coo/ex3_8/dataFileGroupe.xml")))){
						
				for(int i=0;i<obj.liste.size();i++)
					out.writeObject(obj.liste.get(i));
				return obj;}
			
			catch(IOException e){System.out.println(e);}
		return null;
		
	}

	@Override
	public void delete(Groupe obj) {
		// TODO Auto-generated method stub
		
	}

}
