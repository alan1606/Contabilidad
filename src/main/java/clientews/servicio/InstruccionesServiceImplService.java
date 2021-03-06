
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
@WebServiceClient(name = "InstruccionesServiceImplService", targetNamespace = "http://servicio.sga.gm.com.mx/", wsdlLocation = "http://201.116.155.166:9999/InstruccionesServiceImplService/InstruccionesServiceImpl?wsdl")
public class InstruccionesServiceImplService
    extends Service
{

    private final static URL INSTRUCCIONESSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException INSTRUCCIONESSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName INSTRUCCIONESSERVICEIMPLSERVICE_QNAME = new QName("http://servicio.sga.gm.com.mx/", "InstruccionesServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://201.116.155.166:9999/InstruccionesServiceImplService/InstruccionesServiceImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INSTRUCCIONESSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        INSTRUCCIONESSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public InstruccionesServiceImplService() {
        super(__getWsdlLocation(), INSTRUCCIONESSERVICEIMPLSERVICE_QNAME);
    }

    public InstruccionesServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INSTRUCCIONESSERVICEIMPLSERVICE_QNAME, features);
    }

    public InstruccionesServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, INSTRUCCIONESSERVICEIMPLSERVICE_QNAME);
    }

    public InstruccionesServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INSTRUCCIONESSERVICEIMPLSERVICE_QNAME, features);
    }

    public InstruccionesServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InstruccionesServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InstruccionesServiceWs
     */
    @WebEndpoint(name = "InstruccionesServiceImplPort")
    public InstruccionesServiceWs getInstruccionesServiceImplPort() {
        return super.getPort(new QName("http://servicio.sga.gm.com.mx/", "InstruccionesServiceImplPort"), InstruccionesServiceWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InstruccionesServiceWs
     */
    @WebEndpoint(name = "InstruccionesServiceImplPort")
    public InstruccionesServiceWs getInstruccionesServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicio.sga.gm.com.mx/", "InstruccionesServiceImplPort"), InstruccionesServiceWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INSTRUCCIONESSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw INSTRUCCIONESSERVICEIMPLSERVICE_EXCEPTION;
        }
        return INSTRUCCIONESSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
