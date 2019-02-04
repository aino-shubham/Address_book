package CRUD;

import AddressBook.ManageBackEnd;
import Menu.MenuItem;

public class Update extends MenuItem {

	ManageBackEnd manage;
	public Update(int id, String name,MenuItem m) {
		super(id, name);
		this.manage=(ManageBackEnd) m;
	}

	@Override
	public void selected() {
		manage.getHelper().update();
	}

}
