package fr.uvsq.coo.ex3_8;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Racine    {

    private String nom = new String();	
	List<Racine> liste = new ArrayList<Racine>();
	
	@Override
	public void afficher(){
		System.out.println(nom);
		for(int i=0;i<liste.size();i++)
		liste.get(i).afficher();
	}
	/*Constructeur sans paramétre d'un groupe*/
	public Groupe(String nom){
		this.nom=nom;
	}
	
	/*Affichage du nom de groupe*/
	public void afficherNom()
	{System.out.println(nom);}
	
	/*Ajouter un element au groupe*/
	public void add(Racine element){
		liste.add(element);
	}
	
	/*Enlever un element du groupe*/
	public void remove (Racine element){
		liste.remove(element);
	}

    public void affichageEnProfondeur(){
    	afficher();     
    }
 
    public void affichageEnLargeur(){
    	System.out.println(nom);
    	List<Racine> parcours = new ArrayList<Racine>();
    	if(liste.size()==0);
    	else{
		
    	for(int i=0;i<liste.size();i++)
		if(liste.get(i) instanceof Personnel)
			liste.get(i).afficher();
		else if(liste.get(i) instanceof Groupe)
			{Groupe temp =(Groupe)liste.get(i);
			 temp.afficherNom();
			 parcours=temp.liste;
			 for(int j=0;i<parcours.size();i++)
				 parcours.get(j).afficher();
				 
						}
    	
		}
    	
    }
	
	
}
