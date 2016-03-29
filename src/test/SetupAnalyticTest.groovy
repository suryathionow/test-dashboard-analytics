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
        Assert.assertEquals("Dashboard",setupAnalyticPage.dashboardTitle.text())
        setupAnalyticPage.setUpAnalyticBtn.click()
        waitFor(5)
        log.info("3. Click Create Hypothesis")
        setupAnalyticPage.createHypothesisTab.click()
        waitFor(5)
        log.info("4. Enter All Mandatory Field")
        setupAnalyticPage.createHypothesisAudienceAnalysis()
    }
}
