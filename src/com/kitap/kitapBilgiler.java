package com.kitap;

import java.util.Date;

public class kitapBilgiler {
	
	private String isbn;
	private String kitapAdi;
	private String yayinEvi;
	private String yazarAdi;	
	private Date basimTarihi;
	private int sayfaSayisi;

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getYayinEvi() {
		return yayinEvi;
	}
	public void setYayinEvi(String yayinEvi) {
		this.yayinEvi = yayinEvi;
	}
	public String getYazarAdi() {
		return yazarAdi;
	}
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}
	public Date getBasimTarihi() {
		return basimTarihi;
	}
	public void setBasimTarihi(Date basimTarihi) {
		this.basimTarihi = basimTarihi;
	}
	public int getSayfaSayisi() {
		return sayfaSayisi;
	}
	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}
}
