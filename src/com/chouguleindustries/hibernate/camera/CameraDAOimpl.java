package com.chouguleindustries.hibernate.camera;

import java.util.ArrayList;
import java.util.List;

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
			// transaction.commit();
			System.out.println("save :" + primaryKey);
			session.flush();
			session.clear();
			transaction.rollback();
			return primaryKey;
		}
	}

	@Override
	public CameraEntity readbyID(int primaryKey) {
		try (Session session = factory.openSession()) {
			CameraEntity db = session.get(CameraEntity.class, primaryKey);
			// System.out.println("Read by id :"+ primaryKey);
			System.out.println(db);
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
			// session.getTransaction().commit();
			// transaction.commit();
			session.flush();
			session.clear();
			System.out.println("updated type : " + type);

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

	@Override
	public void saveList(List<CameraEntity> cameraEntity) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			cameraEntity.forEach(entity -> {
				session.save(entity);
				System.out.println(entity);
			});
			// transaction.commit();
			session.flush();
			// transaction.rollback();

		}

	}

	@Override
	public void deleteList(List<Integer> id) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			id.forEach(entity -> {
				CameraEntity cam = session.get(CameraEntity.class, entity);
				if (id.contains(entity)) {
					session.delete(cam);
					System.out.println(cam);
				}
			});
			transaction.commit();
		}

	}

}
