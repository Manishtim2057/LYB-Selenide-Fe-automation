package LYB.Createsite.SiteEdit;

import LYB.Base.BaseSetup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static com.codeborne.selenide.Selenide.open;

public class SiteEditTest extends BaseSetup {

    @BeforeEach
    public void setUp() throws InterruptedException, AWTException {
        open("http://localhost:4200/auth/login");
        Thread.sleep(2000);
    }

    @Test
    public void t1EditSiteModalShouldOpen(){



    }



    }
