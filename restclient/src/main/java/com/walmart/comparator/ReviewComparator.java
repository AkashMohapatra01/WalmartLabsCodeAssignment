package com.walmart.comparator;

import java.util.Comparator;

import com.walmart.model.RecomendedProduct;

/**
 * 
 * @author AKASH
 * The review comparator helps to sort the reviews based on Average overal Rating.
 *
 */
public class ReviewComparator implements Comparator<RecomendedProduct> {

	
	public int compare(RecomendedProduct prod1, RecomendedProduct prod2) {
		// TODO Auto-generated method stub
		if (null!=prod1 && null!= prod2 &&null != prod1.getAverageOverallRating()
				&& null != prod2.getAverageOverallRating()) {
			return Float.compare(prod2.getAverageOverallRating(),
					prod1.getAverageOverallRating());
		} else {
			return 0;
		}
	}

}
