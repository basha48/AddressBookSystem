package com.address.book;

public class AdressMain {

	public static void main(String[] args) {
		AdressBook ab = new AdressBook();
		ab.addContacts();
		ab.listPeople();
		ab.removeContact();
		ab.editPerson();
	}

}
