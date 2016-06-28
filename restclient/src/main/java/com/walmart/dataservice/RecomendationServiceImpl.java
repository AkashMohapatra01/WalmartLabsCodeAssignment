package com.walmart.dataservice;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.walmart.model.recomendation.SearchRecomendation;
import com.walmart.model.review.SearchReview;
import com.walmart.model.search.Item;
import com.walmart.model.search.SearchResponse;
import com.walmart.util.WebclientFactory;

public class RecomendationServiceImpl implements IRecomendationService{
	
	private static final String SEARCHAPI_ENDPOINT="http://api.walmartlabs.com/v1/search";

	private static final String RECOMENDATIONAPI_ENDPOINT="http://api.walmartlabs.com/v1/nbp";
	
	private static final String REVIEWAPI_ENDPOINT="http://api.walmartlabs.com/v1/reviews/";
			
	private static final String API_KEY="xmyrhvjscpe74brvr5b2yt6b";
	
	
	
	public Item getFirstItemFromSearchAPI(String query) {
		
		Client client = WebclientFactory.createClientInstance();
		Item item = null;
		System.out.println("Search API invocation start :");
		WebResource webResource = client
				.resource(SEARCHAPI_ENDPOINT+"?apiKey="+API_KEY+"&query="+query);

		ClientResponse response = webResource.get(ClientResponse.class);

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}

		ObjectMapper mapper = new ObjectMapper();

		// JSON from file to Object
		try {
			SearchResponse searchResponse = mapper.readValue(
					response.getEntity(String.class), SearchResponse.class);

			item = searchResponse.getItems().get(0);

			System.out.println("item retrieved from Search api call---"
					+ item.getItemId());
			System.out.println("Search API invocation End :");

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (ClientHandlerException e) {
			e.printStackTrace();
		} catch (UniformInterfaceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return item;

	}
	
	
	
	public SearchRecomendation[] getRecomedationForItem(Integer itemId) {
		System.out.println("recomendation for itemID" + itemId);

		Client client = WebclientFactory.createClientInstance();

		SearchRecomendation[] searchRecomendation = null;

		WebResource webResource = client
				.resource(RECOMENDATIONAPI_ENDPOINT+"?apiKey="+API_KEY+"&itemId="+ itemId);

		ClientResponse response = webResource.get(ClientResponse.class);

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}

		ObjectMapper mapper = new ObjectMapper();

		// JSON from file to Object
		try {
			searchRecomendation = mapper.readValue(
					response.getEntity(String.class),
					SearchRecomendation[].class);

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (ClientHandlerException e) {
			e.printStackTrace();
		} catch (UniformInterfaceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return searchRecomendation;
	}
	
	
	public SearchReview getReviewForItem(Integer itemId) {
		Client client = WebclientFactory.createClientInstance();

		SearchReview searchReview = null;

		WebResource webResource = client
				.resource(REVIEWAPI_ENDPOINT+ itemId+ "?apiKey="+API_KEY+"&format=json");

		ClientResponse response = webResource.get(ClientResponse.class);

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}

		ObjectMapper mapper = new ObjectMapper();

		// JSON from file to Object
		try {
			searchReview = mapper.readValue(response.getEntity(String.class),
					SearchReview.class);

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (ClientHandlerException e) {
			e.printStackTrace();
		} catch (UniformInterfaceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return searchReview;

	}
	
	


}
