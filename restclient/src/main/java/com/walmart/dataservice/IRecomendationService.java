package com.walmart.dataservice;

import com.walmart.model.recomendation.SearchRecomendation;
import com.walmart.model.review.SearchReview;
import com.walmart.model.search.Item;

/**
 * 
 * @author AKASH
 * IRecomendationService  Interface for webservice invocations
 *
 */
public interface IRecomendationService{

	/*
	 * This method accepts the search String and returns the first Item from the List of products
	 */
	public  Item getFirstItemFromSearchAPI(String query) ;
	
	/*
	 * This method accepts the product ID and returns the the recomendations
	 */
	public  SearchRecomendation[] getRecomedationForItem(Integer itemId);

	/*
	 * This method accepts the recomendation ID and returns the review.
	 */
	public  SearchReview getReviewForItem(Integer itemId);
	
}
