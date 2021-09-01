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
			// session.getTransaction().commit();
			System.out.println("updated name : " + type);
			session.flush();
			session.clear();
		}
	}

	@Override
	public void deleteById(int id) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			CameraEntity entity = new CameraEntity();
			entity = (CameraEntity) session.get(CameraEntity.class, id);
			session.delete(entity);
			// session.getTransaction().commit();
			System.out.println("deleted :" + id);
			session.flush();
			session.clear();
		}
	}

	@Override
	public void saveList(List<CameraEntity> entity1) {
		List<CameraEntity> camentity = new ArrayList<CameraEntity>();
		for (CameraEntity cameraEntity : camentity) {
			camentity.addAll(entity1);
		}

	}

}
