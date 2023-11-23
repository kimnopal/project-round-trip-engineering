package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "quiz",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class Quiz extends Model {

	@ManyToOne
	Dosen dosen;

	@OneToMany
	Collection<Mahasiswa> mahasiswa;

	@OneToMany
	Collection<Pertanyaan> pertanyaan;

	@OneToMany
	Collection<Submission> submission;
	
	private int id;
	private String title;
	private String description;
	private String creator;
	private String subject;
	private String invitationCode;
	private int duration;

	public void verifyInvitationCode() {
		// TODO - implement Quiz.verifyInvitationCode
		throw new UnsupportedOperationException();
	}

}