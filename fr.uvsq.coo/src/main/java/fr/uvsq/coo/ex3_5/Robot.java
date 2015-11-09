package fr.uvsq.coo.ex3_5;

class Robot extends RobotGenerique {

    @Override
	public void avancer(){/*Fait avancer le robot d'une case*/
    	 if(this.direction.equals("Est")) this.position.translate(0,1);
		 else if(this.direction.equals("Nord")) this.position.translate(1,0);
	     else if(this.direction.equals("Ouest")) this.position.translate(0,-1);
	     else this.position.translate(-1,0);
    }
    
    
    
    
}
