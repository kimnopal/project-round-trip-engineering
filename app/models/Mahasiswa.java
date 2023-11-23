package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "mahasiswa",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class Mahasiswa extends User {

	@OneToMany
	Collection<Submission> submission;

	@OneToMany
	Collection<Quiz> quiz;
	
	private int id;
	private String nim;
	private String major;

	public void doQuiz() {
		// TODO - implement Mahasiswa.doQuiz
		throw new UnsupportedOperationException();
	}

	public void searchQuiz() {
		// TODO - implement Mahasiswa.searchQuiz
		throw new UnsupportedOperationException();
	}

	public void getResult() {
		// TODO - implement Mahasiswa.getResult
		throw new UnsupportedOperationException();
	}

}