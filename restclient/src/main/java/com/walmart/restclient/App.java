package com.walmart.restclient;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import com.walmart.facade.IRecomendationFacade;
import com.walmart.facade.RecomendationFacadeImpl;

/**
 * 
 * @author AKASH
 *
 */
public class App {
	
	//Reference for the recommendation facade . The facade  hides the business logic from the client implementation.
	private static IRecomendationFacade recomendationFacade=null;
	
	
	public static void main(String[] args) {

		// Apache commons CLI is used to decorate the command line parameters  
		CommandLineParser parser = new DefaultParser();

		Options options = new Options();
		
		// This is command line options for the search string.
		options.addOption("s", "search", true, "Enter the product String");
		
		try {
			CommandLine cmd = parser.parse(options, args);

			if (cmd.hasOption("s")) {
				//1. Invoke the recommendation facade passing the search string.
				recomendationFacade= new RecomendationFacadeImpl();
				recomendationFacade.invokeAllRecomendationServices(cmd.getOptionValue("s"));
				
			} else {
				// Command line parameter help indicators.
				HelpFormatter formatter = new HelpFormatter();
				formatter.printHelp("Command line parameters", options);
			}
		} catch (ParseException ex) {
			ex.printStackTrace();
		} 

	}


}
