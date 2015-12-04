package my.company.tests;

import my.company.steps.WebDriverSteps;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 28.10.13
 */
public class SearchTest {

    private WebDriverSteps steps;

    @Before
    public void setUp() throws Exception {
    	System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
    	steps = new WebDriverSteps(
                new ChromeDriver(new DesiredCapabilities())
        );
    }

    @Test
    public void searchTest() throws Exception {
        steps.openMainPage();
        steps.search("allure framework");
        steps.makeScreenshot();
        steps.quit();
    }

}

