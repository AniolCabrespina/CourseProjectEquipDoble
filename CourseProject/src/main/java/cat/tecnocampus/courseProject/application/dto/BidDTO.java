package cat.tecnocampus.courseProject.application.dto;

import cat.tecnocampus.courseProject.domain.Bid;

public class BidDTO {

	private String id;
	private float quantity;
	private float price;
	private boolean winner;
	
	public BidDTO() {
		
	}
	
	public BidDTO(Bid bid) {
		this.id = bid.getId();
		this.quantity = bid.getQuantity();
		this.price = bid.getPrice();
		this.winner = bid.isWinner();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	
	
	
}
