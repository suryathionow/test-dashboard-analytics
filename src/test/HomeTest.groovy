import common.BaseSetUp
import org.junit.Test

/**
 * Created by c07f2arudd6h on 3/30/16.
 */
class HomeTest extends BaseSetUp{
    @Test
    void homePageTest(){
        loginPage.inputCredentials("qaautomation", "Welcome123")
        waitFor(3)
        homePage.assertTest()
        waitFor(3)
        homePage.listWebsiteTest()
        waitFor(3)
        homePage.setupButtonTest()
    }
}
