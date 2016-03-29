package common
import geb.Browser
import org.junit.After
import org.junit.Before
import org.openqa.selenium.firefox.FirefoxDriver
import page.LoginPage

/**
 * Created by c07nw91fg1hw on 3/28/16.
 */
class BaseSetUp {
    def browser = new Browser(driver: new FirefoxDriver())
    protected final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(this.getClass());
    protected LoginPage loginPage = new LoginPage()

    @Before
    void openURL() {
        browser.go("http://labs:Welcome123@54.225.139.186:8080/dashboard/resources/html/index.html")
        loginPage = browser.page(LoginPage)
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