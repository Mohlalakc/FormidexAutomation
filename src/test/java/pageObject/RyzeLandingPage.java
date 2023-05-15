package pageObject;

import Browser.InitialiseBrowser;
import org.openqa.selenium.By;

public class RyzeLandingPage extends InitialiseBrowser {
    By repositoryBtn = By.id("menuMdb");
    By studiesOption = By.xpath("//*[@id=\"menuMdbStudies\"]/span/span");
    By studiesMenuBtn = By.xpath("//*[@id=\"fdxMdbContainerListItem0MenuToggle\"]");
    By studiesMenuViewOption = By.xpath("//*[@id=\"fdxMdbContainerListItem0View\"]");
    By studiesMenuEditOption = By.xpath("//*[@id=\"fdxMdbContainerListItem0Edit\"]");
    By studiesMenuRemoveThisStudyOption = By.id("//*[@id=\"fdxMdbContainerListItem0Delete\"]");
    By studiesMenuTransitionThisStudyOption = By.id("//*[@id=\"fdxMdbContainerListItem0Transition\"]");

    public void clickRepositoryBtn(){
        driver.findElement(repositoryBtn).click();
    }
    public void CheckRepositoryBtnDisplayed(){
        driver.findElement(repositoryBtn).isDisplayed();
    }
    public void clickStudiesOption(){
        driver.findElement(studiesOption).click();
    }
    public void clickStudiesMenuBtn(){
        driver.findElement(studiesMenuBtn).click();
    }
    public void getStudiesMenuViewOptionText(){
        driver.findElement(studiesMenuViewOption).getText();
    }
    public void getStudiesMenuEditOptionText(){
        driver.findElement(studiesMenuEditOption).getText();
    }
    public void getStudiesMenuRemoveThisStudyOptionText(){
        driver.findElement(studiesMenuRemoveThisStudyOption).getText();
    }
    public void getStudiesMenuTransitionThisStudyOptionText(){
        driver.findElement(studiesMenuTransitionThisStudyOption).getText();
    }
    public void ClickStudiesMenuViewOption() {
        driver.findElement(studiesMenuViewOption).click();
    }
}
