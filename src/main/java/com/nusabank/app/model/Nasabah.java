package com.nusabank.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nasabah")
public class Nasabah {
	@Id
	@Column(name="id_nasabah")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nama")
	private String nama;
	
	@Column(name="nik")
	private String nik;
	
	@Column(name="tgl_lahir")
	private String tglLahir;
	
	private String alamat;
	
	private String photo;
	
	@Column(name="jenis_kelamin")
	private String gender;
	
	private String pekerjaan;
	
	@Column(name="alamat_kantor")
	private String alamatKantor;
	
	private int pendapatan;
	
	private String email;
	
	@Column(name="no_hp")
	private String contactNumber;
	
	private String status;
	
	@Column(name="nama_ibu")
	private String namaIbu;
	
	@Column(name="username_nasabah")
	private String usernameNasabah;
	
	@Column(name="password_nasabah")
	private String passwordNasabah;
	
	@Column(name="tgl_pembuatan")
	private String joinDate;
	
	@Column(name="id_rekening")
	private int idRekening;
	
	public Nasabah() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getTglLahir() {
		return tglLahir;
	}

	public void setTglLahir(String tglLahir) {
		this.tglLahir = tglLahir;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPekerjaan() {
		return pekerjaan;
	}

	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}

	public String getAlamatKantor() {
		return alamatKantor;
	}

	public void setAlamatKantor(String alamatKantor) {
		this.alamatKantor = alamatKantor;
	}

	public int getPendapatan() {
		return pendapatan;
	}

	public void setPendapatan(int pendapatan) {
		this.pendapatan = pendapatan;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNamaIbu() {
		return namaIbu;
	}

	public void setNamaIbu(String namaIbu) {
		this.namaIbu = namaIbu;
	}

	public String getUsernameNasabah() {
		return usernameNasabah;
	}

	public void setUsernameNasabah(String usernameNasabah) {
		this.usernameNasabah = usernameNasabah;
	}

	public String getPasswordNasabah() {
		return passwordNasabah;
	}

	public void setPasswordNasabah(String passwordNasabah) {
		this.passwordNasabah = passwordNasabah;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public int getIdRekening() {
		return idRekening;
	}

	public void setIdRekening(int idRekening) {
		this.idRekening = idRekening;
	}
	
	@Override
	public String toString() {
		return "id="+id
				+", nama="+nama
				+", nik="+nik
				+", tgl_lahir="+tglLahir
				+", alamat="+alamat
				+", photo="+photo
				+", jenis_kelamin"+gender
				+", pekerjaan="+pekerjaan
				+", alamat_kantor="+alamatKantor
				+", pendapatan="+pendapatan
				+", email="+email
				+", no_hp="+contactNumber
				+", status="+status
				+", nama_ibu="+namaIbu
				+", username_nasabah="+usernameNasabah
				+", password_nasabah="+passwordNasabah
				+", tgl_pembuatan="+joinDate
				+", id_rekening="+idRekening;
	}
}
