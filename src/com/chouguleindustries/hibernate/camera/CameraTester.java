package com.chouguleindustries.hibernate.camera;

public class CameraTester {

	public static void main(String[] args) {

		CameraEntity entity1 = new CameraEntity(22, 60000d, 3, 10, true, "dslr", "Indonesia", 700.00f, true, "Auto");
		CameraEntity entity2 = new CameraEntity(5, 75000d, 2, 7, true, "video device", "USA", 800.00f, true, "Auto");
		CameraEntity entity3 = new CameraEntity(10, 30000d, 5, 9, true, "slr", "India", 500.00f, false, "Manual");

		CameraDAO dao = new CameraDAOimpl();
		System.out.println("save");

		dao.save(entity1);
		dao.save(entity2);
		dao.save(entity3);

		System.out.println("read");
		dao.readbyID(22);
		System.out.println(entity1);

		System.out.println("update");
		dao.updatebytypeById(5, "Lens");

		System.out.println("delete");
		dao.deleteById(10);
	}

}
