package module

import geb.Module
import junit.framework.Assert
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

/**
 * Created by c07f2arudd6h on 3/30/16.
 */
class Header extends Module{

    static content = {
//      ===================================================================== Header on home page
        morphLogoImage          {$('div[class="logo-morph"]')}
        homePagePageTitle       {$('div[class="dashboard-title"]')}
        imageProfile            {$('img[test-event="check_account_icon, click_account_icon"]')}
        dropdownButton          {$('div[class="header-name pull-left"]')}
        informativeTextDropdown {$('p[test-assert="click_account_icon"]').eq(0)}
        userNameDropdown        {$('p[test-assert="click_account_icon"]').eq(1)}
        emailDropdown           {$('p[test-assert="click_account_icon"]').eq(2)}
        imageProfileDropdown    {$('img[class="personal-img"]')}
        companyImageDropdown    {$('img[class="collapse-website-icon"]')}
        cityIconDropdown        {$('img[class="collapse-city-icon"]')}
        companyTextDropdown     {$('span[class="text-bold collapse-website"]')}
        cityTextDropdown        {$('span[class="text-bold collapse-city"]')}
        profileButton           {$('button#goProfile')}
        logoutButton            {$('button#signOut')}
//      ===================================================================== Add some element of Header on Setup Page
        notificationIcon            {$('div[class="notification-counter-container  col-sm-1"] > img')}
        menuWebsiteIcon             {$('div[class="menu-header pull-left"]')}
        websiteImage                {$('div[class="breadcrumbs-logo"]')}
        breadcrumbHeader            {$('ol > li')}
        notificationCounter         {$('div[class="notification-counter"]')}
        notificationTextDropdown    {$('div[class="qtip-content"] > div[class="notification-list"] > div[class!="no-notification hide"]')}
        noNotificationDropdown      {$('div[class="qtip-content"] > div[class="notification-list"] > div[class="no-notification hide"]')}
        notificationListDropdown    {$('div[class="qtip-content"] > div[class="notification-list"] > ul > li ')}
        selectWebsiteTextDropdown   {$('div[class="select-profile"] > div')}
        testt                       {$('div[class="menu-header pull-left"]')}
        listWebsiteDropdown         {$('div[class="select-profile"] > ul > li ')}
        imgWebsiteDropdown          {$('div[class="select-profile"] > ul > li > span > img')}
        titleWebsiteDropdown        {$('div[class="select-profile"] > ul > li > span > div').eq(0)}
        urlWebsiteDropdown          {$('div[class="select-profile"] > ul > li > span > div').eq(1)}
    }

    void assertHeader(){
        Assert.assertEquals(true, morphLogoImage.isDisplayed())
        Assert.assertEquals("Dashboad", homePagePageTitle.text())
        Assert.assertEquals(true, imageProfile.isDisplayed())
        Assert.assertEquals(true, dropdownButton.isDisplayed())
        dropdownButton.click()
        Assert.assertEquals("This account is managed by Morph Dashboard", informativeTextDropdown.text())
        Assert.assertEquals(true, userNameDropdown.isDisplayed())
        Assert.assertEquals(true, emailDropdown.isDisplayed())
        Assert.assertEquals(true, imageProfileDropdown.isDisplayed())
        Assert.assertEquals(true, companyImageDropdown.isDisplayed())
        Assert.assertEquals(true, cityIconDropdown.isDisplayed())
        Assert.assertEquals(true, companyTextDropdown.isDisplayed())
        Assert.assertEquals(true, cityTextDropdown.isDisplayed())
        Assert.assertEquals(true, profileButton.isDisplayed())
        Assert.assertEquals(true, logoutButton.isDisplayed())
    }

    void goToProfilePage(){
        dropdownButton.click()
        profileButton.click()
    }

    void logout(){
        dropdownButton.click()
        logoutButton.click()
    }

    void goToHomePage(){
        morphLogoImage.click()
    }

//    void changeProfileImage(){}

    void checkNotificationCounter(){
        notificationIcon.click()
//        System.out.println("Testing size of notificationCounter.size() = "+ browser.driver.findElement(By.cssSelector('div[class="notification-counter"]')).isDisplayed())
//        System.out.println("Testing size of notificationListDropdown.size() = "+ browser.driver.findElement(By.cssSelector('div[class="notification-list"] > ul > li ')).isDisplayed())
        if (!browser.driver.findElement(By.cssSelector('div[class="notification-counter"]')).isDisplayed() && !browser.driver.findElement(By.cssSelector('div[class="notification-list"] > ul > li ')).isDisplayed()){
            noNotificationDropdown.isDisplayed()
            Assert.assertEquals("You don’t have any notification",noNotificationDropdown.text())
        }else{
            int counter = notificationListDropdown.size()
            notificationIcon.click()
            for (int i = 0; i < counter; i++){
                notificationListDropdown.eq(i).click()
                sleep(10000)
                browser.driver.navigate().back()
            }
        }
    }

/*    void checkListWebsiteMenu(){
        WebDriverWait wait = new WebDriverWait(browser.driver, 5)
        int totalListWebsite = listWebsiteDropdown.size()
        if (totalListWebsite > 0){
            for (int i = 0; i < totalListWebsite; i++) {
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector('div[class="select-profile"] > ul > li ')))
                listWebsiteDropdown.eq(i).click()
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector('div[class="menu-header pull-left"]')))
                browser.driver.findElement(By.cssSelector('div[class="menu-header pull-left"]')).click()
            }
            goToHomePage()
        }else{
            goToHomePage()
        }
    }*/
}