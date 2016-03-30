package page

import geb.Page
import junit.framework.Assert

/**
 * Created by c07f2arudd6h on 3/29/16.
 */
class HomePage extends Page{

    static content = {
        informationText         {$('div[class="header-top"]')}
//        carouselItem            {$('div[class="banner-pagination"]')} --> Need to be tested but right now the carousel item does not have functionality
        previousButton          {$('a[class="jcarousel-prev carousel"]')}
        nextButton              {$('a[class="jcarousel-next carousel"]')}
        thumbnailWebsite        {$('div[class="site-image-container"]')}
//        thumbnailImage          {$('div[id="setup-analytic"]')}
        setUpAnalyticButton     {$('div#setup-analytic')}
    }

//    void assertTest(){
//        Assert.assertEquals("HI Labs,\nWELCOME TO YOUR MORPH DASHBOARD.\nNow you can " +
//                "collect and consolidate the analytic tags from your website. Choose your " +
//                "desire website to be analyze", informationText.text())
//    } --> Ini bener

    void assertTest(){
        Assert.assertEquals("HI Labs,\nWELCOME TO YOUR MORPH DASHBOARD\nNow you can " +
                "collect and consolidate the analytic tags from your website. Choose your " +
                "desired website to be analyzed", informationText.text())
    }

    void listWebsiteTest(){
        if (thumbnailWebsite.size() < 3){
            Assert.assertEquals(false, previousButton.isDisplayed())
            Assert.assertEquals(false, nextButton.isDisplayed())
        }
        Assert.assertEquals(true, previousButton.isDisplayed())
        Assert.assertEquals(true, nextButton.isDisplayed())
        sleep(4000)
        previousButton.click()
        sleep(4000)
        nextButton.click()
        sleep(4000)
        nextButton.click()
    }

    void setupButtonTest(){
        int total = thumbnailWebsite.size()
        setUpAnalyticButton.eq(total-1).click()
        sleep(4000)
        browser.driver.navigate().back()
        sleep(4000)
        setUpAnalyticButton.eq(total-total).click()
    }
}
