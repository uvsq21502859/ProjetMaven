package fr.uvsq.coo.ex3_8;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Racine    {

	
	List<Racine> liste = new ArrayList<Racine>();
	
	@Override
	public void afficher(){
		for(int i=0;i<liste.size();i++)
		liste.get(i).afficher();
	}
	
	/*Ajouter un personnel au groupe*/
	public void add(Racine element){
		liste.add(element);
	}
	
	/*Enlever un personnel du groupe*/
	public void remove (Racine element){
		liste.remove(element);
	}

    public void affHierarchique(){
     
    }
 
    public void affGroupe(){}
	
	
}
