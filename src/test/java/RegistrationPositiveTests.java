import config.AppiumConfig;
import models.AuthenticationModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AuthenticationScreen;

public class RegistrationPositiveTests extends AppiumConfig {

    @Test
    public void RegistrationPositiveTest(){ //change test data
        boolean res = new AuthenticationScreen(driver)
                .registrationPositive(AuthenticationModel
                        .builder()
                        .email("zxcvbnm123@gmail.de")
                        .password("Zxcvbn12345!")
                        .build())
                .isContactListActivityPresent();
        Assert.assertTrue(res);
    }
}
