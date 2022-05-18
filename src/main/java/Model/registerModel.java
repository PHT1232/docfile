package Model;

public class registerModel {
	private String username;
	private String password;
	private String FirstName;
	private String LastName;
	private String email;
	private String SecurityQuestion;
	private String SecurityAnswer;
	private String phoneNumber;
	
	public registerModel() {
		
	}
	
	public registerModel(String username, String password, String firstName, String lastName, String email,
			String securityQuestion, String securityAnswer, String phoneNumber) {
		super();
		this.username = username;
		this.password = password;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		SecurityQuestion = securityQuestion;
		this.SecurityAnswer = securityAnswer;
		this.phoneNumber = phoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSecurityQuestion() {
		return SecurityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		SecurityQuestion = securityQuestion;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSecurityAnswer() {
		return SecurityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		SecurityAnswer = securityAnswer;
	}
	
}
