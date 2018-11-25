package com.kitap;

import java.net.UnknownHostException;

import org.bson.Document;

import com.kitap.kitapBilgiler;
import com.mongodb.BasicDBList;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;



public class veriTabani {
	public void kitapEkle(kitapBilgiler kitap) throws UnknownHostException{
		System.out.println("Kitap Ekle");
		MongoClient mongo = new MongoClient("localhost",32768);		
        MongoDatabase db = mongo.getDatabase("kitapVeriTabani"); 
        MongoCollection<Document> collection=db.getCollection("kitapUygulama");       
        Document doc= new Document("id",kitap.getIsbn())        		
        		.append("kitapAdi", kitap.getKitapAdi())
        		.append("yazarAdi",kitap.getYazarAdi())
        		.append("yayinEvi",kitap.getYayinEvi())
        		.append("basimTarihi",kitap.getBasimTarihi())
        		.append("sayfaSayisi",kitap.getSayfaSayisi());
		collection.insertOne(doc);
		mongo.close();
		
	}
	public BasicDBList kitapListele()throws UnknownHostException{		
		MongoClient mongo = new MongoClient("localhost",32768);		
        MongoDatabase db = mongo.getDatabase("kitapVeriTabani"); 
        MongoCollection<Document> collection=db.getCollection("kitapUygulama");       
        MongoCursor<Document> iterator=collection.find().iterator();
        BasicDBList list = new BasicDBList();
        while (iterator.hasNext()) {
            Document doc = iterator.next();
            list.add(doc);
        }
        mongo.close();
        return list;
	}

	
	public void kitapGuncelle(kitapBilgiler kitap) {
		
		System.out.println(kitap.getIsbn());
		MongoClient mongo = new MongoClient("localhost",32768);		
        MongoDatabase db = mongo.getDatabase("kitapVeriTabani"); 
        MongoCollection<Document> collection=db.getCollection("kitapUygulama");
        collection.find();
        collection.replaceOne(new Document("isbn",kitap.getIsbn()),new Document("id",kitap.getIsbn()).append("kitapAdi",kitap.getKitapAdi()).append("yazarAdi",kitap.getYazarAdi()).append("yayinEvi",kitap.getYayinEvi()).append("basimTarihi",kitap.getBasimTarihi()).append("sayfaSayisi",kitap.getSayfaSayisi()));
        mongo.close();
	}
	public void kitapSil(kitapBilgiler kitap) {
		MongoClient mongo = null;
		try {
			System.out.println("sil geldi");
			System.out.println(kitap.getIsbn());
			mongo= new MongoClient("localhost",32768);
			MongoDatabase database=mongo.getDatabase("kitapVeriTabani");			
			MongoCollection<Document> collection=database.getCollection("kitapUygulama");			
			System.out.println(collection.deleteOne(Filters.eq("isbn", kitap.getIsbn())));
		}catch(Exception e){
			System.out.println("Hata:"+e);
		}finally {
			mongo.close();
		}
	}

	
}
