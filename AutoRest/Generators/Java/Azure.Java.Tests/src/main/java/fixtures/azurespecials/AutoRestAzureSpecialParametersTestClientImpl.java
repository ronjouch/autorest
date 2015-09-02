/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;

/**
 * Initializes a new instance of the AutoRestAzureSpecialParametersTestClient class.
 */
public class AutoRestAzureSpecialParametersTestClientImpl extends ServiceClient implements AutoRestAzureSpecialParametersTestClient {
    private String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    private ServiceClientCredentials credentials;

    /**
     * Gets The management credentials for Azure.
     *
     * @return the credentials value.
     */
    public ServiceClientCredentials getCredentials() {
        return this.credentials;
    }

    private String subscriptionId;

    /**
     * Gets The subscription id, which appears in the path, always modeled in credentials. The value is always '1234-5678-9012-3456'
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription id, which appears in the path, always modeled in credentials. The value is always '1234-5678-9012-3456'
     *
     * @param subscriptionId the subscriptionId value.
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    private String apiVersion;

    /**
     * Gets The api version, which appears in the query, the value is always '2015-07-01-preview'
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout for Long Running Operations.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int getLongRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout for Long Running Operations.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    public void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
    }

    private XMsClientRequestId xMsClientRequestId;

    /**
     * Gets the XMsClientRequestId object to access its operations.
     * @return the xMsClientRequestId value.
     */
    public XMsClientRequestId getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    private SubscriptionInCredentials subscriptionInCredentials;

    /**
     * Gets the SubscriptionInCredentials object to access its operations.
     * @return the subscriptionInCredentials value.
     */
    public SubscriptionInCredentials getSubscriptionInCredentials() {
        return this.subscriptionInCredentials;
    }

    private SubscriptionInMethod subscriptionInMethod;

    /**
     * Gets the SubscriptionInMethod object to access its operations.
     * @return the subscriptionInMethod value.
     */
    public SubscriptionInMethod getSubscriptionInMethod() {
        return this.subscriptionInMethod;
    }

    private ApiVersionDefault apiVersionDefault;

    /**
     * Gets the ApiVersionDefault object to access its operations.
     * @return the apiVersionDefault value.
     */
    public ApiVersionDefault getApiVersionDefault() {
        return this.apiVersionDefault;
    }

    private ApiVersionLocal apiVersionLocal;

    /**
     * Gets the ApiVersionLocal object to access its operations.
     * @return the apiVersionLocal value.
     */
    public ApiVersionLocal getApiVersionLocal() {
        return this.apiVersionLocal;
    }

    private SkipUrlEncoding skipUrlEncoding;

    /**
     * Gets the SkipUrlEncoding object to access its operations.
     * @return the skipUrlEncoding value.
     */
    public SkipUrlEncoding getSkipUrlEncoding() {
        return this.skipUrlEncoding;
    }

    /**
     * Initializes an instance of AutoRestAzureSpecialParametersTestClient client.
     */
    public AutoRestAzureSpecialParametersTestClientImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestAzureSpecialParametersTestClient client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestAzureSpecialParametersTestClientImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestAzureSpecialParametersTestClient client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param restAdapterBuilder the builder for building up a {@link RestAdapter}
     */
    public AutoRestAzureSpecialParametersTestClientImpl(String baseUri, OkHttpClient client, RestAdapter.Builder restAdapterBuilder) {
        super(client, restAdapterBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        if (this.credentials != null)
        {
            this.credentials.applyCredentialsFilter(this);
        }
        RestAdapter restAdapter = restAdapterBuilder.setEndpoint(baseUri).build();
        this.xMsClientRequestId = new XMsClientRequestIdImpl(restAdapter, this);
        this.subscriptionInCredentials = new SubscriptionInCredentialsImpl(restAdapter, this);
        this.subscriptionInMethod = new SubscriptionInMethodImpl(restAdapter, this);
        this.apiVersionDefault = new ApiVersionDefaultImpl(restAdapter, this);
        this.apiVersionLocal = new ApiVersionLocalImpl(restAdapter, this);
        this.skipUrlEncoding = new SkipUrlEncodingImpl(restAdapter, this);
    }
}
