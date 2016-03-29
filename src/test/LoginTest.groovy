import common.BaseSetUp
import org.junit.Assert
import org.junit.Test

/**
 * Created by c07f2arudd6h on 3/29/16.
 */
class LoginTest extends BaseSetUp{

    @Test
    void loginSuccessfully(){
        log.info("Test 1 - Login using valid credentials.")
        loginPage.loginModule.logIn("labs", "Welcome123")
        System.out.println("Print username that entered by user : " + loginPage.loginModule.getUsername())
        loginPage.loginModule.registerHyperlink.click()
        waitFor(3)
    }

    @Test
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
    }

    @Test
    void loginSuccessfullyTest(){
        log.info("Test 2 - Login using valid credentials.")
        loginPage.inputCredentials("qaautomation", "Welcome123")
        System.out.println("Print username that entered by user : " + loginPage.getUsername())
        waitFor(5)
    }

    @Test
    void loginValidationTest(){
        log.info("Test 3 - Validation error for login.")
        loginPage.inputCredentials("", "")
        Assert.assertEquals("Please enter your username or email address", loginPage.errorUsername.text())
        Assert.assertEquals("Please enter a password", loginPage.errorPassword.text())
        loginPage.inputCredentials("qaautomation","Welcome1234566778")
        Assert.assertEquals("The entered password is invalid", loginPage.errorPassword.text())
//        loginPage.inputCredentials("qaautomatedtcg","Welcome123")
//        Assert.assertEquals("Your username/email address is not registered", loginPage.errorUsername.text())
        waitFor(5)
    }
}
