/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.megad;

import java.util.Set;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

import com.google.common.collect.ImmutableSet;

/**
 * The {@link MegadOneTryBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Petr Shatsillo - Initial contribution
 */
public class MegaDBindingConstants {

    public static final String BINDING_ID = "megad";

    public static final String BRIDGE_MEGAD = "bridge";

    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_DEVICE = new ThingTypeUID(BINDING_ID, "device");
    public final static ThingTypeUID THING_TYPE_UID_BRIDGE = new ThingTypeUID(BINDING_ID, BRIDGE_MEGAD);

    // List of all Channel ids
    public final static String CHANNEL_IN = "in";
    public final static String CHANNEL_INCOUNT = "incount";
    public final static String CHANNEL_OUT = "out";
    public final static String CHANNEL_DIMMER = "dimmer";
    public final static String CHANNEL_DHTTEMP = "temp";
    public final static String CHANNEL_DHTHUM = "humidity";
    public final static String CHANNEL_ONEWIRE = "onewire";
    public final static String CHANNEL_ADC = "adc";
    public final static String CHANNEL_AT = "at";
    public final static String CHANNEL_ST = "st";
    public final static String CHANNEL_IB = "ib";
    public final static String CHANNEL_TGET = "tget";
    public final static String CHANNEL_I2C = "i2c";
    public final static String CHANNEL_CONTACT = "contact";

    public final static Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = ImmutableSet.of(THING_TYPE_UID_BRIDGE,
            THING_TYPE_DEVICE);

}
