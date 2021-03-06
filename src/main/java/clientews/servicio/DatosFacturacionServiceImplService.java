
package clientews.servicio;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DatosFacturacionServiceImplService", targetNamespace = "http://servicio.sga.gm.com.mx/", wsdlLocation = "http://201.116.155.166:9999/DatosFacturacionServiceImplService/DatosFacturacionServiceImpl?wsdl")
public class DatosFacturacionServiceImplService
    extends Service
{

    private final static URL DATOSFACTURACIONSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException DATOSFACTURACIONSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName DATOSFACTURACIONSERVICEIMPLSERVICE_QNAME = new QName("http://servicio.sga.gm.com.mx/", "DatosFacturacionServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://201.116.155.166:9999/DatosFacturacionServiceImplService/DatosFacturacionServiceImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DATOSFACTURACIONSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        DATOSFACTURACIONSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public DatosFacturacionServiceImplService() {
        super(__getWsdlLocation(), DATOSFACTURACIONSERVICEIMPLSERVICE_QNAME);
    }

    public DatosFacturacionServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DATOSFACTURACIONSERVICEIMPLSERVICE_QNAME, features);
    }

    public DatosFacturacionServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, DATOSFACTURACIONSERVICEIMPLSERVICE_QNAME);
    }

    public DatosFacturacionServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DATOSFACTURACIONSERVICEIMPLSERVICE_QNAME, features);
    }

    public DatosFacturacionServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DatosFacturacionServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DatosFacturacionServiceWs
     */
    @WebEndpoint(name = "DatosFacturacionServiceImplPort")
    public DatosFacturacionServiceWs getDatosFacturacionServiceImplPort() {
        return super.getPort(new QName("http://servicio.sga.gm.com.mx/", "DatosFacturacionServiceImplPort"), DatosFacturacionServiceWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DatosFacturacionServiceWs
     */
    @WebEndpoint(name = "DatosFacturacionServiceImplPort")
    public DatosFacturacionServiceWs getDatosFacturacionServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicio.sga.gm.com.mx/", "DatosFacturacionServiceImplPort"), DatosFacturacionServiceWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DATOSFACTURACIONSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw DATOSFACTURACIONSERVICEIMPLSERVICE_EXCEPTION;
        }
        return DATOSFACTURACIONSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
