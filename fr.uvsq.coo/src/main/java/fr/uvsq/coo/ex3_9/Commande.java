package fr.uvsq.coo.ex3_9;

public abstract class Commande implements Cloneable {

	
	
	public abstract void execute();
	public abstract void undo();
	
	
	public Commande clone(){
		try{return (Commande) super.clone();}
		
		catch(CloneNotSupportedException e){
			System.err.print("");
			throw new RuntimeException();
			
		}
	}
	
}
