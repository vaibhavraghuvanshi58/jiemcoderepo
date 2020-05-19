package sanity;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class ReporterPlugin implements IReporter  {

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
			String outputDirectory) {
		XmlSuite suite = xmlSuites.get(0);
		List<XmlTest> tests= suite.getTests();
		for(XmlTest test : tests){
			System.out.println("  ---- >   " + test.getName());
			
		}
	}

}
