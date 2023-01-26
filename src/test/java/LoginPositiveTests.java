import config.AppiumConfig;
import models.AuthenticationModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AuthenticationScreen;

public class LoginPositiveTests extends AppiumConfig {

    @Test
    public void loginPositiveTest(){
        boolean res = new AuthenticationScreen(driver)
                .fillEmail("qwerty3171@gmail.com")
                .fillPassword("Qwerty123!_")
                .clickButtonLogin()
                .isContactListActivityPresent();
        ;
        Assert.assertTrue(res);
    }
    @Test
    public void loginPositiveTest_Model() {
        boolean res = new AuthenticationScreen(driver)
                .loginPositive(AuthenticationModel
                        .builder()
                        .email("qwerty3171@gmail.com")
                        .password("Qwerty123!_")
                        .build())
                .isContactListActivityPresent();
        Assert.assertTrue(res);
    }

    /*@AfterMethod
    public void postCondition() {
        if (new AuthenticationScreen(driver).()) {
            new ContactListScreen(driver).logout();
            new SplashScre/river);
        }
    }*/

}
