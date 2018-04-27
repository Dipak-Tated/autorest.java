/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.paging.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for a set of operations, such as:
 * Paging_getMultiplePagesFragmentWithGroupingNextLink,
 * Paging_nextFragmentWithGrouping.
 */
public final class CustomParameterGroupInner {
    /**
     * Sets the api version to use.
     */
    @JsonProperty(value = "", required = true)
    private String apiVersion;

    /**
     * Sets the tenant to use.
     */
    @JsonProperty(value = "", required = true)
    private String tenant;

    /**
     * Get the apiVersion value.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion value.
     *
     * @param apiVersion the apiVersion value to set.
     * @return the CustomParameterGroupInner object itself.
     */
    public CustomParameterGroupInner withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the tenant value.
     *
     * @return the tenant value.
     */
    public String tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant value.
     *
     * @param tenant the tenant value to set.
     * @return the CustomParameterGroupInner object itself.
     */
    public CustomParameterGroupInner withTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
}