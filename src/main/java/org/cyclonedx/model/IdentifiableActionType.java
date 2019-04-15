/*
 * This file is part of CycloneDX Core (Java).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) Steve Springett. All Rights Reserved.
 */
package org.cyclonedx.model;

import org.cyclonedx.CycloneDxSchema;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

@SuppressWarnings("unused")
public class IdentifiableActionType {

    private Date timestamp;
    private String name;
    private String email;

    public Date getTimestamp() {
        return timestamp;
    }

    @XmlElement(name = "timestamp", namespace = CycloneDxSchema.NS_BOM_LATEST)
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name", namespace = CycloneDxSchema.NS_BOM_LATEST)
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    @XmlElement(name = "email", namespace = CycloneDxSchema.NS_BOM_LATEST)
    public void setEmail(String email) {
        this.email = email;
    }
}