package LYB.Createsite;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class site {

 public static SelenideElement newsitebutton =  $x("/html/body/app-root/admin-root/section/div/section/div/app-sites/div/section/app-sites-list/section[1]/div/button[1]");

 public static SelenideElement logo = $x("//*[@id=\"edit-form\"]/div[1]/div[2]/label/span/i");

 public static SelenideElement sitetitle = $x("//*[@id=\"title\"]");

 public static SelenideElement subdomain = $x("//*[@id=\"domain\"]");

 public static SelenideElement primarycolor = $x("//*[@id=\"primary_color\"]");

 public static SelenideElement secondarycolor = $x("//*[@id=\"secondary_color\"]");

 public static SelenideElement message = $x("//*[@id=\"edit-form\"]/div[6]/div/quill-editor/div[2]/div[1]");

public static SelenideElement cancel = $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[3]/a[2]");

public static SelenideElement close = $x("//*[@id=\"nico-modal-body\"]/app-create-site-modal/div[1]/button");


}
