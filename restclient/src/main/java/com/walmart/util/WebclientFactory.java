package com.walmart.util;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;


public class WebclientFactory {
	
	
	private static final ClientConfig clientConfig =new DefaultClientConfig();

	private static final Client client =Client.create(clientConfig);
	
	/**
	 * private constructor 
	 */
	private WebclientFactory() {
		
	}
	
	/*
	 * Return single instance of the client.
	 */
	public static Client createClientInstance() {
		
	clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,
				Boolean.TRUE);
		
	return client;
	}

}
