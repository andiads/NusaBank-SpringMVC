package com.nusabank.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nusabank.app.dao.NasabahDAO;
import com.nusabank.app.model.Nasabah;

@Service
public class NasabahServiceImpl implements NasabahService {

	private NasabahDAO nasabahDAO;
	
	public void setNasabahDAO(NasabahDAO nasabahDAO) {
		this.nasabahDAO=nasabahDAO;
	}
	
	@Override
	@Transactional
	public void addNasabah(Nasabah n) {
		this.nasabahDAO.addNasabah(n);
	}

	@Override
	@Transactional
	public void updateNasabah(Nasabah n) {
		this.nasabahDAO.updateNasabah(n);
	}

	@Override
	@Transactional
	public List<Nasabah> listNasabah() {
		return this.nasabahDAO.listNasabah();
	}

	@Override
	@Transactional
	public Nasabah getNasabahById(int id) {
		// TODO Auto-generated method stub
		return this.nasabahDAO.getNasabahById(id);
	}

	@Override
	@Transactional
	public void removeNasabah(int id) {
		this.nasabahDAO.removeNasabah(id);
	}
	
	
	
}
