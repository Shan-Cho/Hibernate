package com.chouguleindustries.hibernate.bird;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BirdDAOImpl implements BirdDAO {

	BirdEntity birds = null;

	@Override
	public int save(BirdEntity entity) {

		SessionFactory factory = SessionFactoryUtil.getFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int primaryKey = (int) session.save(entity);
		transaction.commit();
		System.out.println("save :" + primaryKey);
		session.close();
		return primaryKey;
	}

	@Override
	public BirdEntity readbyID(int primaryKey) {

		SessionFactory factory = SessionFactoryUtil.getFactory();
		Session session = factory.openSession();
		BirdEntity db = session.get(BirdEntity.class, primaryKey);
		System.out.println("Read by id :" + birds);
		session.close();
		return db;
	}

	@Override
	public void updatebyNameById(int id, String name) {
		SessionFactory factory = SessionFactoryUtil.getFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BirdEntity entity = new BirdEntity();
		entity = (BirdEntity) session.get(BirdEntity.class, id);
		entity.setName(name);
		session.update(entity);
		session.getTransaction().commit();
		System.out.println("updated name : " + name);
		session.close();
	}

	@Override
	public void deleteById(int id) {
		SessionFactory factory = SessionFactoryUtil.getFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BirdEntity entity = new BirdEntity();
		entity = (BirdEntity) session.get(BirdEntity.class, id);
		session.delete(entity);
		session.getTransaction();
		System.out.println("deleted :" + id);
		session.close();
	}
}
