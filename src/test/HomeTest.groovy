import common.BaseSetUp
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

/**
 * Created by c07f2arudd6h on 3/30/16.
 */
class HomeTest extends BaseSetUp {

    WebDriverWait wait = new WebDriverWait(browser.driver, 5)

    @Test
    void homePageTest() {
        loginPage.inputCredentials("qaautomation", "Welcome123")
        waitFor(5)
        homePage.assertTest()
        waitFor(5)
        homePage.listWebsiteTest()
        waitFor(5)
        homePage.setupButtonTest()
        waitFor(5)
        homePage.footerModule.assertFooterTest()
    }

    @Test
    void listWebsiteProfileTest() {
        log.info("Test list website menu available on header")
        log.info("Step 1: Login to the app")
        loginPage.inputCredentials("qaautomation", "Welcome123")
        log.info("Step 2: Click on Setup Analytic button")
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector('div#setup-analytic')))
        homePage.setUpAnalyticButton.eq(0).click()
        log.info("Step 3: Click on list website profile button")
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector('div[class="menu-header pull-left"]')))
        homePage.headerModule.menuWebsiteIcon.click()
        log.info("Step 4: Click on each option displayed on the list website")
        int totalListWebsite = homePage.headerModule.listWebsiteDropdown.size()
        if (totalListWebsite > 0){
            for (int i = 0; i < totalListWebsite; i++) {
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector('div[class="select-profile"] > ul > li ')))
                homePage.headerModule.listWebsiteDropdown.eq(i).click()
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector('div[class="menu-header pull-left"]')))
                browser.driver.findElement(By.cssSelector('div[class="menu-header pull-left"]')).click()
            }
            log.info("Step 5: Click on morph logo icon on header after successfully running the test")
            homePage.headerModule.goToHomePage()
        }else{
            log.info("Step 5: Click on morph logo icon on header after successfully running the test")
            homePage.headerModule.goToHomePage()
        }
    }

    @Test
    void listNotificationTest(){
        log.info("Test notification on the header")
        log.info("Step 1: Login to the app")
        loginPage.inputCredentials("qaautomation", "Welcome123")
        log.info("Step 2: Click on Setup Analytic button")
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector('div#setup-analytic')))
        homePage.setUpAnalyticButton.eq(0).click()
        log.info("Step 3: Check the notification counter")
    }
}