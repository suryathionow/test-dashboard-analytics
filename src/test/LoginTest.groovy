import common.BaseSetUp
import org.junit.Test

/**
 * Created by c07f2arudd6h on 3/29/16.
 */
class LoginTest extends BaseSetUp{

    @Test
    void loginSuccessfully(){
//        log.info("Test 1 - Login using valid credentials.")
//        loginPage.loginModule.logIn("labs", "Welcome123")
//        System.out.println("Print username that entered by user : " + loginPage.loginModule.getUsername())
        loginPage.loginModule.registerHyperlink.click()
        waitFor(3)
    }
}
