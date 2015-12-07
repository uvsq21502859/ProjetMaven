package fr.uvsq.coo.ex4_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonnelDAO_XML extends DAOXML<Personnel> {

	@Override
	public Personnel create(Personnel obj) {
		 try(ObjectOutputStream out = new 
			  		ObjectOutputStream(new BufferedOutputStream(new FileOutputStream
			  		("/home/user/eclipse-java-mars-workspace/ProjetMaven/fr.uvsq.coo/src/main/java/fr/uvsq/coo/ex3_8/dataFilePersonnel.xml")))){
							
						out.writeObject(obj);
						return obj;	}
			    	catch(IOException e){}
		return null;
	}

	@Override
	public Personnel find(String id) {
		try(ObjectInputStream in = new 
			    ObjectInputStream(new BufferedInputStream(new FileInputStream
			   ("/home/user/eclipse-java-mars-workspace/ProjetMaven/fr.uvsq.coo/src/main/java/fr/uvsq/coo/ex3_8/dataFilePersonnel.xml")))){
			   	
					try{ while(true){
							Personnel p= (Personnel)in.readObject();
							
							if(p.getId().equals(id)) return p;}							
						}
					catch(ClassNotFoundException e){}			
					}
							
				catch(IOException e){}
					
		return null;
	}

	@Override
	public Personnel update(Personnel obj)  {
		 try(ObjectOutputStream out = new 
			  		ObjectOutputStream(new BufferedOutputStream(new FileOutputStream
			  		("/home/user/eclipse-java-mars-workspace/ProjetMaven/fr.uvsq.coo/src/main/java/fr/uvsq/coo/ex3_8/dataFilePersonnel.xml")))){
							
						out.writeObject(obj);
						return obj;}
        catch(IOException e){}
		return null;
	}

	@Override
	public void delete(Personnel obj) {
		// TODO Auto-generated method stub
		
	}

}
