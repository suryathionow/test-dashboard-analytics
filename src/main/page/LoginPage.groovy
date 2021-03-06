package page;
import geb.Page
import groovy.util.logging.Slf4j
import org.junit.Assert

import javax.lang.model.element.Element

/**
 * Created by c07nw91fg1hw on 3/28/16.
 */
public class LoginPage extends Page{
//   static url = {"https://github.com"}

    protected String username;

    static content = {
        titleHeader             {$('div[class="login-header"]')}
        titleLoginSection       {$('div[class="text-bold login-text"]')}
        usernameText            {$('div[class="col-xs-12 input-username-containt"]')}
        userNameTextField       {$('input#username')}
        passwordText            {$('div[class="col-xs-12 input-password-containt"]')}
        passwordTextField       {$('input#password')}
        rememberMeBox           {$('input#remember-me')}
        rememberMeBoxText       {$('label[for="remeber-me"]')}
        loginButton             {$('button#login-submit')}
        forgotPasswordHyperlink {$('a#forgot_password')}
        registerTextInfo        {$('div[class="col-xs-12 col-sm-12 col-md-12 register-email-containt"]')}
        registerHyperlink       {$('a#register_email')}
        errorUsername           {$('p[class="error-msg"]').eq(0)}
        errorPassword           {$('p[class="error-msg"]').eq(1)}
    }

    public void inputCredentials(String usernm, String pass){
        waitFor{userNameTextField.isDisplayed()}
        userNameTextField.value(usernm)
        passwordTextField.value(pass)
        username = usernm
        System.out.println("usernmae uynag : "+username)
        loginButton.click()
    }

    public String getUsername(){
        return username
    }

    public void enabledRememberMeTest(){
        if (rememberMeBox.isDisabled()){
            rememberMeBox.click()
        }
        sleep(5000)
        rememberMeBox.click()
    }
}
