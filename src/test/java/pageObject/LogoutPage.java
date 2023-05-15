package pageObject;

import Browser.InitialiseBrowser;
import org.openqa.selenium.By;

public class LogoutPage extends InitialiseBrowser {
    By profileBtn = By.xpath("//*[@id=\"menuUser\"]/fdx-main-nav-item/div/p[2]");
    By signOutOption = By.xpath("//*[@id=\"menuUserLogout\"]/span/span");
    By ryzeLogo = By.id("logo");

    public void clickProfileBtn() {
        driver.findElement(profileBtn).click();
    }
    public void clickSignoutOption(){
        driver.findElement(signOutOption).click();
    }
    public void viewRyzeLogo(){
        driver.findElement(ryzeLogo).isDisplayed();
    }
}
