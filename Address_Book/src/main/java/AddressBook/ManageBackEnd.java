package AddressBook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import Domain.BackEnd;
import Domain.FileBackEnd;
import Helper.BackendAddressBookHelper;
import Menu.Menu;

public class ManageBackEnd extends Menu {

	ArrayList<BackEnd> al=new ArrayList();
	private BackEnd current;
	private BackendAddressBookHelper helper;
	
	public BackendAddressBookHelper getHelper() {
		return helper;
	}

	public void setHelper(BackendAddressBookHelper helper) {
		this.helper = helper;
	}

	public BackEnd getCurrent() {
		return current;
	}

	public void setCurrent(BackEnd current) {
		this.current = current;
	}

	public ManageBackEnd() {

		super(0, "Manage Back End");
		AddBackEnd addBE=new AddBackEnd(1, "Add Back End",this);
		SelectBackEnd selectBE=new SelectBackEnd(2, "Select Back End",this);
		ListBackEnd ListBE=new ListBackEnd(3, "List Back End",this);
		Exit exit=new Exit(0,"Exit");
		addMenuItem(addBE);
		addMenuItem(selectBE);
		addMenuItem(ListBE);
		addMenuItem(exit);
		load();
	}

	public void add(BackEnd b) {
		al.add(b);
	}

	public void save() {

		try {
			FileOutputStream fos = new FileOutputStream("/home/intern5/Address.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			displayList();
		}catch(Exception e) {

		}

	}

	void load() {
		try {
			FileInputStream filein=new FileInputStream("/home/intern5/Address.ser");
			ObjectInputStream in=new ObjectInputStream(filein);
			al = (ArrayList<BackEnd>) in.readObject();


		}catch(Exception e) {

		}
	}	


	void displayList() {
		
		for(BackEnd b:al) {
			System.out.println(b);
		}
	}
	

	
}
