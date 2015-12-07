package fr.uvsq.coo.ex4_2;

public class MainTest {

	public static void main(String[] args) {
		PersonnelDAO_JDBC.getConnexion();
		String req="CREATE TABLE Personnel(id varchar(10) primary key, Nom varchar(30),Prenom varchar(30),Date Date_de_naissance,Fonction varchar(30),Telephone varchar(30));";
		PersonnelDAO_JDBC.miseAjour(req);

	}

}
