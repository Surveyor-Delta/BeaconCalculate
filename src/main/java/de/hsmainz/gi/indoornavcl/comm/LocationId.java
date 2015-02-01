
package de.hsmainz.gi.indoornavcl.comm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für locationId complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="locationId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beaconId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class LocationId {

    protected int beaconId;
    protected int site;

    /**
     * Ruft den Wert der beaconId-Eigenschaft ab.
     * 
     */
    public int getBeaconId() {
        return beaconId;
    }

    /**
     * Legt den Wert der beaconId-Eigenschaft fest.
     * 
     */
    public void setBeaconId(int value) {
        this.beaconId = value;
    }

    /**
     * Ruft den Wert der site-Eigenschaft ab.
     * 
     */
    public int getSite() {
        return site;
    }

    /**
     * Legt den Wert der site-Eigenschaft fest.
     * 
     */
    public void setSite(int value) {
        this.site = value;
    }

}
