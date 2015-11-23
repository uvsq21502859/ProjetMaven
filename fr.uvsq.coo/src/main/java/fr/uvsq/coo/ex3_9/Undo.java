package fr.uvsq.coo.ex3_9;

import java.util.Stack;

class Undo extends Commande {

	protected Stack history;
	
	public Undo(Stack h)
	{history=h;}
	
	
	public void execute(){
		((Commande)history.pop()).undo();		
	}
	public void undo(){}
	
}
