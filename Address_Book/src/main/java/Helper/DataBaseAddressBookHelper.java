package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import AddressBook.ManageBackEnd;
import Domain.Address;
import Domain.BackEnd;

public class DataBaseAddressBookHelper implements BackendAddressBookHelper {

	Scanner input=new Scanner(System.in);
	Connection connect;
	Statement statement = null;
	PreparedStatement preparedStatement;
	ResultSet resultSet =null;
	ManageBackEnd manage;
	BackEnd current;
	
	public DataBaseAddressBookHelper(ManageBackEnd manage) {
		this.manage=manage; 
		current = manage.getCurrent();

	}

	public void connection() {
		try {
			String url=current.toString();
			String spl[]=url.split(" ");
			String url1=spl[0];
			String user=spl[1];
			String pass=spl[2];
			Class.forName("com.mysql.jdbc.Driver");
			connect =DriverManager.getConnection(url1,user,pass);
			statement=connect.createStatement();
			System.out.println("Connected");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void create() {
	connection();
	Address add=new Address();
	System.out.println("Enter Your Name");
	add.setName(input.next());
	System.out.println("Enter Your Emailid");
	add.setEmail_id(input.next());
	System.out.println("Enter Your Phone No");
	add.setPhone_no(input.nextInt());
	String query = " insert into address_new VALUES ('"+add.getName()+"','"+add.getEmail_id()+"','"+add.getPhone_no()+"')";
	try {
	 statement.executeUpdate(query);
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	}

	public void read() {
		connection();
		Address add=new Address();
		System.out.println("Enter Your Name");
		add.setName(input.next());
		String name=add.getName();
		System.out.println(name);
		String query="Select * from address_new where name='"+name+"'";
		try {
			resultSet=statement.executeQuery(query);
			while(resultSet.next())
			{
			  resultSet.getString("email_id");
			 resultSet.getString("phone");
			System.out.println("Email id is :"+resultSet.getString(2)+"Phone Number is :"+resultSet.getString(3) );
			 }
		
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}

	public void update() {
		connection();
		Address add=new Address();
		System.out.println("Enter the name you want to update");
		add.setName(input.next());
		System.out.println("Enter Your Emailid");
		add.setEmail_id(input.next());
		System.out.println("Enter Your Phone No");
		add.setPhone_no(input.nextInt());
		String query = "UPDATE address_new SET email_id='"+add.getEmail_id()+"' , phone='"+add.getPhone_no()+"'where name='"+add.getName()+"'  ";
		try {
			statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

	public void delete() {
		connection();
		Address add=new Address();
		System.out.println("Enter the name you want to delete");
		add.setName(input.next());
		String query="Delete from address_new where name='"+add.getName()+"'";
		try {
		statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
