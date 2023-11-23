package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class User extends Model {

	private String name;
	private String email;
	private String password;

	public void editUser() {
		// TODO - implement User.editUser
		throw new UnsupportedOperationException();
	}

	public void searchUser() {
		// TODO - implement User.searchUser
		throw new UnsupportedOperationException();
	}

	public void login() {
		// TODO - implement User.login
		throw new UnsupportedOperationException();
	}

	public void logout() {
		// TODO - implement User.logout
		throw new UnsupportedOperationException();
	}

}