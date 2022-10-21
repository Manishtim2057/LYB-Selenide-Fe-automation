package LYB.Createsite.SiteEdit;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SiteEdit {

    public static SelenideElement Logo = $x("//*[@id=\"site-edit-form\"]/div[1]/label/img");


    public static SelenideElement EditSite = $(".card-footer .view-more");
    public static SelenideElement SiteInformation = $(".side-nav .nav-link");
    public static SelenideElement PrimaryInformation = $(".panel:nth-of-type(1)");
    public static SelenideElement DisplayLogo = $(".form-control-label");
    public static SelenideElement SiteTitle = $x("//*[@id=\"title\"]");
    public static SelenideElement PrimaryColor = $x("//*[@id=\"primary_color\"]");
    public static SelenideElement PrimaryColorInput = $x("//*[@id=\"site-edit-form\"]/accordion/accordion-group[1]/div/div[2]/div/div[4]/color-picker/div/div[7]/div[1]/input");
    public static SelenideElement PrimaryColorOk = $x("//*[@id=\"site-edit-form\"]/accordion/accordion-group[1]/div/div[2]/div/div[4]/color-picker/div/div[9]/button");


    public static SelenideElement SecondaryColor = $x("//*[@id=\"secondary_color\"]");
    public static SelenideElement SecondaryColorInput = $x("//*[@id=\"site-edit-form\"]/accordion/accordion-group[1]/div/div[2]/div/div[5]/color-picker/div/div[7]/div[1]/input");
    public static SelenideElement SecondaryColorOK = $x("//*[@id=\"site-edit-form\"]/accordion/accordion-group[1]/div/div[2]/div/div[5]/color-picker/div/div[9]/button");
    public static SelenideElement SiteDescription = $x("//*[@id=\"description\"]");
    public static SelenideElement SiteMessage = $x("//*[@id=\"message\"]/div[2]/div[1]");
    public static SelenideElement SitesManagement = $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-sites-list/section[1]/h2");
    public static SelenideElement SitePreview = $x("/html/body/app-root/admin-root/section/admin-side-navbar/nav[2]/div/section/div");

    public static SelenideElement SaveButton = $x("//*[@id=\"site-edit-form\"]/div[2]/button");
    public static SelenideElement ErrorTooltipMessage = $(".nico-tooltip");

    public static SelenideElement CustomerInformation = $(".panel:nth-of-type(2)");
    public static SelenideElement CustomerName = $x("//*[@id=\"customer.name\"]");
    public static SelenideElement NumberOfEmployee = $x("//*[@id=\"customer.employee_number_range\"]");
    public static SelenideElement NumberOfUsers = $x("//*[@id=\"customer.user_number_range\"]");
    public static SelenideElement OfficeAddress = $x("//*[@id=\"customer.office_address\"]");
    public static SelenideElement SuccessMessage = $("#nico-toast-container.topRight");

    public static SelenideElement Security = $(".panel:nth-of-type(3)");
    public static SelenideElement SetSitePwd = $x("//*[@id=\"site-edit-form\"]/accordion/accordion-group[3]/div/div[2]/div/div/div/label");
    public static SelenideElement Password = $x("//*[@id=\"password\"]");
    public static SelenideElement EyeSlash = $x("//*[@id=\"password\"]");




}
