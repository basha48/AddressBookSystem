package com.address.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public class AdressBook {
	List<Contacts> people = new ArrayList();
	Scanner sc = new Scanner(System.in);
	public void welcomeMessage() {
		System.out.println("welcome to adress book system");
	}
	
	public void addContacts() {
		Contacts contacts = new Contacts();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Name:");
		String firstName = sc.nextLine();
		contacts.setFirstName(firstName);
		
		System.out.println("Enter Last Name:");
		String lastName = sc.nextLine();
		contacts.setLastName(lastName);
		
		System.out.println("Enter Adress:");
		String adress = sc.nextLine();
		contacts.setAdress(adress);
		
		System.out.println("Enter city:");
		String city = sc.nextLine();
		contacts.setCity(city);
		
		System.out.println("Enter state:");
		String state = sc.nextLine();
		contacts.setState(state);
		
		System.out.println("Enter zip:");
		String zip = sc.nextLine();
		contacts.setZip(zip);
		
		System.out.println("Enter phoneNumber:");
		String phoneNumber = sc.nextLine();
		contacts.setPhoneNumber(phoneNumber);
		
		System.out.println("Enter email:");
		String email = sc.nextLine();
		contacts.setEmail(email);
		
		people.add(contacts);
		System.out.println("person created sucessfully");
	}
	
	
	 public void listPeople()
     {
         if (people.isEmpty() )
         {
             System.out.println("Your address book is empty.");
             return;
         }
         System.out.println("\n Address Book:");
         for (Contacts person : people)
         {
        	 System.out.println(person.getFirstName());
         }

     }
	 
	 
	 
	 public void removeContact()
     {
         System.out.println("Enter the first name you want to remove.");
         String firstName = sc.nextLine();
         for(int i=0;i<people.size();i++) {
        	 if(people.get(i).getFirstName().equals(firstName)) {
        		 people.remove(people.get(i));
        		 System.out.println("person removed sucessfully");
        	 }
        	 else {
        		 System.out.println("person not found");
        	 }
        	 
         }
     }
	 
	 public void editPerson()
     {
         System.out.println("Enter the first name you want to edit.");
         
         String firstName = sc.nextLine();
         
         for(int i=0;i<people.size();i++) {
        	 if(people.get(i).getFirstName().equals(firstName)) {
        		 
        		 people.get(i).setFirstName(firstName);
        		 
        		 System.out.println("Enter Last Name:");
        		 String lastName = sc.nextLine();
        		 people.get(i).setLastName(lastName);
        		 
        	     System.out.println("Enter Adress:");
         		 String address = sc.nextLine();
         		 people.get(i).setAdress(address);
         		 
         		 System.out.println("Enter state:");
         		 String state = sc.nextLine();
         		 people.get(i).setState(state);
         			
         		 System.out.println("Enter zip:");
         		 String zip = sc.nextLine();
         		 people.get(i).setZip(zip);
         			
         		 System.out.println("Enter phoneNumber:");
         		 String phoneNumber = sc.nextLine();
         		 people.get(i).setPhoneNumber(phoneNumber);
       
         		 System.out.println("Enter email:");
         		 String email = sc.nextLine();
         		 people.get(i).setEmail(email);
         			
        		 System.out.println("person edited sucessfully");
        	 }
        	 else {
        		 System.out.println("person not found");
        	 }
        	 
         }
     }

	
}

