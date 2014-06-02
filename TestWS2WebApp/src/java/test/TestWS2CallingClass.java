package test;

import web.services.StudentInformation;
import web.services.StudentInformation_Service;

public class TestWS2CallingClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //call the web service
        
        System.out.println(get("test1027"));
    }

    public static String get(java.lang.String studentId) {
        StudentInformation_Service service = new StudentInformation_Service();
        StudentInformation testWebService = service.getStudentInformationPort();
        return testWebService.get(studentId);
    }

    
    
    
}
