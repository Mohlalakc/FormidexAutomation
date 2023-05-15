package pageObject;

import Browser.InitialiseBrowser;
import org.openqa.selenium.By;

public class LoginPage extends InitialiseBrowser {
    By userName = By.id("username");
    By passWord = By.id("password");
    By loginBtn = By.id("btnSubmit");

    public void enterUserName(String Username) {
        driver.findElement(userName).sendKeys(Username);
    }

//    public void enterPassword(String Password) {
//
//        driver.findElement(passWord).sendKeys(Password);
//    }


    public void clickLoginBtn() {

        driver.findElement(loginBtn).click();
    }
}

