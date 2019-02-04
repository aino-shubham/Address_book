package Helper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import AddressBook.ManageBackEnd;
import Domain.Address;
import Domain.BackEnd;

public class FileAddressBookHelper implements BackendAddressBookHelper {
	Scanner input=new Scanner(System.in);
	ManageBackEnd manage;
	BackEnd current;
	ArrayList<Address> arraylist=new ArrayList<Address>();
	
	
	public FileAddressBookHelper(ManageBackEnd manage) {
		this.manage=manage; 
		current = manage.getCurrent();
		
		}
	
	//Save The address to path selected
	public void save() {

		try {
			FileOutputStream fos = new FileOutputStream(current.toString());
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(arraylist);

		}catch(Exception e) {

		}

	}

	//Read the address 
	void load() {
		try {
			FileInputStream filein=new FileInputStream(current.toString());
			ObjectInputStream in=new ObjectInputStream(filein);
			arraylist = (ArrayList<Address>) in.readObject();
		}catch(Exception e) {

		}
	}

	//Add The address to array list
	public void add(Address address) {
		arraylist.add(address);
	}

	//display the list
	public void displaylist() {
		int i=0;
		for(Address address:arraylist) {
			System.out.println(i++ +"."+address);
		}
	}
	
	
	//Create the Address to store in the File
	public void create() {
		Address add=new Address();
		System.out.println("Enter Your Name");
		add.setName(input.next());
		System.out.println("Enter Your Emailid");
		add.setEmail_id(input.next());
		System.out.println("Enter Your Phone No");
		add.setPhone_no(input.nextInt());
		add(add);
		save();
	}

	//Read Particular Address from the list
	public void read() {
		load();
		displaylist();
		System.out.println("Select the address you want to read");
		int choice=input.nextInt();
		for(Address address:arraylist) {
		if(choice==arraylist.indexOf(address)) {
			System.out.println("Name"+address.getName());
			System.out.println("Email id"+address.getEmail_id());
			System.out.println("Phone Number"+address.getPhone_no());
		}
		}
		

	}

	public void update() {
		load();
		displaylist();
		System.out.println("Select Which you want to update ");
		int choice=input.nextInt();
		for(Address address:arraylist) {
			if(choice==arraylist.indexOf(address)) {
				System.out.println("Enter Your Name");
				address.setName(input.next());
				System.out.println("Enter Your Emailid");
				address.setEmail_id(input.next());
				System.out.println("Enter Your Phone No");
				address.setPhone_no(input.nextInt());
				
			}
			
			}
		save();
	}

	
	
	public void delete() {
		load();
		displaylist();
		Address add=null;
		System.out.println("Select Which you want to Delete ");
		int choice=input.nextInt();
		for(Address address:arraylist) {
			if(choice==arraylist.indexOf(address)) {
				add=address;
			}
			
			}
		arraylist.remove(add);
		save();
	}

}
