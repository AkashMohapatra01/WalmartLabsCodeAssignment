
package com.walmart.model.recomendation;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "price",
    "sellerInfo",
    "standardShipRate",
    "availableOnline",
    "clearance"
})
public class BestMarketplacePrice {

    @JsonProperty("price")
    private Double price;
    @JsonProperty("sellerInfo")
    private String sellerInfo;
    @JsonProperty("standardShipRate")
    private Integer standardShipRate;
    @JsonProperty("availableOnline")
    private Boolean availableOnline;
    @JsonProperty("clearance")
    private Boolean clearance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The price
     */
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The sellerInfo
     */
    @JsonProperty("sellerInfo")
    public String getSellerInfo() {
        return sellerInfo;
    }

    /**
     * 
     * @param sellerInfo
     *     The sellerInfo
     */
    @JsonProperty("sellerInfo")
    public void setSellerInfo(String sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    /**
     * 
     * @return
     *     The standardShipRate
     */
    @JsonProperty("standardShipRate")
    public Integer getStandardShipRate() {
        return standardShipRate;
    }

    /**
     * 
     * @param standardShipRate
     *     The standardShipRate
     */
    @JsonProperty("standardShipRate")
    public void setStandardShipRate(Integer standardShipRate) {
        this.standardShipRate = standardShipRate;
    }

    /**
     * 
     * @return
     *     The availableOnline
     */
    @JsonProperty("availableOnline")
    public Boolean getAvailableOnline() {
        return availableOnline;
    }

    /**
     * 
     * @param availableOnline
     *     The availableOnline
     */
    @JsonProperty("availableOnline")
    public void setAvailableOnline(Boolean availableOnline) {
        this.availableOnline = availableOnline;
    }

    /**
     * 
     * @return
     *     The clearance
     */
    @JsonProperty("clearance")
    public Boolean getClearance() {
        return clearance;
    }

    /**
     * 
     * @param clearance
     *     The clearance
     */
    @JsonProperty("clearance")
    public void setClearance(Boolean clearance) {
        this.clearance = clearance;
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
