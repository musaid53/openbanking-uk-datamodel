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
package uk.org.openbanking.testsupport.payment;

import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.payment.OBRisk1;
import uk.org.openbanking.datamodel.payment.OBSupplementaryData1;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticStandingOrder3DataInitiation;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticStandingOrderConsent4;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticStandingOrderConsent4Data;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticStandingOrderConsent4Data.PermissionEnum;

import static org.joda.time.DateTime.now;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationCreditorAccount;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationDebtorAccount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsent3DataAuthorisation;

/**
 * Test data factory for the various "OBWriteDomesticStandingOrderConsent" classes.
 */
public class OBWriteDomesticStandingOrderConsentTestDataFactory {

    public static OBWriteDomesticStandingOrderConsent4 aValidOBWriteDomesticStandingOrderConsent4() {
        return (new OBWriteDomesticStandingOrderConsent4())
                .data(aValidOBWriteDomesticStandingOrderConsent4Data())
                .risk(new OBRisk1());
    }

    public static OBWriteDomesticStandingOrderConsent4Data aValidOBWriteDomesticStandingOrderConsent4Data() {
        return (new OBWriteDomesticStandingOrderConsent4Data())
                .permission(PermissionEnum.CREATE)
                .initiation(aValidOBWriteDomesticStandingOrder3DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent3DataAuthorisation());
    }

    public static OBWriteDomesticStandingOrder3DataInitiation aValidOBWriteDomesticStandingOrder3DataInitiation() {
        DateTime now = now();
        return (new OBWriteDomesticStandingOrder3DataInitiation())
                .frequency("EvryWorkgDay")
                .reference("Ipsum Non Arcu Inc.")
                .numberOfPayments("1")
                .firstPaymentDateTime(now)
                .recurringPaymentDateTime(now)
                .finalPaymentDateTime(now)
                .firstPaymentAmount(aValidOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount())
                .recurringPaymentAmount(aValidOBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount())
                .finalPaymentAmount(aValidOBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount())
                .debtorAccount(aValidOBWriteDomesticStandingOrder3DataInitiationDebtorAccount())
                .creditorAccount(aValidOBWriteDomesticStandingOrder3DataInitiationCreditorAccount())
                .supplementaryData(new OBSupplementaryData1());
    }
}