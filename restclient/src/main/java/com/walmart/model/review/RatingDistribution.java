
package com.walmart.model.review;

import java.util.HashMap;
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
    "count",
    "ratingValue"
})
public class RatingDistribution {

    @JsonProperty("count")
    private String count;
    @JsonProperty("ratingValue")
    private String ratingValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The count
     */
    @JsonProperty("count")
    public String getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(String count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The ratingValue
     */
    @JsonProperty("ratingValue")
    public String getRatingValue() {
        return ratingValue;
    }

    /**
     * 
     * @param ratingValue
     *     The ratingValue
     */
    @JsonProperty("ratingValue")
    public void setRatingValue(String ratingValue) {
        this.ratingValue = ratingValue;
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
