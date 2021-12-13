package eql.logicaldoc;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.support.SoapUIException;
import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class LogicaldocTest {
	
	Logger log = Logger.getLogger(LogicaldocTest.class.getName());
	
	// Implémentation "intermédiaire"
	// (https://richard-carree.developpez.com/tutoriels/junit-services-web-soapui/)
	
	@Test
    public void LogicalDocTest_Bookmarks()
            throws XmlException, IOException, SoapUIException {
		log.info("Running LOGICALDOC Bookmarks APIs tests");
        // Créer une nouvelle instance de WsdlProject en spécifiant le chemin absolu du projet SoapUI
        WsdlProject project = new WsdlProject(
                "src/test/resources/LOGICALDOC-BOOKMARKS-TEST-soapui-project.xml");
        // Récupère tous les TestSuites inclus dans le projet SoapUI
        List<TestSuite> testSuiteList = project.getTestSuiteList();
        // Itération sur tous les TestSuites du projet
        for (TestSuite ts : testSuiteList) {
            log.info("******Running " + ts.getName() + "***********");
            // Récupère tous les TestCases d'une TestSuite
            List<TestCase> testCaseList = ts.getTestCaseList();
            // Itération sur tous les TestCases d'un TestSuite particulier
            for (TestCase testcase : testCaseList) {
                log.info("******Running " + testcase.getName() + "***********");
                // Exécute le TestCase spécifié
                TestRunner testCaseRunner = testcase.run(new PropertiesMap(), false);
                // Vérifie si le TestCase s'est terminé correctement
                // ou s'il a échoué à cause d'un échec d'assertion
                assertEquals(TestRunner.Status.FINISHED, testCaseRunner.getStatus());
            }
        }
    }
	
	@Test
    public void LogicalDocTest_Docs_And_Search()
            throws XmlException, IOException, SoapUIException {
		log.info("Running LOGICALDOC Documents and Search APIs tests");
        // Créer une nouvelle instance de WsdlProject en spécifiant le chemin absolu du projet SoapUI
        WsdlProject project = new WsdlProject(
                "src/test/resources/UPDATED_JN_Logicaldoc-soapui-project.xml");
        // Récupère tous les TestSuites inclus dans le projet SoapUI
        List<TestSuite> testSuiteList = project.getTestSuiteList();
        // Itération sur tous les TestSuites du projet
        for (TestSuite ts : testSuiteList) {
            log.info("******Running " + ts.getName() + "***********");
            // Récupère tous les TestCases d'une TestSuite
            List<TestCase> testCaseList = ts.getTestCaseList();
            // Itération sur tous les TestCases d'un TestSuite particulier
            for (TestCase testcase : testCaseList) {
                log.info("******Running " + testcase.getName() + "***********");
                // Exécute le TestCase spécifié
                TestRunner testCaseRunner = testcase.run(new PropertiesMap(), false);
                // Vérifie si le TestCase s'est terminé correctement
                // ou s'il a échoué à cause d'un échec d'assertion
                assertEquals(TestRunner.Status.FINISHED, testCaseRunner.getStatus());
            }
        }
    }
	
	@Test
    public void LogicalDocTest_Folders()
            throws XmlException, IOException, SoapUIException {
		log.info("Running LOGICALDOC Folders APIs tests");
        // Créer une nouvelle instance de WsdlProject en spécifiant le chemin absolu du projet SoapUI
        WsdlProject project = new WsdlProject(
                "src/test/resources/KIM_Logicaldoc-soapui-project.xml");
        // Récupère tous les TestSuites inclus dans le projet SoapUI
        List<TestSuite> testSuiteList = project.getTestSuiteList();
        // Itération sur tous les TestSuites du projet
        for (TestSuite ts : testSuiteList) {
            log.info("******Running " + ts.getName() + "***********");
            // Récupère tous les TestCases d'une TestSuite
            List<TestCase> testCaseList = ts.getTestCaseList();
            // Itération sur tous les TestCases d'un TestSuite particulier
            for (TestCase testcase : testCaseList) {
                log.info("******Running " + testcase.getName() + "***********");
                // Exécute le TestCase spécifié
                TestRunner testCaseRunner = testcase.run(new PropertiesMap(), false);
                // Vérifie si le TestCase s'est terminé correctement
                // ou s'il a échoué à cause d'un échec d'assertion
                assertEquals(TestRunner.Status.FINISHED, testCaseRunner.getStatus());
            }
        }
    }
	
	
}