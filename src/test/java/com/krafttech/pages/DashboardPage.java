package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

public DashboardPage() {
}
protected WebDriver driver;

    //Task For coursers
    @FindBy(xpath = "//h1[.='Dashboard'] ")
    public WebElement dashboardPageTitle;

    @FindBy(xpath = "//span[@class='d-none d-lg-block']")
    public WebElement aFmTitle;

    @FindBy(xpath = "//span[@class='d-none d-md-block dropdown-toggle ps-2']")
    public WebElement userpupUp;

    @FindBy(xpath = "(//span[.='My Profile'])[2]")
    public WebElement MyprofileLink;

    @FindBy(xpath = "//a[.='Home'] ")
    public WebElement homeLink;

    @FindBy(xpath = "//div[@class='copyright']")
    public WebElement copyright;

    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOut;

    @FindBy(xpath = "//span[.='Login']")
    public WebElement reGoTologin;

    @FindBy(xpath = "//span[.='User66']")
    public WebElement userName;

    @FindBy(xpath = "//span[@class='d-none d-md-block dropdown-toggle ps-2']")
    public WebElement getUserName;


    public String UsersName(String Name){
        driver = Driver.get();
        String usernameLocator="//h3[.='"+Name+"']";

        BrowserUtils.waitForPresenceOfElement(By.xpath(usernameLocator),5);
        WebElement UserName= driver.findElement(By.xpath(usernameLocator));

        String actualName= UserName.getText();

      return actualName;

    }

   public String DashboardPageTitle(String title){
    //Dashboard syafasinda oldugunu verify edelim
     String Title=  dashboardPageTitle.getText();
     return Title;
}

    public String getUserName(){
        BrowserUtils.waitForVisibility(getUserName, 5);
        return getUserName.getText();
    }

    public String getHomeName(String homeName){
        BrowserUtils.waitFor(1);
        return Driver.get().findElement(By.xpath("//li[text()='"+homeName+"']")).getText();
    }

}