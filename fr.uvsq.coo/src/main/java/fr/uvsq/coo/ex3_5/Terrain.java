package fr.uvsq.coo.ex3_5;

import java.util.ArrayList;
import java.util.List;

public class Terrain {
         List<Robot> listeRobot= new ArrayList<Robot>();
         
         /*2)
          * Implémentation de la classe avancerTous() qui fait avancer tous les Robots*/
         public void avancerTous(){
        	 for(int i=0; i<listeRobot.size();i++)
        		 listeRobot.get(i).avancer();
         }
}
