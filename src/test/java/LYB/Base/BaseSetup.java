package LYB.Base;
import LYB.Login.Login;

import static com.codeborne.selenide.Selenide.*;

public class BaseSetup {

    BaseButtonVariable login = new BaseButtonVariable();

    public void login()
    {
        open("http://localhost:4200/auth/login");
        login.username.sendKeys("superuser@learnyourbenefits.com");
        login.password.sendKeys("lyb@20!9");
        login.login.click();
    }
}
