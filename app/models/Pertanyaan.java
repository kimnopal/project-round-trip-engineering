package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "pertanyaan",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class Pertanyaan extends Model {

	@ManyToOne
	Quiz quiz;

	@OneToMany
	Collection<Pilihan> pilihan;
	
	private int id;
	private String text;
	private String userAnswer;
	private String correctAnswer;

	public void verifyAnswer() {
		// TODO - implement Pertanyaan.verifyAnswer
		throw new UnsupportedOperationException();
	}

}