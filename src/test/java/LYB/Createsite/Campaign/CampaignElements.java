package LYB.Createsite.Campaign;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CampaignElements {
    public static SelenideElement CampaignOption = $(".side-nav .navbar-nav .nav-item:nth-of-type(2)");
    public static SelenideElement CampaignPage = $("component-title-block h2");
    public static SelenideElement NewCampaign = $(".component-title-block .btn-secondary");
    public static SelenideElement Title = $x("//*[@id=\"title\"]");
    public static SelenideElement Slug = $x("//*[@id=\"slug\"]");
    public static SelenideElement Banner = $x("//*[@id=\"create-campaign\"]/div[3]/div/div/span");
    public static SelenideElement BannerUploader = $(".banner-uploader");
    public static SelenideElement Save   = $x("/html/body/modal-container/div/div/app-banner-upload-modal/div[3]/div/button[2]");
    public static SelenideElement StartDate = $x("//*[@id=\"start_date\"]");
    public static SelenideElement CalendarYear = $(".bs-datepicker .bs-media-container .bs-datepicker-head button:nth-of-type(3)");
    public static SelenideElement CalendarYearSelect = $(".bs-datepicker .bs-media-container .bs-datepicker-body table tr:nth-of-type(3) td:nth-of-type(1)");
    public static SelenideElement CalendarMonthSelect = $(".bs-datepicker .bs-media-container .bs-datepicker-body table tr:nth-of-type(1) td:nth-of-type(1)");
    public static SelenideElement CalendarDateSelect = $(".bs-datepicker .bs-datepicker-body table td:nth-of-type(2)");
    public static SelenideElement EndDate = $x("//*[@id=\"end_date\"]");
    public static SelenideElement CalendarEndMonthSelect = $(".bs-datepicker .bs-media-container .bs-datepicker-body table tr:nth-of-type(4) td:nth-of-type(3)");
    public static SelenideElement HeaderMessage = $x("//*[@id=\"create-campaign\"]/div[6]/div/quill-editor/div[2]/div[1]");
    public static SelenideElement FooterMessage = $x("//*[@id=\"create-campaign\"]/div[7]/div/quill-editor/div[2]/div[1]");
    public static SelenideElement AdvanceForm = $(".justify-content-end .btn:nth-of-type(1)");
    public static SelenideElement Cancel = $(".justify-content-end .btn:nth-of-type(2)");
    public static SelenideElement SaveButton = $(".justify-content-end .btn:nth-of-type(3)");
    public static SelenideElement CloseButton = $(".modal-content .modal-header .custom-icon-button");
}
