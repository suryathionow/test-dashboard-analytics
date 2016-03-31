package page
import geb.Page

/**
 * Created by c07nw91fg1hw on 3/29/16.
 */
class SegmentationListPage extends Page{
    static content = {
        //=========================== Add New Segment ====================================
        addNewSegmentPage               {$('input#add-new-segment-button.btn.btn-md.new-seg-text')}
        //=========================== Setup Attributes ===================================
        productListBtn                  {$('a[data-name="Product"]')}
        emailUsThankYouBtn              {$('a[data-name="Email"]')}
        loginBtn                        {$('a[data-name="Login"]')}
        aspirinRegimentLowDoseBtn       {$('a[href="#Aspirin Regimen Bayer Low Dose Detail"]')}
        bayerWomanLowDoseBtn            {$('a[href="#Bayer Women\'s Low Dose Aspirin Detail"]')}
        aspirinRegimentRegDoseBtn       {$('a[href="#Aspirin Regimen Bayer Regular Dose Detail"]')}
        bayerXtraStrengthDetailBtn      {$('a[href="#Bayer Extra Strength Detail"]')}
        bayerBackAndBodyDetailBtn       {$('a[href="#Bayer Back and Body Detail"]')}
        bayerPlusDetailBtn              {$('a[href="#Bayer Plus Detail"]')}
        bayerChewableAspirinDetailBtn   {$('a[href="#Bayer Chewable Aspirin Detail"]')}
        genuineBayerAspirinDetailBtn    {$('a[href="#Genuine Bayer Aspirin Detail"]')}
        faqBtn                          {$('a[data-name="FAQ"]')}
        contactUsBtn                    {$('a[data-name="Contact"]')}
        aboutPainBtn                    {$('a[data-name="About"]')}
        homeBtn                         {$('a[data-name="Home"]')}
        emailUsBtn                      {$('a[data-name="Email"]')}
        siteMapBtn                      {$('a[data-name="Sitemap"]')}
        //=========================== Audience Segmentation ===============================
        eventTab                        {$('a[href="#sectionA"]')}
        externalDataTab                 {$('a[href="#sectionB"]')}
        //=========================== Event (Segmentation Checkbox) =======================
        drugNameCheckbox                {$('input.attribute-checkbox[value="drug_name"]').eq(0)}
        drugCategoryCheckbox            {$('input.attribute-checkbox[value="drug_category"]').eq(0)}
        //=========================== External Data Source ================================
        genderCheckbox                  {$('input.attribute-checkbox[value="gender"]')}
        ageCheckbox                     {$('input.attribute-checkbox[value="age"]')}
        stateCheckbox                   {$('input.attribute-checkbox[value="state"]')}
        customerLoyaltyCheckbox         {$('input.attribute-checkbox[value="customer_loyalty"]')}

        submitButton                    {$('input#submit-pop-up-segmentation[value="SUBMIT"]').eq(0)}
        submitButtonOnExternalDataSource    {$('input#submit-pop-up-segmentation[value="SUBMIT"]').eq(1)}
        //=========================== Audience Analysis Section ===========================
        addMoreAudiencePlusBtn          {$('span.add-more-audience')}
        audienceNameTxtField            {$('input#choosen-attributes.choosen-attributes')}
        removeAudienceNameBtn           {$('span.delete-audience')}
        removeEventBtn                  {$('span[remove-event-id="select_product"]')}
        removeExternalDataSourceBtn     {$('span[remove-event-id="external_data_source"]')}
        drugNameDropdown                {$('a.accordion-button.collapsed').eq(0)}
        aspirinRegimentRadioButton      {$('input[value="Aspirin Regimen Bayer Low Dose"]')}
        bayerXtraStrengthRadioButton    {$('input[value="Bayer Extra Strength"]')}
        drugNamePrimaryKeyBtn           {$('div.trash-image.cluster-key[key-attribute-id="drug_name"]')}
        genderDropdown                  {$('a.accordion-button.collapsed').eq(0)}
        femaleRadioButton               {$('input#female.attribute-list-checkbox')  }
        maleRadioButton                 {$('input#male.attribute-list-checkbox')}
        genderPrimaryKeyBtn             {$('div.trash-image.cluster-key[key-attribute-id="gender"]')}

        cancelBtn                       {$('input#cancel-create-audience')}
        createAudienceBtn               {$('input#next-analytic-setup')}
    }

    void clickAddNewSegment(){
        waitFor {addNewSegmentPage.isDisplayed()}
        addNewSegmentPage.click()
        sleep(3000)
    }

    void addAudienceAnalysis(){
//        clickAddNewSegment()
        productListBtn.click()
        sleep(2000)
        drugNameCheckbox.click()
        sleep(2000)
        drugCategoryCheckbox.click()
        sleep(2000)
        externalDataTab.click()
        sleep(2000)
        genderCheckbox.click()
        sleep(2000)
        ageCheckbox.click()
        sleep(2000)
        stateCheckbox.click()
        sleep(2000)
        submitButtonOnExternalDataSource.click()
        sleep(3000)
        audienceNameTxtField.value("Test Audience Auto")
        sleep(2000)
    }

    void selectDrugNameAndGender(){
        drugNamePrimaryKeyBtn.click()
        sleep(2000)
        drugNameDropdown.click()
        aspirinRegimentRadioButton.click()
        sleep(2000)
        genderPrimaryKeyBtn.click()
        genderDropdown.click()
        maleRadioButton.click()
        sleep(2000)
    }
}
