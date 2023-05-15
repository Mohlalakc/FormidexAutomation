package pageObject;

import Browser.InitialiseBrowser;
import org.openqa.selenium.By;

public class FormsPage extends InitialiseBrowser {
    By medicalHistoryOption = By.xpath("//*[@id=\"opt-fda4b86d-ce8a-4ba6-9b2d-3d73fe0afe47\"]/div/span[2]/div[1]/span");
    By editMedicalHistoryBtn = By.id("switchEditMode");
    By medicalHistoryDescriptionTextBox = By.id("assetLocaleEditTextTextareadescription");
    By medicalHistoryUpdateBtn = By.id("saveAsset");

    public void clickMedicalHistoryOption() {
        driver.findElement(medicalHistoryOption).click();
    }
    public void clickEditMedicalHistoryBtn() {
        driver.findElement(editMedicalHistoryBtn).click();
    }
    public void ClearMedicalHistoryDescriptionTextBox() {
        driver.findElement(medicalHistoryDescriptionTextBox).clear();
    }
    public void EnterMedicalHistoryDescription(){
        driver.findElement(medicalHistoryDescriptionTextBox).sendKeys();
    }
    public void clickMedicalHistoryUpdateBtn(){
        driver.findElement(medicalHistoryUpdateBtn).click();
    }
}
