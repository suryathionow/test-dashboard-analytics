import common.BaseSetUp
import org.junit.Assert
import org.junit.Ignore
import org.junit.Test
import page.SegmentationListPage
import page.SetupAnalyticPage

/**
 * Created by c07nw91fg1hw on 3/29/16.
 */
class SetupAnalyticTest extends BaseSetUp{
    @Test
    void createHypothesisAudienceAnalysisTest(){
        log.info("Step: Verify User is Able to Create Hypothesis for Audience Analysis")
        log.info("1. Login using valid credentials.")
        loginPage.inputCredentials("qaautomation", "Welcome123")
        waitFor(5)
        log.info("2. Click Setup Analytic Button")
        setupAnalyticPage = browser.page(SetupAnalyticPage)
        Assert.assertEquals("Dashboard",setupAnalyticPage.dashboardTitle.text())
        setupAnalyticPage.setUpAnalyticBtn.click()
        waitFor(5)
        log.info("3. Click Create Hypothesis")
        setupAnalyticPage.createHypothesisTab.click()
        waitFor(5)
        log.info("4. Enter All Mandatory Field")
        setupAnalyticPage.createHypothesisAudienceAnalysis()
        waitFor(3)
        log.info("6. Click Add New Segment")
        segmentationListPage = browser.page(SegmentationListPage)
        segmentationListPage.clickAddNewSegment()
        waitFor(5)
        log.info("7. Create New Test Segmentation")
        segmentationListPage.addAudienceAnalysis()
    }

    @Test
    void createHypothesisAudienceAnalysisAndRemove(){
        log.info("Step: Verify User is Able to Create Hypothesis for Audience Analysis")
        log.info("1. Login using valid credentials.")
        loginPage.inputCredentials("qaautomation", "Welcome123")
        waitFor(5)
        log.info("2. Click Setup Analytic Button")
        Assert.assertEquals("Dashboard",setupAnalyticPage.dashboardTitle.text())
        setupAnalyticPage.setUpAnalyticBtn.click()
        waitFor(5)
        log.info("3. Click Create Hypothesis")
        setupAnalyticPage.createHypothesisTab.click()
        waitFor(5)
        log.info("4. Enter All Mandatory Field")
        setupAnalyticPage.createHypothesisAudienceAnalysis()
        waitFor(5)
        setupAnalyticPage.morphLogo.click()
        waitFor(3)
        setupAnalyticPage.setUpAnalyticBtn.click()
        waitFor(5)
        log.info("5. Click Remove AutomationAudience Hypothesis")
        setupAnalyticPage.automationAudienceXBtn.isDisplayed()
        waitFor(3)
        setupAnalyticPage.automationAudienceXBtn.click()
        waitFor(3)
        setupAnalyticPage.noBtnPopUp.click()
        waitFor(3)
        setupAnalyticPage.automationAudienceXBtn.click()
        waitFor(3)
        setupAnalyticPage.yesBtnPopUp.click()
        waitFor(3)
    }

}
