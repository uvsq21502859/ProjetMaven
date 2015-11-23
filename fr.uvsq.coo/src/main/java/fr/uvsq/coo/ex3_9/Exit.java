package fr.uvsq.coo.ex3_9;

public class Exit extends Commande {

	
	public void undo(){}
	
	//Sortir du programmme
	public void exit(){
		System.exit(0);
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
}
