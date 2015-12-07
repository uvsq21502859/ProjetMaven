package fr.uvsq.coo.ex4_2;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Properties;

public class PersonnelDAO_JDBC extends DAOJDBC<Personnel>  {


	
	  static String dburl="jdbc:derby://localhost:1527/MonDB;create=true";
		//Properties connectionProp = new Properties();
		//connectionProp.put("user",  userName);
		//connectionProp.put("user", password);
	
		
	public static void getConnexion(){
		
		//chargement du driver 
				try{Class.forName("org.apache.derby.jdbc.EmbeddedDriver");}
				catch(ClassNotFoundException e){
					System.err.println(e);}
			
	}	
	public static void executer(String req){
		//connexion a la base de données
				PersonnelDAO_JDBC.getConnexion();
				//excution d'une requete de type selection
				try(Connection cnn= DriverManager.getConnection(dburl, "user", "password")){
					java.sql.Statement st =  cnn.createStatement();
					st.execute(req);
					}
				catch(SQLException e){System.err.println(e);}
	}
		/**Fonction permettant de faire une mise  de la base de donné*/
	public static int miseAjour(String req){
		int m=0;
		//connexion a la base de données
		PersonnelDAO_JDBC.getConnexion();
		//excution d'une requete de type update
		try(Connection cnn= DriverManager.getConnection(dburl, "user", "password")){
			java.sql.Statement st =  cnn.createStatement();
			m=st.executeUpdate(req);
			return m;}
		catch(SQLException e){System.err.println(e);}
		return m;
	}	
	
	/**Fonction permettant de faire une selection a partir de la base de donné*/
	public static  ResultSet selection(String req){
		//connexion a la base de données
		PersonnelDAO_JDBC.getConnexion();
		//excution d'une requete de type selection
		try(Connection cnn= DriverManager.getConnection(dburl, "user", "password")){
			java.sql.Statement st =  cnn.createStatement();
			ResultSet rs=((java.sql.Statement) st).executeQuery(req);
			return rs;}
		catch(SQLException e){System.err.println(e);}
		return null;
	}	
	
	@Override
	public Personnel create(Personnel obj) {
		
		String requete="INSERT INTO PERSONNEL VALUES ("+obj.getId()+","+obj.getNom()+","+obj.getPrenom()+","+obj.getDateNaissance()+","+obj.getFonction()+","+obj.getTelephone()+")";
		int m=miseAjour(requete);
		if(m>0)return obj;
		
		
		return null;
	}

	@Override
	public Personnel find(String id) {
		Personnel p=null;
		String requete="SELECT * FROM PERSONNEL WHERE Id  like "+id+"";
		ResultSet r= PersonnelDAO_JDBC.selection(requete);
		try {
			while(r.next()){
				p=new Personnel.Builder(r.getString(0),r.getString(1),r.getString(2)).telephone(r.getString(5)).fonction(r.getString(4)).build() ;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return p;
	}

	@Override
	public Personnel update(Personnel obj) {
		String requete="INSERT INTO PERSONNEL VALUES ("+obj.getId()+","+obj.getNom()+","+obj.getPrenom()+","+obj.getDateNaissance()+","+obj.getFonction()+","+obj.getTelephone()+")";
		int m=miseAjour(requete);
		if(m>0)return obj;
		
		
		return null;
	}

	@Override
	public void delete(Personnel obj) {
		String requete="DELETE FROM PERSONNEL WHERE Id like "+obj.getId()+"";
		int m=miseAjour(requete);}		
		
	

	

}
