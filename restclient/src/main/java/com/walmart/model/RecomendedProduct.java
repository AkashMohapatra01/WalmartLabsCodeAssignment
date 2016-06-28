package com.walmart.model;

import java.io.Serializable;



public class RecomendedProduct implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int itemId;
	
	private String name;
	
	private String shortDescription;
	
	private Float averageOverallRating;
	
	
	public RecomendedProduct() {
		
	}
	


	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}



	public Float getAverageOverallRating() {
		return averageOverallRating;
	}



	public void setAverageOverallRating(Float averageOverallRating) {
		this.averageOverallRating = averageOverallRating;
	}



	
	
}
