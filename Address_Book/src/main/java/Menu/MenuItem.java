package Menu;

import java.util.Scanner;

public abstract class MenuItem {
	//id to select and name what to select
	private int id=-1;
	private String name;
	
	protected MenuItem(int id, String name){
		this.id=id;
		this.name=name;
		}
	
	public String toString() 
    { 
        return getId() + "."  +getName(); 
    } 
	
	public void choice() {
		
	}
	
	
	public int getId() {

		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Abstract Method so that can be used by other extend class
	abstract public void selected();
	
}
