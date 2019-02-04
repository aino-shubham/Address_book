package AddressBook;

import java.util.Scanner;

import CRUD.Create;
import CRUD.Delete;
import CRUD.Read;
import CRUD.Update;
import Domain.BackEnd;
import Domain.FileBackEnd;
import Helper.FileAddressBookHelper;
import Menu.Menu;
import Menu.MenuItem;

public class FileSystem extends Menu {

	ManageBackEnd manage;
	MenuItem menu;
	protected FileSystem(int id, String name,MenuItem m) {
		super(id, name);
		this.manage=(ManageBackEnd) m;
		menu=new Menu(id, name);
		Create create=new Create(1,"Create",m);
		Read read=new Read(2,"Read",m);
		Update update=new Update(3,"Update",m);
		Delete delete=new Delete(4,"Delete",m);
		((Menu) menu).addMenuItem(create);
		((Menu) menu).addMenuItem(read);
		((Menu) menu).addMenuItem(update);
		((Menu) menu).addMenuItem(delete);
		
	}

	@Override
	public void selected() {
		System.out.println("File System Back End Selected");
		display();
		selectList();
		menu.selected();
	
	}
	
	void display() {
		int i=0;
		for(BackEnd b : manage.al) {
			
			if(b instanceof FileBackEnd ) {
				
				System.out.println(i++  +"."+b);
			}

		}
	}
	void selectList() {
		System.out.println("Select the back end you want to work");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		for(BackEnd b : manage.al) {
			
			if(choice == manage.al.indexOf(b) ) {
				manage.setCurrent(b);
				manage.setHelper(new FileAddressBookHelper(manage));
			}
			
		}
	}
	

	
	
	

}
