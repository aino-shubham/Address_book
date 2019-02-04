package AddressBook;

import Menu.MenuItem;

public class GoBack extends MenuItem {
	MenuItem mi;
	protected GoBack(int id, String name,MenuItem mi) {
		super(id, name);
		this.mi=mi;
	}

	@Override
	public void selected() {
			
			//ManageBackEnd m=new ManageBackEnd();
			mi.selected();
	}

}
