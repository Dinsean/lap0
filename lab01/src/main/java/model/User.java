package model;
import java.io.Serializable;

public class User implements Serializable {
	

	private static final long serialVersionUID = 5173246893312576588L;
	private String firstName;
	private String lastName;
	private String email;
	private String dateOfBirth;
	private String contactVia;
	private String replyUs;
	private String yourChoose;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getContactVia() {
		return contactVia;
	}
	public void setContactVia(String contactVia) {
		this.contactVia = contactVia;
	}
	



	public String getReplyUs() {
		return replyUs;
	}
	public void setReplyUs(String replyUs) {
		this.replyUs = replyUs;
	}
	
	public String getYourChoose() {
		return yourChoose;
	}
	public void setYourChoose(String yourChoose) {
		this.yourChoose = yourChoose;
	}
	public User(String firstName, String lastName, String email, String dateOfBirth, String contactVia, String replyUs, String yourChoose) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.contactVia = contactVia;
		this.replyUs = replyUs;
		this.yourChoose = yourChoose;
	}
	
	
	}

