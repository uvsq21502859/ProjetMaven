package fr.uvsq.coo.ex4_3;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Personnel extends Element implements Serializable{

	
	    @Id
        @GeneratedValue( strategy = GenerationType.IDENTITY )  
	    private long id;
	    //@Column
	    private String nom = new String();
	    //@Column
	    private String prenom = new String();
	    //@Column
	    private String fonction = new String();
	   // @Column
	    private java.time.LocalDateTime dateNaissance;
	    //@Column
	    private String telephone = new String();
	    //@ManyToOne
	    //private String groupe;
		
	    
	    //implementation des getters
	    /**Fonction retournant l'attribut id*/
	    public long getId(){return this.id;}
	    
	    /**Fonction retournant l'attribut nom*/
		public String getNom(){return this.nom;}
		
		/**Fonction retournant l'attribut prenom*/
		public String getPrenom(){return this.prenom;}
		
		/**Fonction retournant l'attribut dateNaissance*/
		public java.time.LocalDateTime getDateNaissance(){return dateNaissance; }
		
		/**Fonction retournant l'attribut fonction*/
		public String getFonction(){return this.fonction;}
		
		/**Fonction retournant l'attribut telephone*/
		public String getTelephone(){return this.telephone;}   
	    
		//implementation des setters
		/**modifcation de l id
		 * @param id nouvel identifiant*/
		public void setId(int id){this.id=id;}		
		
		/**Modification du nom
		 * @param nom nouveau non*/
		public void setNom(String nom){this.nom=nom;}
		/**Modifiaction du prenom
		 * @param prenom  nouveau prenom*/
		public void setPrenom(String prenom){this.prenom=prenom;}
		
		/**Modifiaction du prenom
		 * @param f  nouvelle fonction*/
		public void setFonction(String f){this.fonction=f;}
		
		/**Modifiaction du prenom
		 * @param date  date de naissance*/
		public void setDareNaissance(java.time.LocalDateTime  date){this.dateNaissance=date;}
		
		/**Modifiaction du prenom
		 * @param tel numero de telephone*/
		public void setTelephone(String tel){this.telephone=tel;}
		
		
		
	    @Override
		public void afficher() {
			// TODO Auto-generated method stub
			
		}
}
