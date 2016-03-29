package page
import geb.Page


/**
 * Created by c07nw91fg1hw on 3/29/16.
 */
class SetupAnalyticPage extends Page{
    static content = {
        setUpAnalyticBtn    {$('div#setup-analytic').eq(0)}
        wonderDrugTxt       {$('div.setup-setting-button').eq(0)}
        dashboardTitle      {$('div.dashboard-title')}
        //===============================================================================
        morphLogo               {$('div.logo-morph')}
        analysisSetupTitleTxt   {$('li.active > a')}
        notificationBtn         {$('div.notification-counter-container.col-sm-1 > img')}
        selectProfileBtn        {$('div.menu-header.pull-left > img')}
        profileDropDown         {$('span.glyphicon.glyphicon-menu-down')}
        //=============== Use this Element below after click profileDropDown ============
        profileBtn              {$('button#goProfile.btn.btn-default.btn-md.go-profile')}
        signOutBtn              {$('button#signOut.btn.btn-default.go-signout')}
        //===============================================================================
        createHypothesisTab     {$('a[href="#sectionA"]')}
        //=============== Use this Element below after click createHypothesis ===========
        hypothesisTitleTxtFld           {$('input#name.form-control')}
        dateRangeTxtFldClick            {$('input#start-date')}
        dateRangeSelectDay              {$('div.pmu-button').eq(37)}
        audienceAnalysisSelector        {$('div.setup-segmentation-category.check').eq(0)}
        eventPageTrackingSelector       {$('div.setup-segmentation-category.check').eq(1)}
        multiVarianceTestingSelector    {$('div.setup-segmentation-category.check').eq(2)}
        abTestingSelector               {$('div.setup-segmentation-category.check').eq(3)}
        continueBtn                     {$('input#next-analytic-setup')}
        //===============================================================================
        myHypothesisTab         {$('a[href="#sectionB"]')}
        //=============== Use this Element below after click myHypothesisTab ============
        hypothesisTitleTxtField {$('input#search-name')}
        dateRange               {$('input#date-range-field')}
        clearDateBtn            {$('p.clear-date')}
        filterAllCheckbox       {$('input[value="select_all"]')}
        filterAudienceAnalysis  {$('input[value="audience_analysis"]')}
        filterEventPageTracking {$('input[value="event_page_analysis"]')}
        filterMultiVarianceTest {$('input[value="multi_variance_testing"]')}
        filterABTesting         {$('input[value="a_b_testing"]')}

        automationAudience      {$('div[data-name="AutomationAudience"]')}
    }

    void inputTitleAndDate(){
        dateRangeTxtFldClick.click()
        sleep(2000)
        dateRangeSelectDay.click()
        sleep(2000)
        hypothesisTitleTxtFld.click()
        sleep(2000)
    }

    void createHypothesisAudienceAnalysis(){
        hypothesisTitleTxtFld.value("AutomationAudience")
        sleep(2000)
        inputTitleAndDate()
        audienceAnalysisSelector.click()
        continueBtn.click()
        sleep(2000)
    }

    void createHypothesisEventPageTracking(){
        hypothesisTitleTxtFld.value("AutomationEventPageTracking")
        sleep(2000)
        inputTitleAndDate()
        eventPageTrackingSelector.click()
        continueBtn.click()
        sleep(2000)
    }

    void createHypothesisMultiVarianceTesting(){
        hypothesisTitleTxtFld.value("AutomationMultiVariance")
        sleep(2000)
        inputTitleAndDate()
        multiVarianceTestingSelector.click()
        continueBtn.click()
        sleep(2000)
    }

    void createHypothesisABTesting(){
        hypothesisTitleTxtFld.value("AutomationABTesting")
        sleep(2000)
        dinputTitleAndDate()
        abTestingSelector.click()
        continueBtn.click()
        sleep(2000)
    }
}
