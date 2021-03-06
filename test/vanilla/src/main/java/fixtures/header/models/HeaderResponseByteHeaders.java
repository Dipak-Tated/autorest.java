/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for responseByte operation.
 */
public class HeaderResponseByteHeaders {
    /**
     * response with header values "啊齄丂狛狜隣郎隣兀﨩".
     */
    @JsonProperty(value = "value")
    private byte[] value;

    /**
     * Get response with header values "啊齄丂狛狜隣郎隣兀﨩".
     *
     * @return the value value
     */
    public byte[] value() {
        return this.value;
    }

    /**
     * Set response with header values "啊齄丂狛狜隣郎隣兀﨩".
     *
     * @param value the value value to set
     * @return the HeaderResponseByteHeaders object itself.
     */
    public HeaderResponseByteHeaders withValue(byte[] value) {
        this.value = value;
        return this;
    }

}
