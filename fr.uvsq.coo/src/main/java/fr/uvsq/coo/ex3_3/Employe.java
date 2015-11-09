package fr.uvsq.coo.ex3_3;

public class Employe {
         private final String nom="";
         private final String adresse="";
	
         
    //public double calculSalaire(){ return /*calcul du salaire*/;}
    public void afficherCoordonnees(){System.out.println(nom+" , "+adresse);}
/*
 * 1) cette classe respecte SRP
 * 2)Si la méthode calculSalire() change alors rien d'autre ne change dans la classe Employe
 *  * */
}
