package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "jawaban",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class Jawaban extends Model {

	@ManyToOne
	Submission submission;
	
	private int id;
	private String value;

}