package com.chouguleindustries.hibernate.bird;

public class BirdTester {

	public static void main(String[] args) {

		BirdEntity entity = new BirdEntity(11, "Owl", "Grey", "India", 22.00d, 1, 2, 7, "Shrilanka", "Medium");

		BirdEntity entity1 = new BirdEntity(22, "Flamingo", "Pink", "America", 11.11d, 2, 12, 33, "South Africa",
				"small");

		BirdDAO dao = new BirdDAOImpl();

		System.out.println("SAVE");
		dao.save(entity);

		System.out.println("READ");
		dao.readbyID(22);
		System.out.println(entity1);

		System.out.println("UPDATE");
		dao.updatebyNameById(22, "American Flamingo");

		System.out.println("DELETE");
		dao.deleteById(11);
	}
}
