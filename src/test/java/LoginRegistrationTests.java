import config.AppiumConfig;
import org.testng.annotations.Test;
import screens.LoginRegistrationScreen;

public class LoginRegistrationTests extends AppiumConfig {

    @Test
    public void textMobileElementAuthentication(){
        LoginRegistrationScreen element = new LoginRegistrationScreen(driver);
        System.out.println(element.getTextMobileElement(element.emailAuthentication));
    }
}
