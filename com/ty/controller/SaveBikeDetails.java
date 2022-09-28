package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Bike;
import com.ty.dto.Charcy;

public class SaveBikeDetails {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Bike bike = new Bike();
		bike.setName("KTM Duke");
		bike.setCost(100000.0);

		Charcy charcy = new Charcy();
		charcy.setType("3-Tier Rolling ");
		
		bike.setCharcy(charcy);
		
		EntityTransaction entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bike);
		entityManager.persist(charcy);
		entityTransaction.commit();
		
		System.out.println("Details Saved!");
	}
}
