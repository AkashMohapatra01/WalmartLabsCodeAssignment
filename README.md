#WalmartLabsCodeAssignment
a simple program to rank-order Walmart product recommendations based upon customer reviews.

#Synopsis
<p>Using Java technology, a small program has been created in order to rank-order the recommended products based upon their review sentiments. The workflow of the functionalities of the program is described as belows:</p>
     1.Search for products based upon a user-provided search string.
      2.Use the first item in the search response as input for a product recommendation search.
      3.Retrieve reviews of the first 10 product recommendations.
      4.Rank-order Walmart product recommendations using the review sentiments of the customers.
  
#How to run the program
<p>Inorder to run the above code, follow the below steps:</p>
    1.Download the restclient.zip .
    2.Unzip the restclient.zip .
    3.Execute the command 'MVN clean install'. This would exeute all the test cases and install the jars in the local repositories.
    4.Navigate to the target folder and execute the runnable jars according to the following command: 'java -jar restclient.jar -s <watch>
    5.Get the results.


#API References
<p>The following references are used:</p>
     1.https://developer.walmartlabs.com/docs/read/Search_API
     2.https://developer.walmartlabs.com/docs/read/Product_Recommendation_API
     3.https://developer.walmartlabs.com/docs/read/Reviews_Api
