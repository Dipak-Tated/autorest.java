/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.validation;

import com.microsoft.rest.v2.RestClient;
import com.microsoft.rest.v2.RestException;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.validation.models.ErrorException;
import fixtures.validation.models.Product;
import java.io.IOException;
import rx.Observable;
import rx.Single;

/**
 * The interface for AutoRestValidationTest class.
 */
public interface AutoRestValidationTest {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
     */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "http://localhost";

    /**
     * Gets Subscription ID..
     *
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * Sets Subscription ID..
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    AutoRestValidationTest withSubscriptionId(String subscriptionId);

    /**
     * Gets Required string following pattern \d{2}-\d{2}-\d{4}.
     *
     * @return the apiVersion value.
     */
    String apiVersion();

    /**
     * Sets Required string following pattern \d{2}-\d{2}-\d{4}.
     *
     * @param apiVersion the apiVersion value.
     * @return the service client itself
     */
    AutoRestValidationTest withApiVersion(String apiVersion);

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Product object if successful.
     */
    Product validationOfMethodParameters(String resourceGroupName, int id);

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Product> validationOfMethodParametersAsync(String resourceGroupName, int id, final ServiceCallback<Product> serviceCallback);

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Product object
     */
    Single<Product> validationOfMethodParametersAsync(String resourceGroupName, int id);

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Product object
     */
    Single<RestResponse<Void, Product>> validationOfMethodParametersWithRestResponseAsync(String resourceGroupName, int id);


    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Product object if successful.
     */
    Product validationOfBody(String resourceGroupName, int id);

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Product> validationOfBodyAsync(String resourceGroupName, int id, final ServiceCallback<Product> serviceCallback);

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Product object
     */
    Single<Product> validationOfBodyAsync(String resourceGroupName, int id);

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Product object
     */
    Single<RestResponse<Void, Product>> validationOfBodyWithRestResponseAsync(String resourceGroupName, int id);
    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Product object if successful.
     */
    Product validationOfBody(String resourceGroupName, int id, Product body);

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Product> validationOfBodyAsync(String resourceGroupName, int id, Product body, final ServiceCallback<Product> serviceCallback);

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Product object
     */
    Single<Product> validationOfBodyAsync(String resourceGroupName, int id, Product body);

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Product object
     */
    Single<RestResponse<Void, Product>> validationOfBodyWithRestResponseAsync(String resourceGroupName, int id, Product body);


    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getWithConstantInPath();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getWithConstantInPathAsync(final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getWithConstantInPathAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getWithConstantInPathWithRestResponseAsync();


    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Product object if successful.
     */
    Product postWithConstantInBody();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Product> postWithConstantInBodyAsync(final ServiceCallback<Product> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Product object
     */
    Single<Product> postWithConstantInBodyAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Product object
     */
    Single<RestResponse<Void, Product>> postWithConstantInBodyWithRestResponseAsync();
    /**
     *
     * @param body the Product value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Product object if successful.
     */
    Product postWithConstantInBody(Product body);

    /**
     *
     * @param body the Product value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Product> postWithConstantInBodyAsync(Product body, final ServiceCallback<Product> serviceCallback);

    /**
     *
     * @param body the Product value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Product object
     */
    Single<Product> postWithConstantInBodyAsync(Product body);

    /**
     *
     * @param body the Product value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Product object
     */
    Single<RestResponse<Void, Product>> postWithConstantInBodyWithRestResponseAsync(Product body);


}
