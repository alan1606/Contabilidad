
package clientews.servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ConsentimientoConceptoServiceWs", targetNamespace = "http://servicio.sga.gm.com.mx/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConsentimientoConceptoServiceWs {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "eliminarConsentimientoConcepto", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.EliminarConsentimientoConcepto")
    @ResponseWrapper(localName = "eliminarConsentimientoConceptoResponse", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.EliminarConsentimientoConceptoResponse")
    @Action(input = "http://servicio.sga.gm.com.mx/ConsentimientoConceptoServiceWs/eliminarConsentimientoConceptoRequest", output = "http://servicio.sga.gm.com.mx/ConsentimientoConceptoServiceWs/eliminarConsentimientoConceptoResponse")
    public void eliminarConsentimientoConcepto(
        @WebParam(name = "arg0", targetNamespace = "")
        ConsentimientoConcepto arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "registrarConsentimientoConcepto", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.RegistrarConsentimientoConcepto")
    @ResponseWrapper(localName = "registrarConsentimientoConceptoResponse", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.RegistrarConsentimientoConceptoResponse")
    @Action(input = "http://servicio.sga.gm.com.mx/ConsentimientoConceptoServiceWs/registrarConsentimientoConceptoRequest", output = "http://servicio.sga.gm.com.mx/ConsentimientoConceptoServiceWs/registrarConsentimientoConceptoResponse")
    public void registrarConsentimientoConcepto(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Long arg1);

}
