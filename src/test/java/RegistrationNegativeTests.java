import config.AppiumConfig;
import models.AuthenticationModel;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.AuthenticationScreen;

public class RegistrationNegativeTests extends AppiumConfig {



    @Test
    public void RegistrationNegativeTest_WrongEmail(){
        boolean res = new AuthenticationScreen(driver)
                .registrationNegative(AuthenticationModel
                        .builder()
                        .email("zxcvbnm123gmail.de")
                        .password("Zxcvbn12345!")
                        .build())
                .isErrorMessageEmailPresent();
        Assert.assertTrue(res);
    }

    @Test
    public void RegistrationNegativeTest_WrongPassword(){
        boolean res = new AuthenticationScreen(driver)
                .registrationNegative(AuthenticationModel
                        .builder()
                        .email("xcvbnm123@gmail.de")
                        .password("xcvbn12345!")
                        .build())
                .isErrorMessagePasswordPresent();
        Assert.assertTrue(res);
    }

    @AfterMethod
    public void postCondition(){
        AuthenticationScreen screen = new AuthenticationScreen(driver);
        if(screen.isErrorTitlePresent())
            screen.clickErrorButtonOk();
    }
}
