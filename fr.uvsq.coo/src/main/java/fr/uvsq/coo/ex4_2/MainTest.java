package fr.uvsq.coo.ex4_2;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MainTest {

	public static void main(String[] args) {
		
			//PersonnelDAO_JDBC.getConnexion();
		
		//String req="CREATE TABLE Personnel(id varchar(10) primary key, Nom varchar(30),Prenom varchar(30),Date_de_naissance Date,Fonction varchar(30),Telephone varchar(30))";
		//String req="INSERT INTO PERSONNEL(ID,NOM) VALUES('1','nom')";
		//PersonnelDAO_JDBC.miseAjour(req);
		
		String r="SELECT * FROM PERSONNEL";
		try{ ResultSet rs= PersonnelDAO_JDBC.selection(r);
		while(rs.next()){
			System.out.println(rs.getInt("ID"));
			System.out.print(rs.getString("NOM"));}
		}
		catch(SQLException e){}

	}

}
