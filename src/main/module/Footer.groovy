package module

import geb.Module
import org.junit.Assert

/**
 * Created by c07f2arudd6h on 3/30/16.
 */
class Footer extends Module{

    static content = {
        copyrightText               {$('a[test-event="footer-help"]').eq(0)}
        helpHyperlink               {$('a[test-event="footer-help"]').eq(1)}
        termsOfUseHyperlink         {$('a[test-event="footer-help"]').eq(2)}
        privacyPolicyHyperlink      {$('a[test-event="footer-help"]').eq(3)}
        licenseInformationHyperlink {$('a[test-event="footer-help"]').eq(4)}
    }


    void assertFooterTest(){
        Assert.assertEquals("© Morph 2015. All Rights Reserved", copyrightText.text())
        Assert.assertEquals("Help", helpHyperlink.text())
        Assert.assertEquals("Terms of Use", termsOfUseHyperlink.text())
        Assert.assertEquals("Privacy Policy and Cookies", privacyPolicyHyperlink.text())
        Assert.assertEquals("License Information", licenseInformationHyperlink.text())
    }

//    void hyperlinkTest(){
//        helpHyperlink.click()
//        Assert.assertEquals("url destination", browser.getCurrentUrl()) --> need to be implement when url has been decided
//        sleep(3000)
//        termsOfUseHyperlink.click()
//        sleep(3000)
//        privacyPolicyHyperlink.click()
//        sleep(3000)
//        licenseInformationHyperlink.click()
//    }
}
