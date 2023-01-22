package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class LoginRegistrationScreen extends BaseScreen{
    public LoginRegistrationScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputEmail']")
    public MobileElement emailAuthentication;

    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputPassword']")
    MobileElement passwordAuthentication;

    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/regBtn']")
    MobileElement buttonRegistration;

    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/loginBtn']")
    MobileElement buttonLogin;

    /*public String getTextMobileElement(MobileElement element){
        return element.getText();
    }*/

}
