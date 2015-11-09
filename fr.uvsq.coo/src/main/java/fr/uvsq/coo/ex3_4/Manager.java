package fr.uvsq.coo.ex3_4;

import java.util.*;
public class Manager extends Salarie {
	  private ArrayList<Employe>  employer= new ArrayList<Employe>();
	  
	  public float salaire(){
		  @SuppressWarnings("deprecation")
		   int s=new Date().getYear()-anneeDebut;
		  float salaire= (s*20+this.salaire)+ employer.size();
		  return salaire;
		  }
}
