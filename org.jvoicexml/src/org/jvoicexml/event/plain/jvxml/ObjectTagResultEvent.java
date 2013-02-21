/*
 * File:    $HeadURL$
 * Version: $LastChangedRevision$
 * Date:    $Date$
 * Author:  $LastChangedBy$
 *
 * JVoiceXML - A free VoiceXML implementation.
 *
 * Copyright (C) 2007 JVoiceXML group - http://jvoicexml.sourceforge.net
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Library General Public
 *  License as published by the Free Software Foundation; either
 *  version 2 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Library General Public License for more details.
 *
 *  You should have received a copy of the GNU Library General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

package org.jvoicexml.event.plain.jvxml;

/**
 * Result of an <code>&lt;object&gt;</code> call..
 *
 * @author Dirk Schnelle
 * @version $Revision$
 * @since 0.6
 *
 * <p>
 * Copyright &copy; 2007 JVoiceXML group - <a
 * href="http://jvoicexml.sourceforge.net">http://jvoicexml.sourceforge.net/
 * </a>
 * </p>
 */
@SuppressWarnings("serial")
public final class ObjectTagResultEvent
        extends AbstractInputEvent {
    /** The detail message. */
    public static final String EVENT_TYPE =
        ObjectTagResultEvent.class.getName();

    /** The result of the method call. */
    private final Object result;

    /**
     * Constructs a new object.
     * @param methodResult result of the method call.
     */
    public ObjectTagResultEvent(final Object methodResult) {
        result = methodResult;
    }

    /**
     * {@inheritDoc}
     */
    public Object getInputResult() {
        return result;
    }

    /**
     * {@inheritDoc}
     */
    public String getEventType() {
        return EVENT_TYPE;
    }
}
