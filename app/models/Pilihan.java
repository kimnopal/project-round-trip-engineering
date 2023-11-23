package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Pilihan extends Model {

	Pertanyaan pertanyaan;
	private String text;

}