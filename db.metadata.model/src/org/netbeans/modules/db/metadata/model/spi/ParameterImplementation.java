/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.db.metadata.model.spi;

import org.netbeans.modules.db.metadata.model.MetadataAccessor;
import org.netbeans.modules.db.metadata.model.api.Parameter;
import org.netbeans.modules.db.metadata.model.api.Parameter.Direction;

/**
 *
 * @author Andrei Badea
 */
public abstract class ParameterImplementation extends ValueImplementation {

    private Parameter param;

    public final Parameter getParameter() {
        if (param == null) {
            param = MetadataAccessor.getDefault().createParameter(this);
        }
        return param;
    }

    public abstract Direction getDirection();

    public abstract int getOrdinalPosition();

}