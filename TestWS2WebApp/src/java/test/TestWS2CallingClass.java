package test;


import info.hccis.bjmac.TestWebService;
import info.hccis.bjmac.TestWebService_Service;

public class TestWS2CallingClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //call the web service
        
        System.out.println(hello("test225"));
    }

    public static String hello(java.lang.String name) {
        TestWebService_Service service = new TestWebService_Service();
        TestWebService testWebService = service.getTestWebServicePort();
        return testWebService.hello(name);
    }

    
}
