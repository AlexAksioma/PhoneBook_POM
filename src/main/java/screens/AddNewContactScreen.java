package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class AddNewContactScreen extends BaseScreen{

    public AddNewContactScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputName']")
    MobileElement nameContact;

    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputLastName']")
    MobileElement lastNameContact;

    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputEmail']")
    MobileElement emailContact;

    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputPhone']")
    MobileElement phoneContact;

    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputAddress']")
    MobileElement addressContact;

    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/inputDesc']")
    MobileElement descriptionContact;

    @FindBy(xpath = "//*[@resource-id = 'com.sheygam.contactapp:id/createBtn']")
    MobileElement buttonCreate;
}
