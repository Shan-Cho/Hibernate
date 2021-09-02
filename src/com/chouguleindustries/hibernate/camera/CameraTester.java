package com.chouguleindustries.hibernate.camera;

import java.util.ArrayList;
import java.util.List;

public class CameraTester {

	public static void main(String[] args) {

		CameraEntity entity1 = new CameraEntity(22, 60000d, 3, 10, true, "dslr", "Indonesia", 700.00f, true, "Auto");
		CameraEntity entity2 = new CameraEntity(5, 75000d, 2, 7, true, "video device", "USA", 800.00f, true, "Auto");
		CameraEntity entity3 = new CameraEntity(10, 30000d, 5, 9, true, "slr", "India", 500.00f, false, "Manual");

		List<CameraEntity> cam = new ArrayList<CameraEntity>();

		CameraDAO dao = new CameraDAOimpl();

		System.out.println("save");
		dao.save(entity1);

		System.out.println("saveList:");
		cam.add(entity2);
		for (CameraEntity cameraEntity : cam) {
			System.out.println(cam);
		}

		System.out.println("read");
		dao.readbyID(1);
		System.out.println(entity3);

		System.out.println("update");
		dao.updatebytypeById(1, "Lens");

		System.out.println("delete");
		dao.deleteById(1);

		List<Integer> id = new ArrayList<Integer>();
		System.out.println("delete list");
		id.add(1);
		id.add(2);
		dao.deleteList(id);

	}

}
