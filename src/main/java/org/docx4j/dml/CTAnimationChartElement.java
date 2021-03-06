/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_AnimationChartElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_AnimationChartElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="seriesIdx" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *       &lt;attribute name="categoryIdx" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *       &lt;attribute name="bldStep" use="required" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_ChartBuildStep" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_AnimationChartElement")
public class CTAnimationChartElement {

    @XmlAttribute
    protected Integer seriesIdx;
    @XmlAttribute
    protected Integer categoryIdx;
    @XmlAttribute(required = true)
    protected STChartBuildStep bldStep;

    /**
     * Gets the value of the seriesIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSeriesIdx() {
        if (seriesIdx == null) {
            return -1;
        } else {
            return seriesIdx;
        }
    }

    /**
     * Sets the value of the seriesIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeriesIdx(Integer value) {
        this.seriesIdx = value;
    }

    /**
     * Gets the value of the categoryIdx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCategoryIdx() {
        if (categoryIdx == null) {
            return -1;
        } else {
            return categoryIdx;
        }
    }

    /**
     * Sets the value of the categoryIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryIdx(Integer value) {
        this.categoryIdx = value;
    }

    /**
     * Gets the value of the bldStep property.
     * 
     * @return
     *     possible object is
     *     {@link STChartBuildStep }
     *     
     */
    public STChartBuildStep getBldStep() {
        return bldStep;
    }

    /**
     * Sets the value of the bldStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link STChartBuildStep }
     *     
     */
    public void setBldStep(STChartBuildStep value) {
        this.bldStep = value;
    }

}
