package AddressBook;

import Menu.Menu;
import Menu.MenuItem;

public class SelectBackEnd extends Menu{

	
	SelectBackEnd(int id, String name,ManageBackEnd manage) {
		super(id, name);
		
		DataBase database=new DataBase(1,"Data Base",manage);
		FileSystem filesystem=new FileSystem(2,"File System",manage);
		Exit exit=new Exit(0,"Exit");
		GoBack goback=new GoBack(3,"Go Back",manage);
		this.addMenuItem(filesystem);
		this.addMenuItem(database);
		this.addMenuItem(goback);
		this.addMenuItem(exit);
	}

	@Override
	public void selected() {
		super.selected();
		System.out.println("Back End Selected");
		
	}
	

}
