package cat.tecnocampus.courseProject.application.dto;

import cat.tecnocampus.courseProject.domain.Bid;

public class BidDTO {

	private String idAbsUser;
	private String idAuction;
	private String idBid;
	private float quantity;
	private float price;
	private boolean winner;
	
	public BidDTO() {
		
	}
	
	public BidDTO(Bid bid) {
		this.idAbsUser = bid.getIdAbsUser();
		this.idAuction = bid.getIdAuction();
		this.idBid = bid.getIdBid();
		this.quantity = bid.getQuantity();
		this.price = bid.getPrice();
		this.winner = bid.isWinner();
	}

	public String getIdAbsUser() {
		return idAbsUser;
	}

	public void setIdAbsUser(String idAbsUser) {
		this.idAbsUser = idAbsUser;
	}

	public String getIdAuction() {
		return idAuction;
	}

	public void setIdAuction(String idAuction) {
		this.idAuction = idAuction;
	}

	public String getIdBid() {
		return idBid;
	}

	public void setIdBid(String idBid) {
		this.idBid = idBid;
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
