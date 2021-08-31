package com.chouguleindustries.hibernate.camera;

public interface CameraDAO {

	int save(CameraEntity entity);

	CameraEntity readbyID(int primaryKey);

	void updatebytypeById(int id, String type);

	void deleteById(int id);
}
