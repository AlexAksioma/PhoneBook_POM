package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.AuthenticationModel;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationScreen extends BaseScreen{
    public AuthenticationScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @CacheLookup
    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputEmail']")
    MobileElement emailAuthentication;

    @CacheLookup
    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputPassword']")
    MobileElement passwordAuthentication;

    @CacheLookup
    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/regBtn']")
    MobileElement buttonRegistration;

    @CacheLookup
    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/loginBtn']")
    MobileElement buttonLogin;

    @FindBy(id = "android:id/message")
    MobileElement errorMessageText;

    @FindBy(id = "android:id/button1")
    MobileElement errorButtonOk;

    @FindBy(id = "android:id/alertTitle")
    MobileElement errorTitle;

    public AuthenticationScreen fillEmail(String email){
        waitElement(emailAuthentication, 10);
        type(emailAuthentication, email);
        return this;
    }

    public AuthenticationScreen fillPassword(String password){
        waitElement(passwordAuthentication, 5);
        type(passwordAuthentication, password);
        return this;
    }
    public ContactListScreen clickButtonLogin(){
        buttonLogin.click();
        return new ContactListScreen(driver);
    }
    public ContactListScreen clickButtonRegistration(){
        buttonRegistration.click();
        return new ContactListScreen(driver);
    }

    public ContactListScreen loginPositive(AuthenticationModel auth){
        waitElement(emailAuthentication, 10);
        type(emailAuthentication, auth.getEmail());
        type(passwordAuthentication, auth.getPassword());
        buttonLogin.click();
        return new ContactListScreen(driver);

    }
    public ContactListScreen registrationPositive(AuthenticationModel auth){
        waitElement(emailAuthentication, 10);
        type(emailAuthentication, auth.getEmail());
        type(passwordAuthentication, auth.getPassword());
        buttonRegistration.click();
        return new ContactListScreen(driver);

    }
    public  AuthenticationScreen registrationNegative(AuthenticationModel auth){
        waitElement(emailAuthentication, 10);
        type(emailAuthentication, auth.getEmail());
        type(passwordAuthentication, auth.getPassword());
        buttonRegistration.click();
        return this;

    }

    public boolean isErrorTitlePresent(){
        waitElement(errorTitle, 5);
        return errorTitle.isEnabled();
    }
    public boolean isErrorMessageEmailPresent() {
        waitElement(errorMessageText, 5);
        return errorMessageText.getText().equals("{username=must be a well-formed email address}");
    }

    public boolean isErrorMessagePasswordPresent() {
        waitElement(errorMessageText, 5);
        return errorMessageText.getText()
               .equals("{password= At least 8 characters; Must contain at least 1 uppercase letter, 1 lowercase letter, and 1 number; Can contain special characters [@$#^&*!]}");
    }
    public AuthenticationScreen clickErrorButtonOk() {
        waitElement(errorButtonOk, 5);
        errorButtonOk.click();
        return this;
    }
}
