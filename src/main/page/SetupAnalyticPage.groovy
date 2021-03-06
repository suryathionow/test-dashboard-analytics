package page
import geb.Page
import org.junit.Assert
import org.openqa.selenium.By


/**
 * Created by c07nw91fg1hw on 3/29/16.
 */
class SetupAnalyticPage extends Page {
    static content = {
        setUpAnalyticBtn { $('div#setup-analytic').eq(0) }
        wonderDrugTxt { $('div.setup-setting-button').eq(0) }
        dashboardTitle { $('div.dashboard-title') }
        //===============================================================================
        morphLogo { $('div.logo-morph') }
        analysisSetupTitleTxt { $('li.active > a') }
        notificationBtn { $('div.notification-counter-container.col-sm-1 > img') }
        selectProfileBtn { $('div.menu-header.pull-left > img') }
        profileDropDown { $('span.glyphicon.glyphicon-menu-down') }
        //=============== Use this Element below after click profileDropDown ============
        profileBtn { $('button#goProfile.btn.btn-default.btn-md.go-profile') }
        signOutBtn { $('button#signOut.btn.btn-default.go-signout') }
        //===============================================================================
        createHypothesisTab { $('a', text: 'Create Hypothesis') }
        //=============== Use this Element below after click createHypothesis ===========
        hypothesisTitleTxtFld { $('input#name.form-control') }
        dateRangeTxtFldClick { $('input#start-date') }
        dateRangeSelectFirstDay { $('div.pmu-button').eq(30) }
        dateRangeSelectLastDay { $('div.pmu-button').eq(53) }

        audienceAnalysisSelector { $('div.setup-segmentation-category.check').eq(0) }
//        eventPageTrackingSelector { $('div.setup-segmentation-category.check').eq(1) }
        eventPageTrackingSelector{$('div#event_page_analysis')}
        multiVarianceTestingSelector { $('div.setup-segmentation-category.check').eq(2) }
        abTestingSelector { $('div.setup-segmentation-category.check').eq(3) }
        continueBtn { $('input#next-analytic-setup') }
        //===============================================================================
        myHypothesisTab { $('a', text: 'My Hypothesis') }
        //=============== Use this Element below after click myHypothesisTab ============
        hypothesisTitleTxtField { $('input#search-name') }
        dateRange { $('input#date-range-field') }
        clearDateBtn { $('p.clear-date') }
        filterAllCheckbox { $('input[value="select_all"]') }
        filterAudienceAnalysis { $('input[value="audience_analysis"]') }
        filterEventPageTracking { $('input[value="event_page_analysis"]') }
        filterMultiVarianceTest { $('input[value="multi_variance_testing"]') }
        filterABTesting { $('input[value="a_b_testing"]') }

        automationAudience { $('div[data-name="AutomationAudience"]') }
        automationAudienceXBtn { $('span.x-button').eq(0) }
        autoEventPageTrackingXBtn { $('span.x-button').eq(3) }

        yesBtnPopUp { $('button#left-btn-popup') }
        noBtnPopUp { $('button#right-btn-popup') }
    }

    public void inputTitleAndDate() {
        dateRangeTxtFldClick.click()
        sleep(2000)
        dateRangeSelectFirstDay.click()
        sleep(2000)
        dateRangeSelectLastDay.click()
        sleep(2000)
        hypothesisTitleTxtFld.click()
        sleep(2000)
    }

    public void createHypothesisAudienceAnalysis() {
        hypothesisTitleTxtFld.value("AutomationAudience")
        sleep(2000)
        inputTitleAndDate()
        audienceAnalysisSelector.click()
        continueBtn.click()
        sleep(2000)
    }

    public void createHypothesisEventPageTracking() {
        hypothesisTitleTxtFld.value("AutomationEventPageTracking")
        sleep(2000)
        inputTitleAndDate()
        eventPageTrackingSelector.click()
        continueBtn.click()
        sleep(2000)
    }

    public void createHypothesisMultiVarianceTesting() {
        hypothesisTitleTxtFld.value("AutomationMultiVariance")
        sleep(2000)
        inputTitleAndDate()
        multiVarianceTestingSelector.click()
        continueBtn.click()
        sleep(2000)
    }

    public void createHypothesisABTesting() {
        hypothesisTitleTxtFld.value("AutomationABTesting")
        sleep(2000)
        inputTitleAndDate()
        abTestingSelector.click()
        continueBtn.click()
        sleep(2000)
    }

    public void clickCreateHypothesisTab() {
//        waitFor {createHypothesisTab.isDisplayed()}
        createHypothesisTab.click()
    }

    public void clickSetupAnalyticBtn() {
        waitFor { setUpAnalyticBtn.isDisplayed() }
        setUpAnalyticBtn.click()
        sleep(3000)
    }

    public void checkHypo() {
        if(driver.findElements(By.cssSelector('div[data-name="AutomationAudience"]')).size() != 0){
            waitFor {automationAudienceXBtn.isDisplayed()}
            automationAudienceXBtn.click()
            waitFor {yesBtnPopUp.isDisplayed()}
            yesBtnPopUp.click()
            sleep(3000)
            createHypothesisTab.click()
        }else{
            createHypothesisTab.click()
        }
    }

    public void checkHypo2() {
        if(driver.findElements(By.cssSelector('div[data-name="AutomationEventPageTracking"]')).size() != 0){
            waitFor {autoEventPageTrackingXBtn.isDisplayed()}
            autoEventPageTrackingXBtn.click()
            waitFor {yesBtnPopUp.isDisplayed()}
            yesBtnPopUp.click()
            sleep(3000)
            createHypothesisTab.click()
        }else{
            createHypothesisTab.click()
        }
    }
}