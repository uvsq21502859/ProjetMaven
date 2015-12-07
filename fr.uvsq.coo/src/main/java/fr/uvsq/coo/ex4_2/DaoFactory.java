package fr.uvsq.coo.ex4_2;

public class DaoFactory extends FabriqueAbstraiteDAO {
	
	static DaoFactory myFactory;
	
	@Override
	public DAO<Personnel> getPersonnelDAO() {
	      return new PersonnelDAO_JDBC();
	}

	@Override
	public DAO<Groupe> getGroupeDAO() {
		return new GroupeDAO_JDBC();
	}
	}
