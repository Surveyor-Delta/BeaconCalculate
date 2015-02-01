
package de.hsmainz.gi.indoornavcl.comm;

import com.vividsolutions.jts.geom.Point;


/**
 * <p>Java-Klasse für location complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="location">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beacon" type="{http://services.indoornavsrv.gi.hsmainz.de/}beacon" minOccurs="0"/>
 *         &lt;element name="coord" type="{http://services.indoornavsrv.gi.hsmainz.de/}point" minOccurs="0"/>
 *         &lt;element name="id" type="{http://services.indoornavsrv.gi.hsmainz.de/}locationId" minOccurs="0"/>
 *         &lt;element name="site" type="{http://services.indoornavsrv.gi.hsmainz.de/}site" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class Location {

    protected Beacon beacon;
    protected Point coord;
    protected LocationId id;
    protected Site site;

    /**
     * Ruft den Wert der beacon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Beacon }
     *     
     */
    public Beacon getBeacon() {
        return beacon;
    }

    /**
     * Legt den Wert der beacon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Beacon }
     *     
     */
    public void setBeacon(Beacon value) {
        this.beacon = value;
    }

    /**
     * Ruft den Wert der coord-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getCoord() {
        return coord;
    }

    /**
     * Legt den Wert der coord-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setCoord(Point value) {
        this.coord = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationId }
     *     
     */
    public LocationId getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationId }
     *     
     */
    public void setId(LocationId value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der site-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getSite() {
        return site;
    }

    /**
     * Legt den Wert der site-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setSite(Site value) {
        this.site = value;
    }

}
