package com.nusabank.app.dao;

import java.util.List;

import com.nusabank.app.model.Nasabah;

public interface NasabahDAO {
	public void addNasabah(Nasabah n);
	public void updateNasabah(Nasabah n);
	public List<Nasabah> listNasabah();
	public Nasabah getNasabahById(int id);
	public void removeNasabah(int id);
}
