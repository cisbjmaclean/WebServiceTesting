/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testws2client;

import info.hccis.bjmac.TestWebService;
import info.hccis.bjmac.TestWebService_Service;

/**
 *
 * @author bjmaclean
 */
public class TestWS2Client {

    public static void main(String[] args) {
       //call the web service
        
        System.out.println(hello("test149"));
    }

    private static String hello(java.lang.String name) {
        TestWebService_Service service = new TestWebService_Service();
        TestWebService testWebService = service.getTestWebServicePort();
        return testWebService.hello(name);
    }
    
    
}
