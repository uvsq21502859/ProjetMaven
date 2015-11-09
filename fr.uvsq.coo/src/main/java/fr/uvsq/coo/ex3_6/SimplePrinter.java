package fr.uvsq.coo.ex3_6;
/* 1)Cette solution peut poser des problèmes de mise à jour
 * 
 * 2)Le changement de la methode fax(), entraine le fait que la classe SimpleSprinter qui l'implemente aussi
 * doit faire une mise à jour de sa methode fax() alors qu'elle ne l'utilise jamais, si non il y aura une erreur
 * 
 * 3)Solution respectant ISP, créer quatre interface de sorte qu'on ait une méthode par interface
 * */

public class SimplePrinter implements PrinterPr {
	public void print(){/*print a document*/}

}
