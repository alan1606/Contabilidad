
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
@WebServiceClient(name = "WorklistServiceImplService", targetNamespace = "http://servicio.sga.gm.com.mx/", wsdlLocation = "http://201.116.155.166:9999/WorklistServiceImplService/WorklistServiceImpl?wsdl")
public class WorklistServiceImplService
    extends Service
{

    private final static URL WORKLISTSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException WORKLISTSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName WORKLISTSERVICEIMPLSERVICE_QNAME = new QName("http://servicio.sga.gm.com.mx/", "WorklistServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://201.116.155.166:9999/WorklistServiceImplService/WorklistServiceImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WORKLISTSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        WORKLISTSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public WorklistServiceImplService() {
        super(__getWsdlLocation(), WORKLISTSERVICEIMPLSERVICE_QNAME);
    }

    public WorklistServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WORKLISTSERVICEIMPLSERVICE_QNAME, features);
    }

    public WorklistServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, WORKLISTSERVICEIMPLSERVICE_QNAME);
    }

    public WorklistServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WORKLISTSERVICEIMPLSERVICE_QNAME, features);
    }

    public WorklistServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WorklistServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WorklistServiceWs
     */
    @WebEndpoint(name = "WorklistServiceImplPort")
    public WorklistServiceWs getWorklistServiceImplPort() {
        return super.getPort(new QName("http://servicio.sga.gm.com.mx/", "WorklistServiceImplPort"), WorklistServiceWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WorklistServiceWs
     */
    @WebEndpoint(name = "WorklistServiceImplPort")
    public WorklistServiceWs getWorklistServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicio.sga.gm.com.mx/", "WorklistServiceImplPort"), WorklistServiceWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WORKLISTSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw WORKLISTSERVICEIMPLSERVICE_EXCEPTION;
        }
        return WORKLISTSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
