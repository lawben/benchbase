/*
 * Copyright 2020 by OLTPBenchmark Project
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
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.12.28 at 11:42:38 PM EST
//


package com.oltpbenchmark.api.templates;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for dialectType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="dialectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedure" type="{}procedureType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "templateType", propOrder = {
    "query", "types", "values"
})
public class TemplateType {

    @XmlAttribute(required = true)
    protected String name;

    @XmlElement(required = true)
    protected String query;

    //@XmlElement(required = true)
    protected TypesType types;

    //@XmlElement(required = true)
    protected List<ValuesType> values;

    /**
     * Gets the value of the query property.
     */
    public String getQuery() {
        return this.query;
    }


    /**
     * Gets the value of the types property.
     */
    public TypesType getTypes() {
        return this.types;
    }

    /**
     * Gets the value of the types property.
     *
     * Objects of the following type(s) are allowed in the list {@link ValuesType }
     */
    public List<ValuesType> getValues() {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        return this.values;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     */
    public String getName() {
        return name;
    }

}
