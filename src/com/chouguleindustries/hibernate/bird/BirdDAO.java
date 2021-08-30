package com.chouguleindustries.hibernate.bird;

public interface BirdDAO {

	int save(BirdEntity entity);

	BirdEntity readbyID(int primaryKey);

	void updatebyNameById(int id, String name);

	void deleteById(int id);
}
