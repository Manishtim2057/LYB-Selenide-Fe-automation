package LYB.Createsite.SiteConfigs;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ConfigElement {
    public static SelenideElement AddConfig = $(".component-title-block .btn-secondary");

    public static SelenideElement SiteConfig = $(".side-nav .navbar-nav .nav-item:nth-of-type(9)");
    public static SelenideElement ConfigPage = $(".component-title-block h2");
    public static SelenideElement MaxCount = $x("//*[@id=\"value\"]");
    public static SelenideElement FriendlyUrl = $x("//*[@id=\"video-options\"]/option[5]");
    public static SelenideElement NavBar = $x("//*[@id=\"video-options\"]/option[1]");
    public static SelenideElement Header = $x("//*[@id=\"video-options\"]/option[2]");
    public static SelenideElement Body = $x("//*[@id=\"video-options\"]/option[3]");
    public static SelenideElement Footer = $x("//*[@id=\"video-options\"]/option[4]");
    public static SelenideElement Unpublish = $x("//*[@id=\"status\"]/option[1]");
    public static SelenideElement Published = $x("//*[@id=\"status\"]/option[2]");

    public static SelenideElement ExportConfig = $(".component-title-block .btn:nth-of-type(2)");


}