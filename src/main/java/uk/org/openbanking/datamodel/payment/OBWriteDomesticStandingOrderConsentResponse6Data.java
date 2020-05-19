/**
 * Copyright 2019 ForgeRock AS.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.5
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBWriteDomesticStandingOrderConsentResponse6Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T14:52:44.811+01:00")
public class OBWriteDomesticStandingOrderConsentResponse6Data {
    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("CreationDateTime")
    private DateTime creationDateTime = null;

    /**
     * Specifies the status of consent resource in code form.
     */
    public enum StatusEnum {
        AUTHORISED("Authorised"),

        AWAITINGAUTHORISATION("AwaitingAuthorisation"),

        CONSUMED("Consumed"),

        REJECTED("Rejected");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("Status")
    private StatusEnum status = null;

    @JsonProperty("StatusUpdateDateTime")
    private DateTime statusUpdateDateTime = null;

    /**
     * Specifies the Open Banking service request types.
     */
    public enum PermissionEnum {
        CREATE("Create");

        private String value;

        PermissionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PermissionEnum fromValue(String text) {
            for (PermissionEnum b : PermissionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("Permission")
    private PermissionEnum permission = null;

    /**
     * Specifies to share the refund account details with PISP
     */
    public enum ReadRefundAccountEnum {
        NO("No"),

        YES("Yes");

        private String value;

        ReadRefundAccountEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReadRefundAccountEnum fromValue(String text) {
            for (ReadRefundAccountEnum b : ReadRefundAccountEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("ReadRefundAccount")
    private ReadRefundAccountEnum readRefundAccount = null;

    @JsonProperty("CutOffDateTime")
    private DateTime cutOffDateTime = null;

    @JsonProperty("Charges")
    private List<OBWriteDomesticConsentResponse5DataCharges> charges = null;

    @JsonProperty("Initiation")
    private OBWriteDomesticStandingOrder3DataInitiation initiation = null;

    @JsonProperty("Authorisation")
    private OBWriteDomesticConsent4DataAuthorisation authorisation = null;

    @JsonProperty("SCASupportData")
    private OBWriteDomesticConsent4DataSCASupportData scASupportData = null;

    @JsonProperty("Debtor")
    private OBDebtorIdentification1 debtor = null;

    public OBWriteDomesticStandingOrderConsentResponse6Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
     *
     * @return consentId
     **/
    @NotNull
    @Size(min = 1, max = 128)
    @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBWriteDomesticStandingOrderConsentResponse6Data creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteDomesticStandingOrderConsentResponse6Data status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the status of consent resource in code form.
     *
     * @return status
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Specifies the status of consent resource in code form.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OBWriteDomesticStandingOrderConsentResponse6Data statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteDomesticStandingOrderConsentResponse6Data permission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Specifies the Open Banking service request types.
     *
     * @return permission
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Specifies the Open Banking service request types.")
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
        this.permission = permission;
    }

    public OBWriteDomesticStandingOrderConsentResponse6Data readRefundAccount(ReadRefundAccountEnum readRefundAccount) {
        this.readRefundAccount = readRefundAccount;
        return this;
    }

    /**
     * Specifies to share the refund account details with PISP
     *
     * @return readRefundAccount
     **/
    @ApiModelProperty(value = "Specifies to share the refund account details with PISP")
    public ReadRefundAccountEnum getReadRefundAccount() {
        return readRefundAccount;
    }

    public void setReadRefundAccount(ReadRefundAccountEnum readRefundAccount) {
        this.readRefundAccount = readRefundAccount;
    }

    public OBWriteDomesticStandingOrderConsentResponse6Data cutOffDateTime(DateTime cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
        return this;
    }

    /**
     * Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return cutOffDateTime
     **/
    @Valid
    @ApiModelProperty(value = "Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getCutOffDateTime() {
        return cutOffDateTime;
    }

    public void setCutOffDateTime(DateTime cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
    }

    public OBWriteDomesticStandingOrderConsentResponse6Data charges(List<OBWriteDomesticConsentResponse5DataCharges> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteDomesticStandingOrderConsentResponse6Data addChargesItem(OBWriteDomesticConsentResponse5DataCharges chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<OBWriteDomesticConsentResponse5DataCharges>();
        }
        this.charges.add(chargesItem);
        return this;
    }

    /**
     * Get charges
     *
     * @return charges
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBWriteDomesticConsentResponse5DataCharges> getCharges() {
        return charges;
    }

    public void setCharges(List<OBWriteDomesticConsentResponse5DataCharges> charges) {
        this.charges = charges;
    }

    public OBWriteDomesticStandingOrderConsentResponse6Data initiation(OBWriteDomesticStandingOrder3DataInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteDomesticStandingOrder3DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteDomesticStandingOrder3DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteDomesticStandingOrderConsentResponse6Data authorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        this.authorisation = authorisation;
        return this;
    }

    /**
     * Get authorisation
     *
     * @return authorisation
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteDomesticConsent4DataAuthorisation getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        this.authorisation = authorisation;
    }

    public OBWriteDomesticStandingOrderConsentResponse6Data scASupportData(OBWriteDomesticConsent4DataSCASupportData scASupportData) {
        this.scASupportData = scASupportData;
        return this;
    }

    /**
     * Get scASupportData
     *
     * @return scASupportData
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteDomesticConsent4DataSCASupportData getScASupportData() {
        return scASupportData;
    }

    public void setScASupportData(OBWriteDomesticConsent4DataSCASupportData scASupportData) {
        this.scASupportData = scASupportData;
    }

    public OBWriteDomesticStandingOrderConsentResponse6Data debtor(OBDebtorIdentification1 debtor) {
        this.debtor = debtor;
        return this;
    }

    /**
     * Get debtor
     *
     * @return debtor
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBDebtorIdentification1 getDebtor() {
        return debtor;
    }

    public void setDebtor(OBDebtorIdentification1 debtor) {
        this.debtor = debtor;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticStandingOrderConsentResponse6Data obWriteDomesticStandingOrderConsentResponse6Data = (OBWriteDomesticStandingOrderConsentResponse6Data) o;
        return Objects.equals(this.consentId, obWriteDomesticStandingOrderConsentResponse6Data.consentId) &&
                Objects.equals(this.creationDateTime, obWriteDomesticStandingOrderConsentResponse6Data.creationDateTime) &&
                Objects.equals(this.status, obWriteDomesticStandingOrderConsentResponse6Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteDomesticStandingOrderConsentResponse6Data.statusUpdateDateTime) &&
                Objects.equals(this.permission, obWriteDomesticStandingOrderConsentResponse6Data.permission) &&
                Objects.equals(this.readRefundAccount, obWriteDomesticStandingOrderConsentResponse6Data.readRefundAccount) &&
                Objects.equals(this.cutOffDateTime, obWriteDomesticStandingOrderConsentResponse6Data.cutOffDateTime) &&
                Objects.equals(this.charges, obWriteDomesticStandingOrderConsentResponse6Data.charges) &&
                Objects.equals(this.initiation, obWriteDomesticStandingOrderConsentResponse6Data.initiation) &&
                Objects.equals(this.authorisation, obWriteDomesticStandingOrderConsentResponse6Data.authorisation) &&
                Objects.equals(this.scASupportData, obWriteDomesticStandingOrderConsentResponse6Data.scASupportData) &&
                Objects.equals(this.debtor, obWriteDomesticStandingOrderConsentResponse6Data.debtor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, creationDateTime, status, statusUpdateDateTime, permission, readRefundAccount, cutOffDateTime, charges, initiation, authorisation, scASupportData, debtor);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticStandingOrderConsentResponse6Data {\n");

        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    readRefundAccount: ").append(toIndentedString(readRefundAccount)).append("\n");
        sb.append("    cutOffDateTime: ").append(toIndentedString(cutOffDateTime)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
        sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
        sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

