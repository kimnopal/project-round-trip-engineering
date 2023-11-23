package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "submission",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class Submission extends Model {

	@ManyToOne
	Quiz quiz;

	@ManyToOne
	Mahasiswa mahasiswa;

	@OneToMany
	Collection<Jawaban> jawaban;
	
	private int id;
	private int grade;
	private String date;
	private String status;

	public void calculateGrade() {
		// TODO - implement Submission.calculateGrade
		throw new UnsupportedOperationException();
	}

}