
package com.walmart.model.recomendation;

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
    "allowGiftWrap",
    "allowGiftMessage",
    "allowGiftReceipt"
})
public class GiftOptions {

    @JsonProperty("allowGiftWrap")
    private Boolean allowGiftWrap;
    @JsonProperty("allowGiftMessage")
    private Boolean allowGiftMessage;
    @JsonProperty("allowGiftReceipt")
    private Boolean allowGiftReceipt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The allowGiftWrap
     */
    @JsonProperty("allowGiftWrap")
    public Boolean getAllowGiftWrap() {
        return allowGiftWrap;
    }

    /**
     * 
     * @param allowGiftWrap
     *     The allowGiftWrap
     */
    @JsonProperty("allowGiftWrap")
    public void setAllowGiftWrap(Boolean allowGiftWrap) {
        this.allowGiftWrap = allowGiftWrap;
    }

    /**
     * 
     * @return
     *     The allowGiftMessage
     */
    @JsonProperty("allowGiftMessage")
    public Boolean getAllowGiftMessage() {
        return allowGiftMessage;
    }

    /**
     * 
     * @param allowGiftMessage
     *     The allowGiftMessage
     */
    @JsonProperty("allowGiftMessage")
    public void setAllowGiftMessage(Boolean allowGiftMessage) {
        this.allowGiftMessage = allowGiftMessage;
    }

    /**
     * 
     * @return
     *     The allowGiftReceipt
     */
    @JsonProperty("allowGiftReceipt")
    public Boolean getAllowGiftReceipt() {
        return allowGiftReceipt;
    }

    /**
     * 
     * @param allowGiftReceipt
     *     The allowGiftReceipt
     */
    @JsonProperty("allowGiftReceipt")
    public void setAllowGiftReceipt(Boolean allowGiftReceipt) {
        this.allowGiftReceipt = allowGiftReceipt;
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
