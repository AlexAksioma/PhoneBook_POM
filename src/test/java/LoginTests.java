import config.AppiumConfig;
import org.testng.annotations.Test;
import screens.LoginRegistrationScreen;

public class LoginTests extends AppiumConfig {

    @Test
    public void textMobileElementAuthentication(){
        LoginRegistrationScreen screen = new LoginRegistrationScreen(driver);

    }
}
