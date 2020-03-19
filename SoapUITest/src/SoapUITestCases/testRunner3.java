package SoapUITestCases;

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

public class testRunner3 {
	
	@Test
	public static void testRunner() throws XmlException, IOException, SoapUIException
	{
		WsdlProject project = new WsdlProject("F:\\UdemySOAP_UI\\SOAPUI_Projects\\EndToEndAutmattionEmployeeManagementService-soapui-project.xml");
		WsdlTestSuite TestSuite= project.getTestSuiteByName("TestSuite1");
		
		for(int i=0; i<TestSuite.getTestCaseCount(); i++)
		{
			WsdlTestCase testCase = TestSuite.getTestCaseByName("EndToEndAutomation");
			TestRunner runner = testCase.run(new PropertiesMap(), false);
			Assert.assertEquals(Status.FINISHED, runner);
		}
	}
}
