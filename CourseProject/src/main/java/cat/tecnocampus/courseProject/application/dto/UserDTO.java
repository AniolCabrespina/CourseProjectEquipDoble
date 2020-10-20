package cat.tecnocampus.courseProject.application.dto;

import cat.tecnocampus.courseProject.domain.User;

public class UserDTO {

	private String id;
	private String password;
	
	
	public UserDTO() {
		super();
	}

	public UserDTO(User user) {
		this.id = user.getId();
		this.password = user.getPassword();
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
