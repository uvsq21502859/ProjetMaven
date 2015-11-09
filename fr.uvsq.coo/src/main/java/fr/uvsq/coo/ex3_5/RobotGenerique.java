package fr.uvsq.coo.ex3_5;

/*1) Ce programme ne respecte pas LSP car RobotStatique va generer des exceptions
 *  on ne peut donc pas la remplacer pas la classe
 * Robot dont elle herite
 * 
 * 2) La méthode avancerTous() pose probleme car il va generer des exceptions pour chaque robot satatique
 * */



/*3)
 * la solution qui respecte LSP*/
public class RobotGenerique {
	
	protected Position position;
	protected Direction direction;
	
	 public void tourner(){/*Fait tourner le robot de 1/4 de tour*/
		 if(this.direction.D.equals("Est")) this.direction.D=Direction.Nord;
		 else if(this.direction.D.equals("Nord")) this.direction.D=Direction.Ouest;
		 else if(this.direction.D.equals("Ouest")) this.direction.D=Direction.Sud;
		 else this.direction.D=Direction.Sud;
	 }
	 public void avancer(){	
	 }
}
