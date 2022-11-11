package LYB.Createsite.SiteSettings;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SettingElements {
    public static SelenideElement SettingPage = $(".component-title-block h1");
    public static SelenideElement ButtonResource = $(".flex-table-tr:nth-of-type(1) .custom-icon-button");
    public static SelenideElement Edit = $(".dropdown-menu");
    public static SelenideElement Campaigns = $(".flex-table-tr:nth-of-type(2) .custom-icon-button");
    public static SelenideElement CategoryLanguage = $(".flex-table-tr:nth-of-type(3) .custom-icon-button");
    public static SelenideElement CategoryThumbnail = $(".flex-table-tr:nth-of-type(4) .custom-icon-button");
    public static SelenideElement ContentRecommendation = $(".flex-table-tr:nth-of-type(5) .custom-icon-button");
    public static SelenideElement VideoTemplate = $(".flex-table-tr:nth-of-type(6) .custom-icon-button");
    public static SelenideElement CampaignMaxLimit = $(".flex-table-tr:nth-of-type(7) .custom-icon-button");
    public static SelenideElement CampaignMaxLimitInput = $x("//*[@id=\"value\"]");
    public static SelenideElement ToggleButton = $(".custom-slide-toggle");
    public static SelenideElement SiteSetting = $(".side-nav .navbar-nav .nav-item:nth-of-type(11)");
    public static SelenideElement SaveButton = $x("//*[@id=\"add-user-form\"]/div[2]/button");
    public static SelenideElement CloseButton = $x("//*[@id=\"add-user-form\"]/div[2]/a");
}
