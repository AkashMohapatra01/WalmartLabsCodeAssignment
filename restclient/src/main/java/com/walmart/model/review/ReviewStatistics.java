
package com.walmart.model.review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "averageOverallRating",
    "overallRatingRange",
    "ratingDistributions",
    "totalReviewCount"
})
public class ReviewStatistics {

    @JsonProperty("averageOverallRating")
    private String averageOverallRating;
    @JsonProperty("overallRatingRange")
    private String overallRatingRange;
    @JsonProperty("ratingDistributions")
    private List<RatingDistribution> ratingDistributions = new ArrayList<RatingDistribution>();
    @JsonProperty("totalReviewCount")
    private String totalReviewCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The averageOverallRating
     */
    @JsonProperty("averageOverallRating")
    public String getAverageOverallRating() {
        return averageOverallRating;
    }

    /**
     * 
     * @param averageOverallRating
     *     The averageOverallRating
     */
    @JsonProperty("averageOverallRating")
    public void setAverageOverallRating(String averageOverallRating) {
        this.averageOverallRating = averageOverallRating;
    }

    /**
     * 
     * @return
     *     The overallRatingRange
     */
    @JsonProperty("overallRatingRange")
    public String getOverallRatingRange() {
        return overallRatingRange;
    }

    /**
     * 
     * @param overallRatingRange
     *     The overallRatingRange
     */
    @JsonProperty("overallRatingRange")
    public void setOverallRatingRange(String overallRatingRange) {
        this.overallRatingRange = overallRatingRange;
    }

    /**
     * 
     * @return
     *     The ratingDistributions
     */
    @JsonProperty("ratingDistributions")
    public List<RatingDistribution> getRatingDistributions() {
        return ratingDistributions;
    }

    /**
     * 
     * @param ratingDistributions
     *     The ratingDistributions
     */
    @JsonProperty("ratingDistributions")
    public void setRatingDistributions(List<RatingDistribution> ratingDistributions) {
        this.ratingDistributions = ratingDistributions;
    }

    /**
     * 
     * @return
     *     The totalReviewCount
     */
    @JsonProperty("totalReviewCount")
    public String getTotalReviewCount() {
        return totalReviewCount;
    }

    /**
     * 
     * @param totalReviewCount
     *     The totalReviewCount
     */
    @JsonProperty("totalReviewCount")
    public void setTotalReviewCount(String totalReviewCount) {
        this.totalReviewCount = totalReviewCount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
