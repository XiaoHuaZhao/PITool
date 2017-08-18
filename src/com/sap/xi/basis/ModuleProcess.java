
package com.sap.xi.basis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModuleProcess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleProcess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessStep" type="{http://sap.com/xi/BASIS}ProcessStep" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ParameterGroup" type="{http://sap.com/xi/BASIS}ParameterGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleProcess", propOrder = {
    "processStep",
    "parameterGroup"
})
public class ModuleProcess {

    @XmlElement(name = "ProcessStep")
    protected List<ProcessStep> processStep;
    @XmlElement(name = "ParameterGroup")
    protected List<ParameterGroup> parameterGroup;

    /**
     * Gets the value of the processStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessStep }
     * 
     * 
     */
    public List<ProcessStep> getProcessStep() {
        if (processStep == null) {
            processStep = new ArrayList<ProcessStep>();
        }
        return this.processStep;
    }

    /**
     * Gets the value of the parameterGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterGroup }
     * 
     * 
     */
    public List<ParameterGroup> getParameterGroup() {
        if (parameterGroup == null) {
            parameterGroup = new ArrayList<ParameterGroup>();
        }
        return this.parameterGroup;
    }

}
