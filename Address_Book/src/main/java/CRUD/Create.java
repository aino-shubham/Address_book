package CRUD;

import AddressBook.ManageBackEnd;
import Menu.MenuItem;

public class Create extends MenuItem {

	ManageBackEnd manage;
	public Create(int id, String name,MenuItem m) {
		super(id, name);
		this.manage=(ManageBackEnd) m;
	}

	@Override
	public void selected() {
		manage.getHelper().create();
	}

}
