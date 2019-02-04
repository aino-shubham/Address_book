package CRUD;

import AddressBook.ManageBackEnd;
import Menu.MenuItem;

public class Read extends MenuItem{

	ManageBackEnd manage;
	public Read(int id, String name,MenuItem m) {
		super(id, name);
		this.manage=(ManageBackEnd) m;
	}

	@Override
	public void selected() {
		
		manage.getHelper().read();
		
	}

}
