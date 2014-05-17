/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.kernal.visor.cmd;

import java.io.Serializable;
import java.util.*;

/**
 * TODO: Add class description.
 */
public class VisorMultiNodeArg implements Serializable {
    private final Set<UUID> nodeIds;

    /**
     * Create task argument with specified nodes Ids.
     *
     * @param ids Nodes Ids.
     */
    public VisorMultiNodeArg(Set<UUID> ids) {
        nodeIds = ids;
    }

    /**
     * @return Node ids.
     */
    public Set<UUID> nodeIds() {
        return nodeIds;
    }
}

