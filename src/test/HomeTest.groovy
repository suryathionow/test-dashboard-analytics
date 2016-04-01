import common.BaseSetUp
import org.junit.Test

/**
 * Created by c07f2arudd6h on 3/30/16.
 */
class HomeTest extends BaseSetUp{
    @Test
    void homePageTest(){
        loginPage.inputCredentials("qaautomation", "Welcome123")
        waitFor(5)
        homePage.assertTest()
        waitFor(5)
        homePage.listWebsiteTest()
        waitFor(5)
        homePage.setupButtonTest()
        waitFor(5)
        homePage.footerModule.assertFooterTest()
//        waitFor(3)
//        homePage.footerModule.hyperlinkTest()
    }

    @Test
    void headerTest(){
        loginPage.inputCredentials("qaautomation", "Welcome123")
        waitFor(5)
        homePage.setUpAnalyticButton.eq(0).click()
        waitFor(10)
//        homePage.headerModule.notificationIcon.click()
        homePage.headerModule.checkNotificationCounter()

    }
}
