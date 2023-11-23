package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Pertanyaan extends Model {

	Quiz quiz;
	Collection<Pilihan> pilihan;
	private String text;
	private String userAnswer;
	private String correctAnswer;

	public void verifyAnswer() {
		// TODO - implement Pertanyaan.verifyAnswer
		throw new UnsupportedOperationException();
	}

}