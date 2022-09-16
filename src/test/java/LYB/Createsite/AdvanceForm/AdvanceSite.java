package LYB.Createsite.AdvanceForm;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AdvanceSite {

    public static SelenideElement NewSiteButton =  $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-sites-list/section[1]/div/button[1]");

    public static SelenideElement UseAdvanceForm =  $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[3]/a[1]");//User Advance Form button.

    public static SelenideElement SubDomain = $x("//*[@id=\"domain\"]");//Advance form subdomain.

    public static SelenideElement SiteTitle = $x("//*[@id=\"title\"]");//Advance Site Title.

    public static SelenideElement  SiteLogo = $x("//*[@id=\"detailsForm\"]/div[3]/div/label/span");

    public static SelenideElement SitePrimaryColor = $x("//*[@id=\"primary_color\"]");

    public static SelenideElement SitePriColorInput = $x("//*[@id=\"detailsForm\"]/div[4]/div/div[1]/color-picker/div/div[7]/div[1]/input");

    public static SelenideElement SitePriColorOKButton = $x("//*[@id=\"detailsForm\"]/div[4]/div/div[1]/color-picker/div/div[9]/button");

    public static SelenideElement SiteSecondaryColor = $x("//*[@id=\"secondary_color\"]");

    public static SelenideElement SiteSecColorInput = $x("//*[@id=\"detailsForm\"]/div[4]/div/div[2]/color-picker/div/div[7]/div[1]/input");

    public static SelenideElement SiteSecColorOkButton = $x("//*[@id=\"detailsForm\"]/div[4]/div/div[2]/color-picker/div/div[9]/button");

    public static SelenideElement SiteDescription = $x("//*[@id=\"description\"]");

    public static SelenideElement SiteNextButton =  $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-site-create/div/div/div/div[2]/section/div/div/section/div/app-site-details/section/button[2]");

    public static SelenideElement SiteMessage = $x("//*[@id=\"messageForm\"]/div/div/quill-editor/div[2]/div[1]");




}
