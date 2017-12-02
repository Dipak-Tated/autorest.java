/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.head.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.HEAD;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.head.HttpSuccess;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * HttpSuccess.
 */
public class HttpSuccessImpl implements HttpSuccess {
    /** The RestProxy service to perform REST calls. */
    private HttpSuccessService service;
    /** The service client containing this operation class. */
    private AutoRestHeadTestServiceImpl client;

    /**
     * Initializes an instance of HttpSuccessImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HttpSuccessImpl(AutoRestHeadTestServiceImpl client) {
        this.service = AzureProxy.create(HttpSuccessService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for HttpSuccess to be used by
     * RestProxy to perform REST calls.
     */
    @Host("http://localhost")
    interface HttpSuccessService {
        @Headers({ "x-ms-logging-context: fixtures.head.HttpSuccess head200" })
        @HEAD("http/success/200")
        @ExpectedResponses({200, 404})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<RestResponse<Void, Boolean>> head200(@HeaderParam("accept-language") String acceptLanguage);

        @Headers({ "x-ms-logging-context: fixtures.head.HttpSuccess head204" })
        @HEAD("http/success/204")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<RestResponse<Void, Boolean>> head204(@HeaderParam("accept-language") String acceptLanguage);

        @Headers({ "x-ms-logging-context: fixtures.head.HttpSuccess head404" })
        @HEAD("http/success/404")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<RestResponse<Void, Boolean>> head404(@HeaderParam("accept-language") String acceptLanguage);

    }

    /**
     * Return 200 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean head200() {
        return head200Async().blockingGet();
    }

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> head200Async(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(head200Async(), serviceCallback);
    }

    /**
     * Return 200 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<RestResponse<Void, Boolean>> head200WithRestResponseAsync() {
        return service.head200(this.client.acceptLanguage());
    }

    /**
     * Return 200 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<Boolean> head200Async() {
        return head200WithRestResponseAsync()
            .map(new Function<RestResponse<Void, Boolean>, Boolean>() { public Boolean apply(RestResponse<Void, Boolean> restResponse) { return restResponse.body(); } });
        }


    /**
     * Return 204 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean head204() {
        return head204Async().blockingGet();
    }

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> head204Async(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(head204Async(), serviceCallback);
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<RestResponse<Void, Boolean>> head204WithRestResponseAsync() {
        return service.head204(this.client.acceptLanguage());
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<Boolean> head204Async() {
        return head204WithRestResponseAsync()
            .map(new Function<RestResponse<Void, Boolean>, Boolean>() { public Boolean apply(RestResponse<Void, Boolean> restResponse) { return restResponse.body(); } });
        }


    /**
     * Return 404 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean head404() {
        return head404Async().blockingGet();
    }

    /**
     * Return 404 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> head404Async(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(head404Async(), serviceCallback);
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<RestResponse<Void, Boolean>> head404WithRestResponseAsync() {
        return service.head404(this.client.acceptLanguage());
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Boolean> object
     */
    public Single<Boolean> head404Async() {
        return head404WithRestResponseAsync()
            .map(new Function<RestResponse<Void, Boolean>, Boolean>() { public Boolean apply(RestResponse<Void, Boolean> restResponse) { return restResponse.body(); } });
        }


}
