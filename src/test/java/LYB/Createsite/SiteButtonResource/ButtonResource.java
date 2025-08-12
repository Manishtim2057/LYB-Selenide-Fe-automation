package LYB.Createsite.SiteButtonResource;

import LYB.Base.BaseSetup;
import LYB.Createsite.AdvanceForm.AdvanceSite;
import LYB.Createsite.SiteCategory.SiteCategory;
import LYB.Createsite.SiteEdit.SiteEdit;
import com.codeborne.selenide.conditions.Text;
import com.codeborne.selenide.conditions.webdriver.Title;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class ButtonResource extends BaseSetup {
    TestMethodOrder Ascending;


    @BeforeEach
    public void setUp() throws InterruptedException {
        open("http://localhost:4200/auth/login");

    }



    public void Search() {
        SiteEdit.Search.setValue("atmsite");
        SiteEdit.Search.pressEnter();
    }
    public void Status() throws InterruptedException {
        if(SiteCategory.Status == text("Unpublished") ) {
            SiteCategory.Published.click();
            Thread.sleep(1000);
            SiteCategory.PublishedColor.shouldBe(visible);
        }
        else
            SiteCategory.Unpub.click();
        SiteCategory.UnpublishedColor.shouldBe(visible);
    }
    @Test
    @Order(1)
    public void t1ButtonResourcePageShouldBeVisibleAfterSiteButtonResourceIsClicked(){
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        $(".component-title-block h2").shouldBe(visible);
    }

    @Test
    @Order(2)
    public void t2AddButtonResourceWithValidDetails(){
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.AddButtons.click();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementNavbar.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnPrimaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(3)
    public void t3CancelAddButtonResourceProcess(){
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.AddButtons.click();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementNavbar.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnPrimaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnCancel.click();
    }
    @Test
    @Order(4)
    public void t4CloseAddButtonResourcePanel(){
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.AddButtons.click();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementNavbar.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnPrimaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnClose.click();
    }
    @Test
    @Order(5)
    public void t5ChoosePlacementOptionAsHeader(){
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.AddButtons.click();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementHeader.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnPrimaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(6)
    public void t6ChoosePlacementOptionAsBody(){
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.AddButtons.click();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementBody.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnPrimaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(7)
    public void t7ChoosePlacementOptionAsFooter(){
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.AddButtons.click();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnPrimaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(8)
    public void t8ChooseButtonStyleAsSecondaryColor() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.AddButtons.click();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnSecondaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(9)
    public void t9ChooseButtonTypeAsCustomColorAndChooseTextAndBgColor()  throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.AddButtons.click();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnCustomColor.click();
        BtnElements.BtnTextColor.click();
        BtnElements.BtnTextInput.setValue("ea0f0f");
        BtnElements.BtnTextOk.click();
        BtnElements.BtnBackground.click();
        BtnElements.BtnBgInput.setValue("#000000");
        BtnElements.BtnBgOk.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(10)
    public void t10AddButtonWithStatusAsPublishedState()  throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.AddButtons.click();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnCustomColor.click();
        BtnElements.BtnTextColor.click();
        BtnElements.BtnTextInput.setValue("ea0f0f");
        BtnElements.BtnTextOk.click();
        BtnElements.BtnBackground.click();
        BtnElements.BtnBgInput.setValue("#000000");
        BtnElements.BtnBgOk.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnPublish.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(11)
    public void t11AddTypeAsScroll()  throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.AddButtons.click();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnCustomColor.click();
        BtnElements.BtnTextColor.click();
        BtnElements.BtnTextInput.setValue("ea0f0f");
        BtnElements.BtnTextOk.click();
        BtnElements.BtnBackground.click();
        BtnElements.BtnBgInput.setValue("#000000");
        BtnElements.BtnBgOk.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnPublish.click();
        BtnElements.BtnType.click();
        BtnElements.BtnScroll.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(12)
    public void t12AddTypeAsModal()  throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.AddButtons.click();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnCustomColor.click();
        BtnElements.BtnTextColor.click();
        BtnElements.BtnTextInput.setValue("ea0f0f");
        BtnElements.BtnTextOk.click();
        BtnElements.BtnBackground.click();
        BtnElements.BtnBgInput.setValue("#000000");
        BtnElements.BtnBgOk.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnPublish.click();
        BtnElements.BtnType.click();
        BtnElements.BtnModal.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }

    @Test
    @Order(13)
    public void t13ErrorMessageShouldBeVisibleAfterTitleAddedAsUpperLimit() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.AddButtons.click();
        BtnElements.BtnTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnSecondaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
        AdvanceSite.AlertMessage.shouldBe(visible);
    }

    @Test
    @Order(2)
    public void t14EditButtonResourceWithValidDetails(){
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnEdit.click();
        BtnElements.BtnTitle.clear();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementNavbar.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnPrimaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.clear();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(3)
    public void t15CancelEditButtonResourceProcess(){
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnEdit.click();
        BtnElements.BtnTitle.clear();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementNavbar.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnPrimaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnCancel.click();
    }
    @Test
    @Order(4)
    public void t16CloseEditButtonResourcePanel(){
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnEdit.click();
        BtnElements.BtnTitle.clear();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementNavbar.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnPrimaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnClose.click();
    }
    @Test
    @Order(5)
    public void t17UpdatePlacementOptionAsHeader(){
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnEdit.click();
        BtnElements.BtnTitle.clear();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementHeader.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnPrimaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(6)
    public void t18UpdatePlacementOptionAsBody(){
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnEdit.click();
        BtnElements.BtnTitle.clear();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementBody.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnPrimaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(7)
    public void t19UpdatePlacementOptionAsFooter(){
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnEdit.click();
        BtnElements.BtnTitle.clear();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnPrimaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(8)
    public void t20UpdateButtonStyleAsSecondaryColor() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnEdit.click();
        BtnElements.BtnTitle.clear();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnSecondaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(9)
    public void t21UpdateButtonTypeAsCustomColorAndChooseTextAndBgColor()  throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnEdit.click();
        BtnElements.BtnTitle.clear();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnCustomColor.click();
        BtnElements.BtnTextColor.click();
        BtnElements.BtnTextInput.setValue("ea0f0f");
        BtnElements.BtnTextOk.click();
        BtnElements.BtnBackground.click();
        BtnElements.BtnBgInput.setValue("#000000");
        BtnElements.BtnBgOk.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(10)
    public void t22UpdateButtonWithStatusAsPublishedState()  throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnEdit.click();
        BtnElements.BtnTitle.clear();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnCustomColor.click();
        BtnElements.BtnTextColor.click();
        BtnElements.BtnTextInput.setValue("ea0f0f");
        BtnElements.BtnTextOk.click();
        BtnElements.BtnBackground.click();
        BtnElements.BtnBgInput.setValue("#000000");
        BtnElements.BtnBgOk.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnPublish.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(11)
    public void t23UpdateTypeAsScroll()  throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnEdit.click();
        BtnElements.BtnTitle.clear();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnCustomColor.click();
        BtnElements.BtnTextColor.click();
        BtnElements.BtnTextInput.setValue("ea0f0f");
        BtnElements.BtnTextOk.click();
        BtnElements.BtnBackground.click();
        BtnElements.BtnBgInput.setValue("#000000");
        BtnElements.BtnBgOk.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnPublish.click();
        BtnElements.BtnType.click();
        BtnElements.BtnScroll.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }
    @Test
    @Order(12)
    public void t24UpdateTypeAsModal()  throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnEdit.click();
        BtnElements.BtnTitle.clear();
        BtnElements.BtnTitle.sendKeys("Contacts");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnCustomColor.click();
        BtnElements.BtnTextColor.click();
        BtnElements.BtnTextInput.setValue("ea0f0f");
        BtnElements.BtnTextOk.click();
        BtnElements.BtnBackground.click();
        BtnElements.BtnBgInput.setValue("#000000");
        BtnElements.BtnBgOk.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnPublish.click();
        BtnElements.BtnType.click();
        BtnElements.BtnModal.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
    }

    @Test
    @Order(13)
    public void t25ErrorMessageShouldBeVisibleAfterTitleUpdatedAsUpperLimit() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnEdit.click();
        BtnElements.BtnTitle.clear();
        BtnElements.BtnTitle.sendKeys("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n");
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementFooter.click();
        BtnElements.BtnIconKeys.click();
        BtnElements.BtnIconSelect.click();
        BtnElements.BtnStyle.click();
        BtnElements.BtnSecondaryColor.click();
        BtnElements.BtnStatusDropDown.click();
        BtnElements.BtnUnpublished.click();
        BtnElements.BtnType.click();
        BtnElements.BtnLink.click();
        BtnElements.BtnContent.sendKeys("www.youtube.com");
        BtnElements.AdvanceOption.click();
        BtnElements.CssClass.sendKeys(".btn-secondary");
        BtnElements.BtnSave.click();
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
        AdvanceSite.AlertMessage.shouldBe(visible);
    }
    @Test
    @Order(13)
    public void t26UpdateButtonResourceStatus() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        Status();
    }
    @Test
    @Order(13)
    public void t27CancelButtonResourceRemove() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnRemove.click();
        BtnElements.RemoveCancel.click();
    }
    @Test
    @Order(13)
    public void t27CloseButtonResourceRemove() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnRemove.click();
        BtnElements.BtnClose.click();
    }
    @Test
    @Order(13)
    public void t27ConfirmButtonResourceRemove() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        BtnElements.ButtonResource.click();
        BtnElements.ButtonFlyout.click();
        BtnElements.BtnRemove.click();
        AdvanceSite.ConfirmCancel.click();
    }
    }




