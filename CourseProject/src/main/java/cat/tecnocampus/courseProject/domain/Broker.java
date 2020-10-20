package cat.tecnocampus.courseProject.domain;

import cat.tecnocampus.courseProject.application.dto.BrokerDTO;

public class Broker extends AbsUser {
	public Broker(String id, String password) {
		super(id, password);
		// TODO Auto-generated constructor stub
	}
	
	public Broker (BrokerDTO broker) {
		super(broker.getId(), broker.getPassword());
	}
}
