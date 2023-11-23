package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Dosen extends User {

	Collection<Quiz> quiz;
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