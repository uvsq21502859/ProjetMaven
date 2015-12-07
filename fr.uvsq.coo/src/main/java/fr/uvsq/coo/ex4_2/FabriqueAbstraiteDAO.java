package fr.uvsq.coo.ex4_2;

public abstract class FabriqueAbstraiteDAO {

	public enum daoType {JDBC,XML;}
	
	public  abstract  DAO<Personnel> getPersonnelDAO();
	public  abstract DAO<Groupe> getGroupeDAO();
	
	public static FabriqueAbstraiteDAO getDaoFActory(daoType type){
		if(type==daoType.JDBC) return new DaoFactory();
		if(type==daoType.XML) return  new XMLDaoFactory();
		return null;
	}
}
