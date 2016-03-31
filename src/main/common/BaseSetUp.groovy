package common
import geb.Browser
import org.junit.After
import org.junit.Before
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import page.HomePage
import page.LoginPage
import page.RegisterPage
import page.SegmentationListPage
import page.SetupAnalyticPage

/**
 * Created by c07nw91fg1hw on 3/28/16.
 */
class BaseSetUp {
    def browser = new Browser(driver: new FirefoxDriver())
    protected final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(this.getClass());
    protected def LoginPage loginPage = new LoginPage()
    protected def RegisterPage registerPage = new RegisterPage()
    protected def HomePage homePage = new HomePage()
    protected def SetupAnalyticPage setupAnalyticPage = new SetupAnalyticPage()
    protected def SegmentationListPage segmentationListPage = new SegmentationListPage()

    @Before
    void openURL() {
        browser.clearCookies()
        browser.go("http://labs:Welcome123@54.225.139.186:8080/dashboard/resources/html/index.html")
//        browser.driver.manage().window().maximize()
        loginPage = browser.page(LoginPage)
        registerPage = browser.page(RegisterPage)
        setupAnalyticPage = browser.page(SetupAnalyticPage)
        homePage = browser.page(HomePage)
        segmentationListPage = browser.page(SegmentationListPage)
    }

    @After
    void closeBrowser(){
        waitFor(5)
        browser.close()
    }

    public void waitFor(long timeout){
        long multipliedTimedOut = timeout*1000;
        try {
            Thread.sleep(multipliedTimedOut);
        } catch (InterruptedException e) {
            log.error("Time out limit exceeded.");
            e.printStackTrace();
        }
    }
}