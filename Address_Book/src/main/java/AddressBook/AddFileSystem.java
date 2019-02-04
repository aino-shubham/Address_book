package AddressBook;

import java.util.Scanner;
import Domain.FileBackEnd;
import Menu.Menu;
import Menu.MenuItem;

public class AddFileSystem extends MenuItem{


	ManageBackEnd m;
	protected AddFileSystem(int id, String name,MenuItem m) {
		super(id, name);
		this.m=(ManageBackEnd) m;
		
	}
	
	
	@Override
	public void selected() {
		System.out.println("Add File System");
		create();
	}

	public void create() {

		FileBackEnd file=new FileBackEnd();
		System.out.println("Enter The Path");
		Scanner input=new Scanner(System.in);
		
		file.setPath(input.nextLine());
		m.add(file);
		m.save();

	}

}
