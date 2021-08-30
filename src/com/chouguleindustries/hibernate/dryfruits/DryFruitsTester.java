package com.chouguleindustries.hibernate.dryfruits;

public class DryFruitsTester {
	DryFruitsDTO entity = new DryFruitsDTO(1,"Alomd","Arab","Dubai",1000.00,"Department of health UAE");

	DryFruitsDAO dao = new DryFruitsDAOimpl();
	
	dao.save(entity);

}
