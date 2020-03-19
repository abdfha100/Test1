package RESTAPITestCases;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.iface.Submit.Status;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;

public class RestAPITest {
	@Test
	public static void testRunner() throws XmlException, IOException, SoapUIException{	
	//WSDL project object
	WsdlProject project = new WsdlProject("F:\\UdemySOAP_UI\\RestProjects\\LibraryAPI-soapui-project.xml");
	//Grab the TestSuite in the project
	WsdlTestSuite testSuite = project.getTestSuiteByName("AutomationTestSuite1");
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
