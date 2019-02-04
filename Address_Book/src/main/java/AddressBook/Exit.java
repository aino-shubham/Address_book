package AddressBook;

import Menu.Menu;

public class Exit extends Menu {

	

	public Exit(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void selected() {
		System.exit(0);
		
	}
	
	

}
