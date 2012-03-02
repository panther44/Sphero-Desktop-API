/*
 * Please read the LICENSE file that is included with the source
 * code.
 */
package se.nicklasgavelin.sphero.response.information;

import se.nicklasgavelin.sphero.response.InformationResponseMessage;

/**
 *
 * @author Nicklas Gavelin, nicklas.gavelin@gmail.com, Luleå University of
 * Technology
 */
public class EmitResponse extends InformationResponseMessage
{
    /**
     * Index for the identifier
     */
    private static final int EMIT_IDENTIFIER_INDEX = 5;
    // Internal storage
    private byte identifier;


    /**
     * Create an Emit response from the received data
     *
     * @param data The received data
     */
    public EmitResponse( ResponseHeader rh )
    {
        super( rh );
        this.identifier = rh.getRawPacket()[ EMIT_IDENTIFIER_INDEX];//data[ EMIT_IDENTIFIER_INDEX];
    }


    /**
     * Returns the identifier for this message
     *
     * @return The identifier for this message
     */
    public byte getIdentifier()
    {
        return this.identifier;
    }
}
