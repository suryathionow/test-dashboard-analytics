import common.BaseSetUp
import org.junit.Assert
import org.junit.Test

/**
 * Created by c07f2arudd6h on 3/29/16.
 */
class LoginTest extends BaseSetUp{

    @Test
    void loginTest(){
        assertTest()
        waitFor(5)
        loginValidationTest()
        waitFor(5)
        clickOnUrlTest()
        waitFor(5)
        loginPage.enabledRememberMeTest()
        waitFor(5)
        loginSuccessfullyTest()
        waitFor(5)
    }

    void assertTest(){
        log.info("Test 1 - Assert test to check all ui based on mock and userstory.")
        Assert.assertEquals("morph", loginPage.titleHeader.text())
        Assert.assertEquals("ADMIN LOGIN", loginPage.titleLoginSection.text())
        Assert.assertEquals("USERNAME", loginPage.usernameText.text())
//        Assert.assertEquals("Username or Email", loginPage.userNameTextField.text())
        Assert.assertEquals("PASSWORD", loginPage.passwordText.text())
//        Assert.assertEquals("Password", loginPage.passwordTextField.value())
        Assert.assertEquals("REMEMBER ME", loginPage.rememberMeBoxText.text())
        Assert.assertEquals("LOGIN", loginPage.loginButton.text())
        Assert.assertEquals("Forgot Password?", loginPage.forgotPasswordHyperlink.text())
        Assert.assertEquals("Don't have an account? Register Now", loginPage.registerTextInfo.text())
        Assert.assertEquals("Register Now", loginPage.registerHyperlink.text())
        waitFor(5)
    }

    void loginValidationTest(){
        log.info("Test 2 - Validation error for login.")
        loginPage.inputCredentials("", "")
        Assert.assertEquals("Please enter your username or email address", loginPage.errorUsername.text())
        Assert.assertEquals("Please enter a password", loginPage.errorPassword.text())
        waitFor(5)
        loginPage.inputCredentials("qaautomation","Welcome1234566778")
        Assert.assertEquals("The entered password is invalid", loginPage.errorPassword.text())
//        loginPage.inputCredentials("qaautomatedtcg","Welcome123")
//        Assert.assertEquals("Your username/email address is not registered", loginPage.errorUsername.text())
        waitFor(5)
    }

    void clickOnUrlTest() throws Exception{
        log.info("Test 3 - Test all url on the page.")
        loginPage.forgotPasswordHyperlink.click()
        waitFor(3)
        browser.driver.navigate().back()
        waitFor(3)
        loginPage.registerHyperlink.click()
        waitFor(3)
        browser.driver.navigate().back()
    }

    void loginSuccessfullyTest() throws Exception{
        log.info("Test 4 - Login using valid credentials.")
        loginPage.inputCredentials("qaautomation", "Welcome123")
        System.out.println("Print username that entered by user : " + loginPage.getUsername())
    }
}
