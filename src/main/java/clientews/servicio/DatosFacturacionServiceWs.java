
package clientews.servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
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
@WebService(name = "DatosFacturacionServiceWs", targetNamespace = "http://servicio.sga.gm.com.mx/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DatosFacturacionServiceWs {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "registrarDatosFacturacion", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.RegistrarDatosFacturacion")
    @ResponseWrapper(localName = "registrarDatosFacturacionResponse", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.RegistrarDatosFacturacionResponse")
    @Action(input = "http://servicio.sga.gm.com.mx/DatosFacturacionServiceWs/registrarDatosFacturacionRequest", output = "http://servicio.sga.gm.com.mx/DatosFacturacionServiceWs/registrarDatosFacturacionResponse")
    public void registrarDatosFacturacion(
        @WebParam(name = "arg0", targetNamespace = "")
        DatosFacturacion arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "modificarDatosFacturacion", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.ModificarDatosFacturacion")
    @ResponseWrapper(localName = "modificarDatosFacturacionResponse", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.ModificarDatosFacturacionResponse")
    @Action(input = "http://servicio.sga.gm.com.mx/DatosFacturacionServiceWs/modificarDatosFacturacionRequest", output = "http://servicio.sga.gm.com.mx/DatosFacturacionServiceWs/modificarDatosFacturacionResponse")
    public void modificarDatosFacturacion(
        @WebParam(name = "arg0", targetNamespace = "")
        DatosFacturacion arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<clientews.servicio.DatosFacturacion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerDatosFacturacionPorIdOrdenVenta", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.ObtenerDatosFacturacionPorIdOrdenVenta")
    @ResponseWrapper(localName = "obtenerDatosFacturacionPorIdOrdenVentaResponse", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.ObtenerDatosFacturacionPorIdOrdenVentaResponse")
    @Action(input = "http://servicio.sga.gm.com.mx/DatosFacturacionServiceWs/obtenerDatosFacturacionPorIdOrdenVentaRequest", output = "http://servicio.sga.gm.com.mx/DatosFacturacionServiceWs/obtenerDatosFacturacionPorIdOrdenVentaResponse")
    public List<DatosFacturacion> obtenerDatosFacturacionPorIdOrdenVenta(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns clientews.servicio.DatosFacturacion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerDatosFacturacionPorPagoOrdenVenta", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.ObtenerDatosFacturacionPorPagoOrdenVenta")
    @ResponseWrapper(localName = "obtenerDatosFacturacionPorPagoOrdenVentaResponse", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.ObtenerDatosFacturacionPorPagoOrdenVentaResponse")
    @Action(input = "http://servicio.sga.gm.com.mx/DatosFacturacionServiceWs/obtenerDatosFacturacionPorPagoOrdenVentaRequest", output = "http://servicio.sga.gm.com.mx/DatosFacturacionServiceWs/obtenerDatosFacturacionPorPagoOrdenVentaResponse")
    public DatosFacturacion obtenerDatosFacturacionPorPagoOrdenVenta(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns clientews.servicio.DatosFacturacion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerDatosFacturacionPorId", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.ObtenerDatosFacturacionPorId")
    @ResponseWrapper(localName = "obtenerDatosFacturacionPorIdResponse", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.ObtenerDatosFacturacionPorIdResponse")
    @Action(input = "http://servicio.sga.gm.com.mx/DatosFacturacionServiceWs/obtenerDatosFacturacionPorIdRequest", output = "http://servicio.sga.gm.com.mx/DatosFacturacionServiceWs/obtenerDatosFacturacionPorIdResponse")
    public DatosFacturacion obtenerDatosFacturacionPorId(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

}
