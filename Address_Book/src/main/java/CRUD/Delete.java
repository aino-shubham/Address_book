package CRUD;

import AddressBook.ManageBackEnd;
import Menu.MenuItem;

public class Delete extends MenuItem{

	ManageBackEnd manage;
	public Delete(int id, String name,MenuItem m) {
		super(id, name);
		this.manage=(ManageBackEnd) m;
			}

	@Override
	public void selected() {
		manage.getHelper().delete();
	}

	
}
