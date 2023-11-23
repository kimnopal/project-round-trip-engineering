package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Submission extends Model {

	Quiz quiz;
	Mahasiswa mahasiswa;
	Collection<Jawaban> jawaban;
	private int grade;
	private String date;
	private String status;

	public void calculateGrade() {
		// TODO - implement Submission.calculateGrade
		throw new UnsupportedOperationException();
	}

}