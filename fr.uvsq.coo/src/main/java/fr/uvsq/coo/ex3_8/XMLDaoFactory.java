package fr.uvsq.coo.ex3_8;

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
