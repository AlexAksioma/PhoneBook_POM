package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddNewContactScreen extends BaseScreen{

    public AddNewContactScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @CacheLookup
    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputName']")
    MobileElement nameContact;

    @CacheLookup
    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputLastName']")
    MobileElement lastNameContact;

    @CacheLookup
    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputEmail']")
    MobileElement emailContact;

    @CacheLookup
    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputPhone']")
    MobileElement phoneContact;

    @CacheLookup
    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputAddress']")
    MobileElement addressContact;

    @CacheLookup
    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputDesc']")
    MobileElement descriptionContact;

    @CacheLookup
    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/createBtn']")
    MobileElement buttonCreate;
}
