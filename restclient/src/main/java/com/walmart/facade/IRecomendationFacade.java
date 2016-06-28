package com.walmart.facade;

/**
 * 
 * @author AKASH
 *
 */
public interface IRecomendationFacade {

	/*
	 * This method handles the business logic for calculating the recommendation for the search string.
	 */
	public String invokeAllRecomendationServices(String searchString);
	
}
