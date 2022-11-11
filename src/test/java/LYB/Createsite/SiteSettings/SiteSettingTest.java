package LYB.Createsite.SiteSettings;

import LYB.Base.BaseSetup;
import LYB.Createsite.SiteCategory.SiteCategory;
import LYB.Createsite.SiteEdit.SiteEdit;
import LYB.Createsite.SiteUser.UsersElements;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SiteSettingTest extends BaseSetup {

    TestMethodOrder Ascending;

    @BeforeEach
    public void setUp() throws InterruptedException {
        open("http://localhost:4200/auth/login");

    }

    public void Search() {
        SiteEdit.Search.setValue("atmsite");
        SiteEdit.Search.pressEnter();
    }
    public void Toggle() throws InterruptedException {
        if(SettingElements.ToggleButton == text("Enabled") ) {
            SettingElements.ToggleButton.click();
            Thread.sleep(1000);
            SiteCategory.PublishedColor.shouldBe(visible);
        }
        else
            SiteCategory.Unpub.click();
        SiteCategory.UnpublishedColor.shouldBe(visible);
    }

    @Test
    @Order(1)
    public void t1SiteSettingPageShouldBeVisibleAfterClickingOnSettingPage() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        SettingElements.SiteSetting.click();
        SettingElements.SettingPage.shouldBe(visible);
    }
    @Test
    @Order(2)
    public void t2SpecificModalShouldBeVisibleAfterEditOptionIsClicked() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        SettingElements.SiteSetting.click();
        Thread.sleep(500);
        SettingElements.ButtonResource.click();
        SettingElements.Edit.click();
        $(".modal-content").shouldBe(visible);
    }
    @Test
    @Order(3)
    public void t3EnableButtonResourceSetting() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        SettingElements.SiteSetting.click();
        Thread.sleep(500);
        SettingElements.ButtonResource.click();
        SettingElements.Edit.click();

    }
    @Test
    @Order(4)
    public void t4EnableCampaign() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        SettingElements.SiteSetting.click();
        SettingElements.Campaigns.click();
        SettingElements.Edit.click();

    }
    @Test
    @Order(5)
    public void t5EnableCategoryLanguage() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        SettingElements.SiteSetting.click();
        SettingElements.CategoryLanguage.click();
        SettingElements.Edit.click();

    }
    @Test
    @Order(6)
    public void t6EnableCategoryThumbnail() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        SettingElements.SiteSetting.click();
        SettingElements.CategoryThumbnail.click();
        SettingElements.Edit.click();
        SettingElements.ToggleButton.click();

    }
    @Test
    @Order(7)
    public void t7EnableContentRecommendation() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        SettingElements.SiteSetting.click();
        SettingElements.ContentRecommendation.click();
        SettingElements.Edit.click();

    }
    @Test
    @Order(8)
    public void t8EnableVideoTemplate() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        SettingElements.SiteSetting.click();
        SettingElements.VideoTemplate.click();
        SettingElements.Edit.click();

    }
    @Test
    @Order(9)
    public void t9SetCampaignMaxLimit() throws InterruptedException {
        Search();
        SiteEdit.EditSite.click();
        SettingElements.SiteSetting.click();
        Thread.sleep(1000);
        SettingElements.CampaignMaxLimit.click();

        SettingElements.Edit.click();
        Thread.sleep(500);
        SettingElements.CampaignMaxLimitInput.clear();
        SettingElements.CampaignMaxLimitInput.sendKeys("05");
        SettingElements.SaveButton.click();
    }


    }
