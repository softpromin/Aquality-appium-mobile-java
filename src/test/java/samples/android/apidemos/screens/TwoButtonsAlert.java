package samples.android.apidemos.screens;

import aquality.appium.elements.interfaces.IButton;
import aquality.appium.elements.interfaces.ILabel;
import aquality.appium.screens.AndroidScreen;
import org.openqa.selenium.By;

public class TwoButtonsAlert extends AndroidScreen {

    private static final By alertTitleLocator = By.id("android:id/alertTitle");

    private final ILabel lblAlertTitle = getElementFactory().getLabel(alertTitleLocator, "Alert title");
    private final IButton btnClose = getElementFactory().getButton(By.id("android:id/button1"), "Close alert dialog");

    public TwoButtonsAlert() {
        super(alertTitleLocator, "Two-buttons alert");
    }

    public String getAlertText() {
        return lblAlertTitle.getText();
    }

    public void closeDialog(){
        btnClose.click();
    }
}
