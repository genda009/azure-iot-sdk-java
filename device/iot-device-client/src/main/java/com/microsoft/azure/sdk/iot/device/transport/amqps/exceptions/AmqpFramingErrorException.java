/*
 *  Copyright (c) Microsoft. All rights reserved.
 *  Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.microsoft.azure.sdk.iot.device.transport.amqps.exceptions;

import com.microsoft.azure.sdk.iot.device.exceptions.ProtocolException;

/**
 * This exception is thrown when a amqp:connection:framing-error error is encountered over an AMQP connection
 *
 * See {@linktourl http://docs.oasis-open.org/amqp/core/v1.0/os/amqp-core-complete-v1.0-os.pdf}
 */
public class AmqpFramingErrorException extends ProtocolException
{
    public static final String errorCode = "amqp:connection:framing-error";

    public AmqpFramingErrorException()
    {
        super();
    }

    public AmqpFramingErrorException(String message)
    {
        super(message);
    }

    public AmqpFramingErrorException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public AmqpFramingErrorException(Throwable cause)
    {
        super(cause);
    }
}
