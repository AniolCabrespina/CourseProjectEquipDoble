package cat.tecnocampus.courseProject.domain;

import cat.tecnocampus.courseProject.application.dto.AdminDTO;

public class Admin extends AbsUser {
	protected Admin(String id, String password) {
		super(id, password);
		// TODO Auto-generated constructor stub
	}
	public Admin (AdminDTO admin) {
		super(admin.getId(), admin.getPassword());
	}
}
