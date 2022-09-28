package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class TestRetrieveDetails {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// Finding a person by ID
		Person person = entityManager.find(Person.class, 9);

		try {
			Pan pan = person.getPan();
			System.out.println("=====PERSON DETAILS============");
			System.out.println("ID: " + person.getId());
			System.out.println("NAME: " + person.getName());
			System.out.println("GENDER: " + person.getGender());

			System.out.println("=====PAN DETAILS============");
			System.out.println("ID: " + pan.getId());
			System.out.println("NUMBER: " + pan.getNumber());
			System.out.println("TYPE: " + pan.getType());
		} catch (NullPointerException e) {
			System.out.println("Details not found!");
		}

	}
}
