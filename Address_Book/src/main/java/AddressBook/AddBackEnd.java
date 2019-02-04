package AddressBook;


import java.util.Scanner;

import Domain.FileBackEnd;
import Menu.Menu;
import Menu.MenuItem;

public class AddBackEnd extends Menu{

	
	AddBackEnd(int id, String name,ManageBackEnd manage) {
		super(id,name);
		AddDataBase database=new AddDataBase(1,"Add Data Base",manage);
		AddFileSystem filesystem=new AddFileSystem(2,"Add File System",manage);
		Exit exit=new Exit(0,"Exit");
		GoBack goback=new GoBack(3,"Go Back",manage);
		this.addMenuItem(database);
		this.addMenuItem(filesystem);
		this.addMenuItem(goback);
		this.addMenuItem(exit);

	}

	@Override
	public void selected() {
		super.selected();
		
	}
	

}
