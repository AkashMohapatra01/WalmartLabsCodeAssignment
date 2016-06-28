package com.walmart.facade;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.walmart.restclient.AppTest;


/**
 * 
 * @author AKASH
 * 
 * This class helps in testing functional test for different search criteria.
 *
 */
public class TestRecomendationFacadeImpl {

	private static IRecomendationFacade facade;
	
	
	   @BeforeClass
	   public  static void init() {	
	      facade = new RecomendationFacadeImpl();
	      
	   }
	   
	   @Test
	   public void invokeAllRecomendationServicesWithNullParameter(){	
	      
		   String searchString=null;
		   String returnValue=facade.invokeAllRecomendationServices(searchString);
	      Assert.assertNotNull(returnValue);
	      Assert.assertSame(" Null value entered","FAIL", returnValue);;
	   }
	   
	   
	   @Test
	   public void invokeAllRecomendationServicesWithString(){	
	      
		   String searchString="watch";
		   String returnValue=facade.invokeAllRecomendationServices(searchString);
	      Assert.assertNotNull(returnValue);
	      Assert.assertSame(" valid search","SUCCESS", returnValue);;
	   }
	   
	   @Test
	   public void invokeAllRecomendationServicesWithLongText(){	
	      
		   String searchString="titan";
		   String returnValue=facade.invokeAllRecomendationServices(searchString);
	      Assert.assertNotNull(returnValue);
	      Assert.assertSame("valid search","SUCCESS", returnValue);;
	   }
}
