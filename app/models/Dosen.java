package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "dosen",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class Dosen extends User {

	@OneToMany
	Collection<Quiz> quiz;
	
	private int id;
	private String nip;

	public void createQuiz() {
		// TODO - implement Dosen.createQuiz
		throw new UnsupportedOperationException();
	}

	public void editQuiz() {
		// TODO - implement Dosen.editQuiz
		throw new UnsupportedOperationException();
	}

	public void deleteQuiz() {
		// TODO - implement Dosen.deleteQuiz
		throw new UnsupportedOperationException();
	}

	public void searchQuiz() {
		// TODO - implement Dosen.searchQuiz
		throw new UnsupportedOperationException();
	}

	public void doQuiz() {
		// TODO - implement Dosen.doQuiz
		throw new UnsupportedOperationException();
	}

}