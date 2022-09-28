package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Bike;
import com.ty.dto.Charcy;

public class RetrieveDetails {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Charcy charcy = entityManager.find(Charcy.class, 5);

		try {
			Bike bike = charcy.getBike();
			System.out.println("=========BIKE DETAILS============");
			System.out.println("ID: " + bike.getId());
			System.out.println("NAME: " + bike.getName());
			System.out.println("PRICE: " + bike.getCost());

			System.out.println("=========CHARCY DETAILS============");
			System.out.println("ID: " + charcy.getId());
			System.out.println("TYPE: " + charcy.getType());
		} catch (NullPointerException e) {
			System.out.println("Details not Found!");
		}

	}
}
