package fr.uvsq.coo.ex3_9;

import java.util.Stack;

public class MoteurRPN extends Interpreteur {
       
	Stack operande = new Stack();
	
	public MoteurRPN(){
		set.put("exit", new Exit());
		set.put("undo", new Undo(history));
		//set.put("+", new Plus(history));
		//set.put("-", new Min(history));
		//set.put("*", new Mul(history));
		//set.put("/", new Div(history));
		//set.put("accept", new Plus(history));
	}
	
	
	public void enregistrerOperande(String operande){
		this.operande.push(operande);
	}
	
	public void operandes(){
		while(this.operande!=null)
            System.out.print(this.operande.pop());		
	}
}
