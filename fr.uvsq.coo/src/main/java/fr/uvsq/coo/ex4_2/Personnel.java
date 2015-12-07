package fr.uvsq.coo.ex4_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Personnel extends Racine implements Serializable {
     
    private String nom = new String();
    private String prenom = new String();
    private String fonction = new String();
    private java.time.LocalDateTime dateNaissance;
    private String telephone = new String();
	
	public String getId(){return this.nom;}
	public String getNom(){return this.nom;}
	public String getPrenom(){return this.nom;}
	public java.time.LocalDateTime getDateNaissance(){return dateNaissance; }
	public String getFonction(){return this.nom;}
	public String getTelephone(){return this.nom;}
    //debut builder
	public static class Builder{
		String id= new String();
		String nom = new String();
		String prenom = new String();
		
		String fonction = "";
		java.time.LocalDateTime dateNaissance;
		String telephone = "";
	
		/*Initialisation du nom et prenom d'un personnel
		 * @param nom
		 * @param prenom
		 * */
		public Builder (String nom,String prenom, String id){
			this.id=id;
			this.nom=nom;
			this.prenom=prenom;
					}
		
		/*Initialisation de la fonction d'un personnel
		 * @param fonction
		 * */
		public Builder fonction (String fonction){
			this.fonction=fonction;
			return this;
		}
		
		/*Initialisation de la date de naissance  d'un personnel
		 * @param date
		 * */
		public Builder dateNaissance (java.time.LocalDateTime date){
			this.dateNaissance=date;
			return this;
		}
		
		
		/*Initialisation du numero de telephone d'un personnel*/
		public Builder telephone (String telephone){
			this.telephone=telephone;
			return this;
		}
		
		
		public Personnel build(){
			return new Personnel(this);
		}
	}
	//fin builder
	
	
	
	
	/*Constructeur privé de la classe Personnel*/
	private Personnel(Builder builder){
		this.nom=builder.nom;
		this.prenom=builder.prenom;
		this.dateNaissance=builder.dateNaissance;
		this.telephone=builder.telephone;
		this.fonction=builder.fonction;
	}
	
	@Override
	/*Procédure d'affichage les informations sur un personnel*/
	public void afficher(){
		System.out.println("Nom: "+this.nom);
		System.out.println("Prenom: "+this.prenom);
		System.out.println("Date de naissance: "+this.dateNaissance);
		System.out.println("Fonction: "+this.fonction);
		System.out.println("Telephone: "+this.telephone);
			}
	
	// ecrire, sauvegarder les données
    public void ecrireObjet()  
    {
  	  try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream
                (new FileOutputStream(
             		   "/home/user/eclipse-java-mars-workspace/ProjetMaven/fr.uvsq.coo/src/main/java/fr/uvsq/coo/ex3_8/dataFile")))){
		
		
			out.writeObject(this.nom);
			out.writeObject(this.prenom);
			out.writeObject(this.dateNaissance);
			out.writeObject(this.fonction);
			out.writeObject(this.telephone);
			}
		
		catch(IOException e){}
	   }
    
	  //Lire les données stockées
	  public void lireObjet() throws ClassNotFoundException{
	     try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream
			           (new FileInputStream(
			           "/home/user/eclipse-java-mars-workspace/ProjetMaven/fr.uvsq.coo/src/main/java/fr/uvsq/coo/ex3_8/dataFile")))){
			
	    	
			try{ 
				while(true){
					Personnel p= (Personnel)in.readObject();
					p.afficher();}
				}
			catch(IOException e){}
			
			}
					
		catch(IOException e){}
			}
	     
	
}
