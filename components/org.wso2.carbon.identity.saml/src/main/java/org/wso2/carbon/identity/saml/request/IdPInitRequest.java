/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.saml.request;

import org.wso2.carbon.identity.auth.saml2.common.SAML2AuthConstants;

/**
 * IdP Initiated SAML2 SSO Request.
 */
public class IdPInitRequest extends SAML2SSORequest {

    private static final long serialVersionUID = 1430097995526520192L;

    public IdPInitRequest(SAMLIdpInitRequestBuilder builder) {
        super(builder);
    }

    public String getAcs() {
        return this.getParameter(SAML2AuthConstants.ACS);
    }

    public String getSPEntityId() {
        return this.getParameter(SAML2AuthConstants.SP_ENTITY_ID);
    }

    /**
     * Builder used to build a IdP Initiated SAML2 SSO Request.
     */
    public static class SAMLIdpInitRequestBuilder extends SAMLGatewayRequestBuilder {

        public SAMLIdpInitRequestBuilder() {
        }

        @Override
        public IdPInitRequest build() {
            return new IdPInitRequest(this);
        }
    }
}