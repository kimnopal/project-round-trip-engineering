package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Jawaban extends Model {

	Submission submission;
	private String value;

}