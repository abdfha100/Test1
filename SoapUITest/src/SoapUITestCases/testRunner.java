package SoapUITestCases;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.iface.Submit.Status;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;
import junit.framework.Assert;


public class testRunner {
	public static void main(String[] args) throws XmlException, IOException, SoapUIException {
		//WSDL project object
		WsdlProject project = new WsdlProject("F:\\UdemySOAP_UI\\REST_API\\Projects\\Employee.xml");
		//Grab the TestSuite in the project
		WsdlTestSuite testSuite = project.getTestSuiteByName("Testing");
		//Grab the TestCases in the testSuite
		for(int i=0; i< testSuite.getTestCaseCount(); i++ )
		{
		WsdlTestCase testCase = testSuite.getTestCaseAt(i);
		//Run the TestCase
		TestRunner runner =  testCase.run(new PropertiesMap(), false);
		Assert.assertEquals(Status.FINISHED, runner.getStatus());
		
		}
	}

}
