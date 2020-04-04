package com.nusabank.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.nusabank.app.model.Nasabah;

@Repository
public class NasabahDAOImpl implements NasabahDAO {

	private static final Logger logger = LoggerFactory.getLogger(NasabahDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf){
	this.sessionFactory = sf;
	}
	
	@Override
	public void addNasabah(Nasabah n) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(n);
		logger.info("Nasabah saved successfully, Nasabah Details="+n);
	}

	@Override
	public void updateNasabah(Nasabah n) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(n);
		logger.info("Nasabah updated successfully, Nasabah Details="+n);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Nasabah> listNasabah() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Nasabah> nasabahList = session.createQuery("from Nasabah").list();
		for(Nasabah n : nasabahList){
		logger.info("Nasabah List::"+n);
		}
		return nasabahList;
	}

	@Override
	public Nasabah getNasabahById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Nasabah n = (Nasabah) session.load(Nasabah.class, new Integer(id));
		logger.info("Nasabah loaded successfully, Nasabah details="+n);
		return n;
	}

	@Override
	public void removeNasabah(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Nasabah n = (Nasabah) session.load(Nasabah.class, new Integer(id));
		if(null != n){
		session.delete(n);
		}
		logger.info("Nasabah deleted successfully, Nasabah details="+n);
	}
	
}
