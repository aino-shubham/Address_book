package AddressBook;

import java.util.Scanner;

import Domain.DataBaseBackEnd;
import Domain.FileBackEnd;
import Menu.MenuItem;

public class AddDataBase extends MenuItem{

	ManageBackEnd m;
	protected AddDataBase(int id, String name,MenuItem m) {
		super(id, name);
		this.m=(ManageBackEnd) m;
	}

	@Override
	public void selected() {
		System.out.println("Add Data Base Selected ");
		create();
	}

	public void create() {

		DataBaseBackEnd file=new DataBaseBackEnd();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter User");
		file.setUsername(input.next());
		System.out.println("Enter url");
		file.setUrl(input.next());
		
		System.out.println("Enter password");
		file.setPassword(input.next());
		
		m.add(file);
		m.save();

	}

}
