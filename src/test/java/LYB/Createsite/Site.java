package LYB.Createsite;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Site {

 public static SelenideElement NewSiteButton =  $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-sites-list/section[1]/div/button[1]");

 public static SelenideElement Logo = $x("//*[@id=\"edit-form\"]/div[1]/div[2]/label/span/i");

 public static SelenideElement SiteTitle = $x("//*[@id=\"title\"]");

 public static SelenideElement SubDomain = $x("//*[@id=\"domain\"]");

 public static SelenideElement PrimaryColor = $x("//*[@id=\"primary_color\"]");

 public static SelenideElement PriColorInput = $x("//*[@id=\"edit-form\"]/div[4]/div[2]/color-picker/div/div[7]/div[1]/input");

 public static SelenideElement PriOkButton = $x("//*[@id=\"edit-form\"]/div[4]/div[2]/color-picker/div/div[9]/button");


 public static SelenideElement SecondaryColor = $x("//*[@id=\"secondary_color\"]");

 public static SelenideElement SecColorInput = $x("//*[@id=\"edit-form\"]/div[5]/div[2]/color-picker/div/div[7]/div[1]/input");

 public static SelenideElement SecOkButton = $x("//*[@id=\"edit-form\"]/div[5]/div[2]/color-picker/div/div[9]/button");

 public static SelenideElement message = $x("//*[@id=\"edit-form\"]/div[6]/div/quill-editor/div[2]/div[1]");

public static SelenideElement cancel = $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[3]/a[2]");

public static SelenideElement close = $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[1]/button");

public static SelenideElement SaveButton = $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[3]/button");

 public static SelenideElement SiteDescription = $x("//*[@id=\"description\"]");


 public static SelenideElement UseAdvanceForm =  $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[3]/a[1]");//User Advance Form button.





}
