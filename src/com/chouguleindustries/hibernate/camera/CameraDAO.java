package com.chouguleindustries.hibernate.camera;

import java.util.List;

public interface CameraDAO {

	int save(CameraEntity entity);

	CameraEntity readbyID(int primaryKey);

	void updatebytypeById(int id, String type);

	void deleteById(int id);

	void saveList(List<CameraEntity> entity);

	void deleteList(List<Integer> id);
}
