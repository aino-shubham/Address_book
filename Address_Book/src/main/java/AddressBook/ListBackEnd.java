package AddressBook;

import Menu.Menu;
import Menu.MenuItem;

public class ListBackEnd extends MenuItem {

	
	ManageBackEnd manage;
	ListBackEnd(int id, String name,Menu m) {
		super(id, name);
		this.manage=(ManageBackEnd) m;
	}
	@Override
	public void selected() {
		manage.displayList();
		
		}

}
