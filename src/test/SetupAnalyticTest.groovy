import common.BaseSetUp
import org.junit.Assert
import org.junit.Test

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
        setupAnalyticPage.clickSetupAnalyticBtn()
        log.info("3. Check if Analytic Hypothesis is Already Added or Not")
        setupAnalyticPage.checkHypo()
        waitFor(3)
        log.info("4. Enter All Mandatory Field")
        setupAnalyticPage.createHypothesisAudienceAnalysis()
        waitFor(5)
        log.info("5. Click Add New Segment")
        segmentationListPage.clickAddNewSegment()
        waitFor(5)
        log.info("6. Create New Test Segmentation")
        segmentationListPage.addAudienceAnalysis()
        waitFor(30)
//        Assert.assertTrue(segmentationListPage.summaryContainer.isDisplayed())
//        waitFor(5)
    }

    @Test
    void createHypothesisEventPageTracking(){
        log.info("Step: Verify User is Able to Create Hypothesis for Audience Analysis")
        log.info("1. Login using valid credentials.")
        loginPage.inputCredentials("qaautomation", "Welcome123")
        waitFor(5)
        log.info("2. Click Setup Analytic Button")
        setupAnalyticPage.clickSetupAnalyticBtn()
        log.info("3. Check if Analytic Hypothesis is Already Added or Not")
        setupAnalyticPage.checkHypo2()
        waitFor(3)
        log.info("4. Create Hypothesis Event Page Tracking")
        setupAnalyticPage.createHypothesisEventPageTracking()
        waitFor(5)
        treeMapPage.clickLoginPageEvent()
        waitFor(5)
    }
}
