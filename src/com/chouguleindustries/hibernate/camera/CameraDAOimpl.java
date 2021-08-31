package com.chouguleindustries.hibernate.camera;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.chouguleindustries.hibernate.bird.SessionFactoryUtil;

public class CameraDAOimpl implements CameraDAO {

	private SessionFactory factory = SessionFactoryUtil.getFactory();

	@Override
	public int save(CameraEntity entity) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			int primaryKey = (int) session.save(entity);
			transaction.commit();
			System.out.println("save :" + primaryKey);
			return primaryKey;
		}
	}

	@Override
	public CameraEntity readbyID(int primaryKey) {
		try (Session session = factory.openSession()) {
			CameraEntity db = session.get(CameraEntity.class, primaryKey);
			System.out.println("Read by id :");
			return db;
		}
	}

	@Override
	public void updatebytypeById(int id, String type) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			CameraEntity entity = new CameraEntity();
			entity = (CameraEntity) session.get(CameraEntity.class, id);
			entity.setType(type);
			session.update(entity);
			session.getTransaction().commit();
			System.out.println("updated name : " + type);
		}
	}

	@Override
	public void deleteById(int id) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			CameraEntity entity = new CameraEntity();
			entity = (CameraEntity) session.get(CameraEntity.class, id);
			session.delete(entity);
			session.getTransaction().commit();
			System.out.println("deleted :" + id);
		}
	}

}
