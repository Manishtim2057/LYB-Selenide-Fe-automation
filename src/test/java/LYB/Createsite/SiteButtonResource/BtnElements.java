package LYB.Createsite.SiteButtonResource;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BtnElements {
    public static SelenideElement ButtonResource = $(".side-nav .navbar-nav .nav-item:nth-of-type(10)");
    public static SelenideElement CopyButtons = $(".component-title-block .btn:nth-of-type(2)");
    public static SelenideElement SelectDestination = $(".component-title-block .btn:nth-of-type(2)");
    public static SelenideElement OKButton = $(".modal-content .modal-footer .btn-secondary");
    public static SelenideElement CancelButton = $(".modal-content .modal-footer .btn");



    public static SelenideElement AddButtons = $(".component-title-block .btn:nth-of-type(1)");
    public static SelenideElement ButtonFlyout = $(".card .custom-icon-button");
    public static SelenideElement BtnEdit = $(".dropdown-menu li:nth-of-type(2)");
    public static SelenideElement BtnPublish = $(".dropdown-menu li:nth-of-type(1)");
    public static SelenideElement BtnRemove = $(".dropdown-menu li:nth-of-type(3)");
    public static SelenideElement BtnTitle = $x("//*[@id=\"title\"]");
    public static SelenideElement BtnPlacementDropDown = $(".modal-content .custom-select");

    public static SelenideElement BtnPlacementNavbar = $x("//*[@id=\"placement\"]/option[1]");
    public static SelenideElement BtnPlacementHeader = $x("//*[@id=\"placement\"]/option[2]");
    public static SelenideElement BtnPlacementBody = $x("//*[@id=\"placement\"]/option[3]");
    public static SelenideElement BtnPlacementFooter = $x("//*[@id=\"placement\"]/option[4]");
    public static SelenideElement BtnIconKeys = $(".icon-picker");
    public static SelenideElement BtnIconSelect = $(".ip-button");
    public static SelenideElement BtnStyle = $x("//*[@id=\"button_style\"]");
    public static SelenideElement BtnPrimaryColor = $x("//*[@id=\"button_style\"]/option[1]");
    public static SelenideElement BtnSecondaryColor = $x("//*[@id=\"button_style\"]/option[2]");
    public static SelenideElement BtnCustomColor = $x("//*[@id=\"button_style\"]/option[3]");
    public static SelenideElement BtnTextColor = $x("//*[@id=\"text_color\"]");
    public static SelenideElement BtnTextInput = $x("//*[@id=\"add-site-buttons\"]/div[5]/div/color-picker/div/div[7]/div[1]/input");
    public static SelenideElement BtnTextOk = $x("//*[@id=\"add-site-buttons\"]/div[5]/div/color-picker/div/div[9]/button");
    public static SelenideElement BtnBackground = $x("//*[@id=\"background_color\"]");
    public static SelenideElement BtnBgInput = $x("//*[@id=\"add-site-buttons\"]/div[6]/div/color-picker/div/div[7]/div[1]/input");
    public static SelenideElement BtnBgOk = $x("//*[@id=\"add-site-buttons\"]/div[6]/div/color-picker/div/div[9]/button");
    public static SelenideElement BtnStatusDropDown = $x("//*[@id=\"status\"]");
    public static SelenideElement BtnPublished = $x("//*[@id=\"status\"]/option[2]");
    public static SelenideElement BtnUnpublished = $x("//*[@id=\"status\"]/option[1]");
    public static SelenideElement BtnType = $x("//*[@id=\"type\"]");
    public static SelenideElement BtnLink = $x("//*[@id=\"type\"]/option[1]");
    public static SelenideElement BtnScroll = $x("//*[@id=\"type\"]/option[2]");
    public static SelenideElement BtnModal = $x("//*[@id=\"type\"]/option[3]");
    public static SelenideElement BtnContent = $x("//*[@id=\"content\"]");
    public static SelenideElement AdvanceOption = $(".text-info");
    public static SelenideElement CssClass = $x("//*[@id=\"class\"]");
    public static SelenideElement Property = $x("//*[@id=\"property\"]");
    public static SelenideElement BtnSave = $(".modal-content .btn-secondary");
    public static SelenideElement BtnCancel = $x("//*[@id=\"add-site-buttons\"]/div[11]/a");
    public static SelenideElement BtnClose = $(".modal-content .custom-icon-button");
    public static SelenideElement RemoveCancel = $(".modal-footer > *.btn");
}
