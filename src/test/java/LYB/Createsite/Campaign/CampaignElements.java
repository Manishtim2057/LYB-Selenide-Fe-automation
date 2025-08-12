package LYB.Createsite.Campaign;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CampaignElements {
    public static SelenideElement CampaignOption = $(".side-nav .navbar-nav .nav-item:nth-of-type(2)");
    public static SelenideElement CampaignPage = $(".component-title-block h2");
    public static SelenideElement NewCampaign = $(".component-title-block .btn-secondary");
    public static SelenideElement Title = $x("//*[@id=\"title\"]");
    public static SelenideElement Slug = $x("//*[@id=\"slug\"]");
    public static SelenideElement Banner = $(".avatar-overlay");
    public static SelenideElement BannerUploader = $(".banner-uploader");
    public static SelenideElement Save   = $x("/html/body/modal-container/div/div/app-banner-upload-modal/div[3]/div/button[2]");
    public static SelenideElement StartDate = $x("//*[@id=\"start_date\"]");
    public static SelenideElement CalendarYear = $(".bs-datepicker .bs-media-container .bs-datepicker-head button:nth-of-type(3)");
    public static SelenideElement CalendarYearSelect = $(".bs-datepicker .bs-media-container .bs-datepicker-body table tr:nth-of-type(3) td:nth-of-type(1)");
    public static SelenideElement CalendarEndYearSelect = $(".bs-datepicker .bs-media-container .bs-datepicker-body table tr:nth-of-type(3) td:nth-of-type(2)");
    public static SelenideElement CalendarMonthSelect = $(".bs-datepicker .bs-media-container .bs-datepicker-body table tr:nth-of-type(4) td:nth-of-type(1)");
    public static SelenideElement CalendarDateSelect = $(".bs-datepicker .bs-datepicker-body table tr:nth-of-type(2) td:nth-of-type(4) ");
    public static SelenideElement EndDate = $x("//*[@id=\"end_date\"]");
    public static SelenideElement CalendarEndMonthSelect = $(".bs-datepicker .bs-media-container .bs-datepicker-body table tr:nth-of-type(4) td:nth-of-type(3)");
    public static SelenideElement HeaderMessage = $x("//*[@id=\"create-campaign\"]/div[6]/div/quill-editor/div[2]/div[1]");
    public static SelenideElement AdvHeaderMessage = $x("//*[@id=\"campaign\"]/div[6]/div/quill-editor/div[2]/div[1]");
    public static SelenideElement FooterMessage = $x("//*[@id=\"create-campaign\"]/div[7]/div/quill-editor/div[2]/div[1]");
    public static SelenideElement AdvFooterMessage = $x("//*[@id=\"campaign\"]/div[7]/div/quill-editor/div[2]/div[1]");
    public static SelenideElement Cancel = $(".justify-content-end .btn:nth-of-type(2)");
    public static SelenideElement SaveButton = $(".justify-content-end .btn:nth-of-type(3)");
    public static SelenideElement CloseButton = $(".modal-content .modal-header .custom-icon-button");

    public static SelenideElement CampFlyoutButton = $(".resource-card .custom-icon-button");
    public static SelenideElement CampPublish = $(".dropdown-menu li:nth-of-type(1)");
    public static SelenideElement CampUnPublish = $(".dropdown-menu li:nth-of-type(2)");
    public static SelenideElement CampDetails = $(".resource-card .card-footer .view-more ");
    ////FilterOptions Element///////////////
    public static SelenideElement FilterDate = $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-themes/section/div/app-site-campaign/app-site-campaign-list/section[1]/app-advanced-search/div/div[2]/select/option[1]");
    public static SelenideElement FilterTitle = $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-themes/section/div/app-site-campaign/app-site-campaign-list/section[1]/app-advanced-search/div/div[2]/select/option[2]");
    public static SelenideElement FilterSlug = $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-themes/section/div/app-site-campaign/app-site-campaign-list/section[1]/app-advanced-search/div/div[2]/select/option[3]");

    /////Advance Campaign//////

    public static SelenideElement AdvanceForm = $(".justify-content-end .btn:nth-of-type(1)");
    public static SelenideElement Assign = $("i.add-to-bucket");
    public static SelenideElement UnAssign = $("i.remove-form-bucket");

//////////Campaign Edit/////////
    public static SelenideElement CampaignEdit = $(".card .card-footer a.view-more");
    public static SelenideElement CampaignInformation = $(".side-nav .navbar-nav .nav-item");
    public static SelenideElement CampEditBanner = $(".logo-selector");
    public static SelenideElement CampaignStartDate = $x("//*[@id=\"start_date\"]");
    public static SelenideElement CampStartMonthSelect = $(".bs-datepicker .bs-media-container .bs-datepicker-body table tr:nth-of-type(4) td:nth-of-type(2)");
    public static SelenideElement CampStartDateSelect = $(".bs-datepicker .bs-datepicker-body table tr:nth-of-type(2) td:nth-of-type(2)");
    public static SelenideElement CampEndMonthSelect = $(".bs-datepicker .bs-media-container .bs-datepicker-body table tr:nth-of-type(4) td:nth-of-type(2)");

    public static SelenideElement CampEndDateSelect = $(".bs-datepicker .bs-datepicker-body table tr:nth-of-type(2) td:nth-of-type(5)");
    public static SelenideElement CampaignEndDate = $x("//*[@id=\"end_date\"]");
    public static SelenideElement CampaignResources = $(".side-nav .navbar-nav .custom-accordion ");
    public static SelenideElement CampaignVideo = $(".dnd-accordion.custom-accordion .panel.card .panel-collapse .navbar-nav .nav-item:nth-of-type(1)");
    public static SelenideElement CampaignDocuments = $(".dnd-accordion.custom-accordion .panel.card .panel-collapse .navbar-nav .nav-item:nth-of-type(2)");
    public static SelenideElement CampaignContact = $(".dnd-accordion.custom-accordion .panel.card .panel-collapse .navbar-nav .nav-item:nth-of-type(3)");
    public static SelenideElement CampaignLinks = $(".dnd-accordion.custom-accordion .panel.card .panel-collapse .navbar-nav .nav-item:nth-of-type(4)");
    public static SelenideElement CampaignSave = $(".side-nav .btn");
    public static SelenideElement CampaignNewDocument = $(".btn");
    public static SelenideElement CampaignNewContact = $(".btn");
    public static SelenideElement CampaignNewLink = $(".btn");
    public static SelenideElement FlyoutMenu = $(".block-view .custom-icon-button");
    public static SelenideElement CampStatus = $(".dropdown-menu li:nth-of-type(1)");
    public static SelenideElement CampRemove = $(".dropdown-menu li:nth-of-type(2)");
    public static SelenideElement UploadDocument = $(".upload-resource-block .link");
    public static SelenideElement CampHeader = $x("//*[@id=\"edit-campaign\"]/div[5]/div/quill-editor/div[2]/div[1]");
    public static SelenideElement CampFooter = $x("//*[@id=\"edit-campaign\"]/div[6]/div/quill-editor/div[2]/div[1]");


}
