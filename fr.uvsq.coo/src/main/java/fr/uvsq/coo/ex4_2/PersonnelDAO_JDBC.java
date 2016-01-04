package fr.uvsq.coo.ex4_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import org.apache.derby.impl.sql.compile.GetCurrentConnectionNode;
//import java.util.Properties;

public class PersonnelDAO_JDBC extends DAOJDBC<Personnel>  {
   
	/**Fonction permettant d'obtenir une connexion à partir de la base de donnee*/
	public static  Connection getConnexion() {
		//chargement du driver 
		Connection cn=null;
				try{Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
				cn=DriverManager.getConnection("jdbc:derby:MaDB", "", "");
				return cn;}
				catch(Exception e){System.err.println(e);}
		return cn;}	
	
	public static  void executer(String req) {
			try{//connexion a la base de données
				Connection cn= PersonnelDAO_JDBC.getConnexion();
				//excution d'une requete de type selection
					java.sql.Statement st =  cn.createStatement();
					st.execute(req);}
				catch(SQLException e){System.err.println(e);}
	}
		/**Fonction permettant de faire une mise  de la base de donné
		 * @param req  la requte a executer */
	public static int miseAjour(String req) {
		int m=0;
		try{//connexion a la base de données
			Connection cn= PersonnelDAO_JDBC.getConnexion();
			//excution d'une requete de type update
			java.sql.Statement st =  cn.createStatement();
			m=st.executeUpdate(req);
			return m;}
		catch(SQLException e){System.err.println(e);}
		return m;}	
	
	/**Fonction permettant de faire une selection a partir de la base de donné
	 * @param req  la requte a executer */
	public static ResultSet selection(String req){
		try{Connection cn= PersonnelDAO_JDBC.getConnexion();
		java.sql.Statement st =  cn.createStatement();
		ResultSet rs=st.executeQuery(req);	
		return rs;}
		catch(SQLException e){System.err.println(e);}
		return null;}	
	
	@Override
	public Personnel create(Personnel obj) {		
		String requete="INSERT INTO PERSONNEL VALUES ("+obj.getId()+","+obj.getNom()+","+obj.getPrenom()+","+obj.getDateNaissance()+","+obj.getFonction()+","+obj.getTelephone()+")";
		int m=miseAjour(requete);
		if(m>0)return obj;
	return null;}

	@Override
	public Personnel find(String id) {
		Personnel p=null;
		String requete="SELECT * FROM PERSONNEL WHERE Id  like "+id+"";
		ResultSet r=selection(requete);
		try {while(r.next()){
				p=new Personnel.Builder(r.getString(0),r.getString(1),r.getString(2)).telephone(r.getString(5)).fonction(r.getString(4)).build() ;
						}
		} catch (SQLException e) {e.printStackTrace();}		
		return p;}

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
		miseAjour(requete);}			

}
