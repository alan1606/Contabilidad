
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
@WebServiceClient(name = "CatalogoFormaPagoServiceImplService", targetNamespace = "http://servicio.sga.gm.com.mx/", wsdlLocation = "http://201.116.155.166:9999/CatalogoFormaPagoServiceImplService/CatalogoFormaPagoServiceImpl?wsdl")
public class CatalogoFormaPagoServiceImplService
    extends Service
{

    private final static URL CATALOGOFORMAPAGOSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CATALOGOFORMAPAGOSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CATALOGOFORMAPAGOSERVICEIMPLSERVICE_QNAME = new QName("http://servicio.sga.gm.com.mx/", "CatalogoFormaPagoServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://201.116.155.166:9999/CatalogoFormaPagoServiceImplService/CatalogoFormaPagoServiceImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CATALOGOFORMAPAGOSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CATALOGOFORMAPAGOSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public CatalogoFormaPagoServiceImplService() {
        super(__getWsdlLocation(), CATALOGOFORMAPAGOSERVICEIMPLSERVICE_QNAME);
    }

    public CatalogoFormaPagoServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CATALOGOFORMAPAGOSERVICEIMPLSERVICE_QNAME, features);
    }

    public CatalogoFormaPagoServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CATALOGOFORMAPAGOSERVICEIMPLSERVICE_QNAME);
    }

    public CatalogoFormaPagoServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CATALOGOFORMAPAGOSERVICEIMPLSERVICE_QNAME, features);
    }

    public CatalogoFormaPagoServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CatalogoFormaPagoServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CatalogoFormaPagoServiceWs
     */
    @WebEndpoint(name = "CatalogoFormaPagoServiceImplPort")
    public CatalogoFormaPagoServiceWs getCatalogoFormaPagoServiceImplPort() {
        return super.getPort(new QName("http://servicio.sga.gm.com.mx/", "CatalogoFormaPagoServiceImplPort"), CatalogoFormaPagoServiceWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CatalogoFormaPagoServiceWs
     */
    @WebEndpoint(name = "CatalogoFormaPagoServiceImplPort")
    public CatalogoFormaPagoServiceWs getCatalogoFormaPagoServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicio.sga.gm.com.mx/", "CatalogoFormaPagoServiceImplPort"), CatalogoFormaPagoServiceWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CATALOGOFORMAPAGOSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CATALOGOFORMAPAGOSERVICEIMPLSERVICE_EXCEPTION;
        }
        return CATALOGOFORMAPAGOSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
