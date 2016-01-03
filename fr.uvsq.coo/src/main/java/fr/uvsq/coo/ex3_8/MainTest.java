package fr.uvsq.coo.ex3_8;

import java.sql.SQLException;

public class MainTest {

	public static void main(String[] args) {
		PersonnelDAO_JDBC.getConnexion();
		//String req=" CREATE TABLE Personnel(Id varchar(10) primary key, Nom varchar(30),Prenom varchar(30),DateNaissance Date,Fonction varchar(30),Telephone varchar(30))";
		//String sql="insert into personnel values(1,2,3,2000-01-01,5,6)";
		//String sql1="DESCRIBE personnel";
		//PersonnelDAO_JDBC.miseAjour(req);
		//Personnel perso = new Personnel.Builder("id2","Nom","Prenom").fonction("RESP").telephone("0102030405").build();
		
		//String sql="insert into personnel values(id1,n,p,2000-01-01,f,kd)";
		//PersonnelDAO_JDBC.miseAjour(sql1);
		//("INSERT INTO Personnel("+"ID"+") VALUES ("+"ID"+");");
		//PersonnelDAO_JDBC p = new PersonnelDAO_JDBC();
		//p.create(perso);
		
		java.sql.ResultSet rs = PersonnelDAO_JDBC.selection("Select * from Personnel");
		
		try {
			while(rs.next()){
				System.out.println(rs.getObject(0));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
