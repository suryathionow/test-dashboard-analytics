import common.BaseSetUp
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by c07nw91fg1hw on 3/28/16.
 */
class RegisterTest extends BaseSetUp {
    @Test
    void register() throws Exception{
        loginPage.registerHyperlink.click()
        waitFor(3)
        registerPage.testInputValidCredential()
    }
}