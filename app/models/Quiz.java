package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Quiz extends Model {

	Dosen dosen;
	Collection<Mahasiswa> mahasiswa;
	Collection<Pertanyaan> pertanyaan;
	Collection<Submission> submission;
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