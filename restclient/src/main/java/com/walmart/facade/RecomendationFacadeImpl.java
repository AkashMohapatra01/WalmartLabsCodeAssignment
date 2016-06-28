package com.walmart.facade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.walmart.comparator.ReviewComparator;
import com.walmart.dataservice.IRecomendationService;
import com.walmart.dataservice.RecomendationServiceImpl;
import com.walmart.model.RecomendedProduct;
import com.walmart.model.recomendation.SearchRecomendation;
import com.walmart.model.review.SearchReview;
import com.walmart.model.search.Item;

public class RecomendationFacadeImpl implements IRecomendationFacade{
	
	
	private IRecomendationService recomendationService= null;
	
	private static final String SUCCESS="SUCCESS";
	
	private static final String FAIL="FAIL";
	
	
	
	
	public RecomendationFacadeImpl() {
		
		recomendationService = new RecomendationServiceImpl();
	}
	

	public IRecomendationService getRecomendationService() {
		return recomendationService;
	}


	public void setRecomendationService(IRecomendationService recomendationService) {
		this.recomendationService = recomendationService;
	}




	public String invokeAllRecomendationServices(String searchString) {
		
		// Check for null String.
		if(null==searchString){
			System.out.println("Enter a valid search string");
			return FAIL;
		}
		
		//1. Call Search API and retrieve the first item from the list
		Item item = recomendationService.getFirstItemFromSearchAPI(searchString);

		
		List<RecomendedProduct> productRecomendationList = new ArrayList<RecomendedProduct>();

		// List of recomendations
		SearchRecomendation[] recomendations =recomendationService.getRecomedationForItem(item
				.getItemId());

		int count=0;
		
		for (SearchRecomendation recomendation : recomendations) {

			// invoke the review api for each recomendation.

			SearchReview review = recomendationService.getReviewForItem(recomendation.getItemId());
			
			populateRecomendationProduct(productRecomendationList,
					recomendation, review);
			//counter check for 10 items.
			if(++count>=10){
				break;
			}

		}

		Collections.sort(productRecomendationList,new ReviewComparator());

		System.out.println("Recomended product sorted based on rating :");
		
		System.out.println("PRODUCT_NAME ||PRODUCT_RATING");
				

		for (RecomendedProduct prod : productRecomendationList) {

			System.out.println(prod.getName() + "||"
					+ prod.getAverageOverallRating());
			
		}
		
		return SUCCESS;
	
	}

	
	private static void populateRecomendationProduct(
			List<RecomendedProduct> productRecomendationList,
			SearchRecomendation recomendation, SearchReview review) {

		RecomendedProduct prod = new RecomendedProduct();

		prod.setName(recomendation.getName());
		prod.setItemId(recomendation.getItemId());
		prod.setShortDescription(recomendation.getShortDescription());
		
		if(null!=review.getReviewStatistics()){
			
		prod.setAverageOverallRating(Float.valueOf(review.getReviewStatistics()
				.getAverageOverallRating()));
		}

		productRecomendationList.add(prod);

	}
	
	
}
