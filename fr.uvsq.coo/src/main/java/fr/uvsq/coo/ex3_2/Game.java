package fr.uvsq.coo.ex3_2;

public class Game {
 
	/**Le nombre de coup éffectuer*/
	
	private int rolls[] = new int[21];
	private int currentRoll = 0;
	
	public void roll(int pins) {
		
		rolls[currentRoll++] = pins;
	}
	
	/**Une fonction permettant de retourner le score total à la fin du jeu*/
	public int score(){
		int score=0;
		int frameIndex = 0;
		for (int frame = 0; frame < 10; frame++){
			if (isSpare(frameIndex)) // spare
			{
			score += 10 + rolls[frameIndex + 2];
			frameIndex += 2;
			} else {
		score += rolls[frameIndex] + rolls[frameIndex+1];
		frameIndex += 2;
		}}
		return score;
	}
	
	
	private boolean isSpare(int frameIndex) {
		return rolls[frameIndex] +
		rolls[frameIndex + 1] == 10;
		}
	
	
}
