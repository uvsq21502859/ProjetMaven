package fr.uvsq.coo.ex3_7;

import java.time.LocalDateTime;

public class Affichage {
	
		
	public Affichage(){}
	
	public static  void afficherDebut(String m){
		System.out.println(LocalDateTime.now()+" : "+m);
	}
	
	public static void afficherFin(String m){
		System.out.println(LocalDateTime.now()+" : "+m);
	}

}
