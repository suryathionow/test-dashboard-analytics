package module

import geb.Module

/**
 * Created by c07f2arudd6h on 3/29/16.
 */
class LoginModule extends Module{

    protected String username;

    static content = {
        titleHeader             {$('div[class="login-header"]')}
        usernameText            {$('div[class="text-bold login-text"]')}
        userNameTextField       {$('#username')}
        passwordText            {$('div[class="col-xs-12 input-password-containt"]')}
        passwordTextField       {$('#password')}
        rememberMeBox           {$('input#remember-me')}
        rememberMeBoxText       {$('label[for="remeber-me"]')}
        loginButton             {$('#login-submit')}
        forgotPasswordHyperlink {$('a#forgot_password')}
        registerTextInfo        {$('div[class="col-xs-12 col-sm-12 col-md-12 register-email-containt"]')}
        registerHyperlink       {$('a#register_email')}
    }

    void logIn(String usernm, String pass){
        userNameTextField.value(usernm)
        passwordTextField.value(pass)
        this.username = usernm
        System.out.println("usernmae uynag : "+username)
        loginButton.click()
    }

    String getUsername(){
        return username
    }
}
