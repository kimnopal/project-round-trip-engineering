package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Mahasiswa extends User {

	Collection<Submission> submission;
	Collection<Quiz> quiz;
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