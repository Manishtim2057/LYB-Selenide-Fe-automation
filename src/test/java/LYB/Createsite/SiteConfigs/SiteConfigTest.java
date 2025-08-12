package LYB.Createsite.SiteConfigs;

import LYB.Base.BaseSetup;
import LYB.Createsite.SiteButtonResource.BtnElements;
import LYB.Createsite.SiteButtonResource.ButtonResource;
import LYB.Createsite.SiteCategory.SiteCategory;
import LYB.Createsite.SiteConfigs.ConfigElement;
import LYB.Createsite.SiteEdit.SiteEdit;
import LYB.Createsite.SiteUser.UsersElements;
import com.codeborne.selenide.Config;
import org.apache.commons.io.filefilter.ConditionalFileFilter;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SiteConfigTest extends BaseSetup {

    TestMethodOrder Ascending;

    @BeforeEach
    public void setUp() throws InterruptedException {
        open("http://localhost:4200/auth/login");

    }

    public void Search() {
        SiteEdit.Search.setValue("atmsite");
        SiteEdit.Search.pressEnter();
    }
    @Test
    @Order(1)
    public void t1SiteConfigPageShouldBeVisible(){
        Search();
        SiteEdit.EditSite.click();
        ConfigElement.SiteConfig.click();
        ConfigElement.ConfigPage.shouldBe(visible);
    }
    @Test
    @Order(2)
    public void t2AddConfigWithConfigKeyAsHeader(){
        Search();
        SiteEdit.EditSite.click();
        ConfigElement.SiteConfig.click();
        ConfigElement.AddConfig.click();
        BtnElements.BtnPlacementDropDown.click();
        ConfigElement.Header.click();
        ConfigElement.MaxCount.sendKeys("2");
        BtnElements.BtnStatusDropDown.click();
        ConfigElement.Published.click();
        BtnElements.BtnSave.click();


    }
    @Test
    @Order(3)
    public void t3AddConfigWithConfigKeyAsFooter(){
        Search();
        SiteEdit.EditSite.click();
        ConfigElement.SiteConfig.click();
        ConfigElement.AddConfig.click();
        BtnElements.BtnPlacementDropDown.click();
        ConfigElement.Footer.click();
        ConfigElement.MaxCount.sendKeys("2");
        BtnElements.BtnStatusDropDown.click();
        ConfigElement.Published.click();
        BtnElements.BtnSave.click();


    }
    @Test
    @Order(4)
    public void t4AddConfigWithConfigKeyAsBody(){
        Search();
        SiteEdit.EditSite.click();
        ConfigElement.SiteConfig.click();
        ConfigElement.AddConfig.click();
        BtnElements.BtnPlacementDropDown.click();
        ConfigElement.Body.click();
        ConfigElement.MaxCount.sendKeys("2");
        BtnElements.BtnStatusDropDown.click();
        ConfigElement.Published.click();
        BtnElements.BtnSave.click();


    }
    @Test
    @Order(5)
    public void t5AddConfigWithConfigKeyAsFriendlyUrl(){
        Search();
        SiteEdit.EditSite.click();
        ConfigElement.SiteConfig.click();
        ConfigElement.AddConfig.click();
        BtnElements.BtnPlacementDropDown.click();
        ConfigElement.FriendlyUrl.click();
        ConfigElement.MaxCount.sendKeys("www.google.com");
        BtnElements.BtnStatusDropDown.click();
        ConfigElement.Published.click();
        BtnElements.BtnSave.click();


    }
    @Test
    @Order(6)
    public void t6AddConfigAsUnPublishedStatus(){
        Search();
        SiteEdit.EditSite.click();
        ConfigElement.SiteConfig.click();
        ConfigElement.AddConfig.click();
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementNavbar.click();
        ConfigElement.MaxCount.sendKeys("05");
        BtnElements.BtnStatusDropDown.click();
        ConfigElement.Published.click();
        BtnElements.BtnSave.click();


    }
    @Test
    @Order(7)
    public void t7CancelAddConfigModal(){
        Search();
        SiteEdit.EditSite.click();
        ConfigElement.SiteConfig.click();
        ConfigElement.AddConfig.click();
        BtnElements.BtnPlacementDropDown.click();
        ConfigElement.FriendlyUrl.click();
        ConfigElement.MaxCount.sendKeys("www.google.com");
        BtnElements.BtnStatusDropDown.click();
        ConfigElement.Published.click();
        BtnElements.BtnCancel.click();
    }
    @Test
    @Order(8)
    public void t8AddConfigWithInvalidCount(){
        Search();
        SiteEdit.EditSite.click();
        ConfigElement.SiteConfig.click();
        ConfigElement.AddConfig.click();
        BtnElements.BtnPlacementDropDown.click();
        BtnElements.BtnPlacementNavbar.click();
        ConfigElement.MaxCount.sendKeys("21");
        BtnElements.BtnStatusDropDown.click();
        ConfigElement.Published.click();
        BtnElements.BtnSave.click();
        SiteCategory.ErrorToolTipMessage.shouldBe(visible);
    }
    @Test
    @Order(9)
    public void t9ExportConfig(){
        Search();
        SiteEdit.EditSite.click();
        ConfigElement.SiteConfig.click();
        ConfigElement.ExportConfig.click();
    }
}
