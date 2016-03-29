package page

import geb.Page
import module.*
import org.junit.Assert

/**
 * Created by c07nw91fg1hw on 3/29/16.
 */
class RegisterPage extends Page{
//    static url = {"http://54.225.139.186:8080/dashboard/resources/html/register.html"}

    static content = {
        pageTitle               {$('div.col-xs-12 > h4')}
        informationTxt          {$('div.col-xs-12 > p')}
        firstNameTxtField       {$('input[test-input="register_success, register_error, input_firstName_regis"]')}
        lastNameTxtField        {$('input[test-input="register_success, register_error, input_lastName_regis"]')}
        userNameTxtField        {$('input[test-event="input_username_regis, check_username_regis"]')}
        birthdayTxtField        {$('input[test-input="register_success, register_error, check_birthday_regis"]')}
        jobTitleTxtField        {$('input[test-input="register_success, register_error, input_jobTitle_regis"]')}
        emailTxtField           {$('input[test-input="register_success, register_error, input_emailAddress_regis"]')}
        mobilePhoneTxtField     {$('input[test-input="register_success, register_error, input_workPhone_regis"]')}
        homeAddressTxtField     {$('input[test-input="register_success, register_error, input_address_regis"]')}
        cityTxtField            {$('input[test-input="register_success, register_error, input_city_regis"]')}
        zipCodeTxtField         {$('input[test-input="register_success, register_error, input_zipCode_regis"]')}
        stateDropDown           {$('select[test-event="check_state_regis"]')}
        languageDropDown        {$('select[test-event="check_language_regis"]')}
        englishLanguage         {$('option[value="English (USA)"]')}
        passwordTxtField        {$('input[test-input="register_success, register_error, input_password_regis"]')}
        confirmPasswordTxtField {$('input[test-input="register_success, register_error, input_retypePass_regis"]')}
        subscriptionCheckbox    {$('input[test-event="check_checkbox_regis, click_checkbox_regis"]')}
        createAccountBtn        {$('button#createAccount')}
        loginModule             {module LoginModule}
    }

    void testInputValidCredential(){
        Assert.assertEquals("CREATE AN ACCOUNT",pageTitle.text())
        firstNameTxtField.value("Albert")
        sleep(2000)
        lastNameTxtField.value("Einstein")
        sleep(2000)
        userNameTxtField.value("Albert")
        sleep(2000)
//        birthdayTxtField.value("3/14/1879")
//        sleep(2000)
        jobTitleTxtField.value("Scientist")
        sleep(2000)
        emailTxtField.value('albert@emc2.com')
        sleep(2000)
        mobilePhoneTxtField.value("222-333-4567")
        sleep(2000)
        homeAddressTxtField.value("Street ABC 123")
        sleep(2000)
        cityTxtField.value("New York")
        sleep(2000)
        zipCodeTxtField.value("10002")
        sleep(2000)
        languageDropDown.click()
        sleep(2000)
        englishLanguage.click()
        sleep(2000)
        passwordTxtField.value("Welcome123")
        sleep(2000)
        confirmPasswordTxtField.value("Welcome123")
        sleep(2000)
        subscriptionCheckbox.click()
        sleep(2000)
        createAccountBtn.click()
        sleep(2000)
    }
}
