package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "pilihan",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class Pilihan extends Model {

	@ManyToOne
	Pertanyaan pertanyaan;
	
	private int id;
	private String text;

}