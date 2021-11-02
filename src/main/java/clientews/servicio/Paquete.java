
package clientews.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para paquete complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paquete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idConcepto" type="{http://servicio.sga.gm.com.mx/}paquete" minOccurs="0"/>
 *         &lt;element name="porcentajeDescuento" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="precioSinDescuento" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paquete", propOrder = {
    "fechaFin",
    "fechaInicio",
    "id",
    "idConcepto",
    "porcentajeDescuento",
    "precio",
    "precioSinDescuento"
})
public class Paquete {

    protected int fechaFin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicio;
    protected Long id;
    protected Paquete idConcepto;
    protected short porcentajeDescuento;
    protected double precio;
    protected double precioSinDescuento;

    /**
     * Obtiene el valor de la propiedad fechaFin.
     * 
     */
    public int getFechaFin() {
        return fechaFin;
    }

    /**
     * Define el valor de la propiedad fechaFin.
     * 
     */
    public void setFechaFin(int value) {
        this.fechaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicio(XMLGregorianCalendar value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idConcepto.
     * 
     * @return
     *     possible object is
     *     {@link Paquete }
     *     
     */
    public Paquete getIdConcepto() {
        return idConcepto;
    }

    /**
     * Define el valor de la propiedad idConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link Paquete }
     *     
     */
    public void setIdConcepto(Paquete value) {
        this.idConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeDescuento.
     * 
     */
    public short getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    /**
     * Define el valor de la propiedad porcentajeDescuento.
     * 
     */
    public void setPorcentajeDescuento(short value) {
        this.porcentajeDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad precioSinDescuento.
     * 
     */
    public double getPrecioSinDescuento() {
        return precioSinDescuento;
    }

    /**
     * Define el valor de la propiedad precioSinDescuento.
     * 
     */
    public void setPrecioSinDescuento(double value) {
        this.precioSinDescuento = value;
    }

}
