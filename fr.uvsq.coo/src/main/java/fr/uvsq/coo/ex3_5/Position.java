package fr.uvsq.coo.ex3_5;

public class Position {
	private float x;
	private float y;
 
	
	public Position(float X, float Y){
		x=X;
		y=Y;
	}

	public void translate(float x,float y){
		this.x+=x;
		this.y+=y;
	}
	
	public float getX(){return this.x;}
	public float getY(){return this.y;}
}
