package fr.uvsq.coo.ex4_2;

public class XMLDaoFactory extends FabriqueAbstraiteDAO {
	
	static DaoFactory myFactory;	
	@Override
	public DAO<Personnel> getPersonnelDAO() {
	      return new PersonnelDAO_XML();
	}

	@Override
	public DAO<Groupe> getGroupeDAO() {
		return new GroupeDAO_XML();
	}

}
