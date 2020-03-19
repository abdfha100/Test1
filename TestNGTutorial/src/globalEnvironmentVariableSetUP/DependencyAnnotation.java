package globalEnvironmentVariableSetUP;

import java.io.IOException;

import org.testng.annotations.Test;

public class DependencyAnnotation extends TestBase {
	@Test
	public void OpeningBrowser() throws IOException
	{
		Login();
		System.out.println("Executing from OpeningBrowser() ");
	}
}
