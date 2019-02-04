package Menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Menu  extends MenuItem{

	//String title;
	Scanner input=new Scanner(System.in);
	private ArrayList<MenuItem> list=new ArrayList<MenuItem>();
	boolean found=false; 
	public Menu(int id,String name) {
		super(id, name);
	}

	public void addMenuItem(MenuItem m)
	{
		list.add(m);

	}

	@Override
	public void selected() {
		do {
			System.out.println(""+getName()+"");
			displayAndSelectMenuItem();
			choice();
		}while(true);
	}

	public void displayAndSelectMenuItem() {

		for(MenuItem m:list) {
			System.out.println(m);
		}

	}

	public void choice() {

		int ch=input.nextInt();

		for(MenuItem m:list) { 

			if(ch==m.getId()) {
				
				m.selected();
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Invalid choice");
		}
	}

}
