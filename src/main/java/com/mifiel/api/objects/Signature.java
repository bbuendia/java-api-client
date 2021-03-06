package com.mifiel.api.objects;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({ "email", "signed", "signed_at", "certificate_id", "tax_id", "signature", "user" })
public class Signature {

    @JsonProperty("email")
    private String email;
    @JsonProperty("signed")
    private Boolean signed;
    @JsonProperty("signed_at")
    private String signedAt;
    @JsonProperty("certificate_id")
    private String certificateId;
    @JsonProperty("tax_id")
    private String taxId;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("user")
    private User user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("signed")
    public Boolean getSigned() {
        return signed;
    }

    @JsonProperty("signed")
    public void setSigned(Boolean signed) {
        this.signed = signed;
    }

    @JsonProperty("signed_at")
    public String getSignedAt() {
        return signedAt;
    }

    @JsonProperty("signed_at")
    public void setSignedAt(String signedAt) {
        this.signedAt = signedAt;
    }

    @JsonProperty("certificate_id")
    public String getCertificateId() {
        return certificateId;
    }

    @JsonProperty("certificate_id")
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    @JsonProperty("tax_id")
    public String getTaxId() {
        return taxId;
    }

    @JsonProperty("tax_id")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    @JsonProperty("signature")
    public String getSignature() {
        return signature;
    }

    @JsonProperty("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Signature [email=" + email + ", signed=" + signed + ", signedAt=" + signedAt + ", certificateId="
                + certificateId + ", taxId=" + taxId + ", signature=" + signature + ", user=" + user
                + ", additionalProperties=" + additionalProperties + "]";
    }

}