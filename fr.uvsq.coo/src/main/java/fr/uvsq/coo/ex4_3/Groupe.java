package fr.uvsq.coo.ex4_3;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Groupe extends Element {

	
	@Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )  
    private long id;
	private String nom = new String();	
	
	@OneToMany(mappedBy = "groupe")
	public List<Element> liste = new ArrayList<Element>();
	
	/**Fonction retournant l'attribut id*/
    public String getId(){return this.nom;}
    
    /**Fonction retournant l'attribut nom*/
	public String getNom(){return this.nom;}
	
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		
	}

	
}
