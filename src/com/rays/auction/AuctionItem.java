package com.rays.auction;

import java.util.Set;

public class AuctionItem {

	private int id;
	private Set bid;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set getBid() {
		return bid;
	}

	public void setBid(Set bid) {
		this.bid = bid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
