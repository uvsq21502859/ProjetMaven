package fr.uvsq.coo.ex3_9;

import java.util.Hashtable;
import java.util.Stack;

public class Interpreteur {
	protected Stack history=new Stack();
	protected Hashtable<String,Commande> set=new Hashtable<String,Commande>();
	
	
	
	public void session(){
		while(true){
			Commande commande = getNewCommande();
			if(commande instanceof Exit) return;
			else
				commande.execute();
		}
	}
	
	protected Commande getNewCommande(){
		String s=SaisieRPN.getString();
		
		while(!set.containsKey(s)){
			System.err.print("Commande non valide, essayer encore");
			s=SaisieRPN.getString();
		}
		
		return ((Commande)(set.get(s))).clone();
	}

}
