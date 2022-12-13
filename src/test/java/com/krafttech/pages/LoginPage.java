package com.krafttech.pages;


import com.krafttech.utilities.ConfigurationReader;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);


    }

    @FindBy(name = "email")
    public WebElement userNameInput_loc;

    @FindBy(name = "password")
    public WebElement passwordInput_loc;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton_loc;

    @FindBy(xpath = "//*[contains(text(),'Email address or password is incorrect')]")
    public WebElement warningMessage_loc;


    //***1
    public void loginUser() {
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        userNameInput_loc.sendKeys(username);
        passwordInput_loc.sendKeys(password);
        submitButton_loc.click();

    }

    public void loginWithParameters(String userName, String passWord) {


        userNameInput_loc.sendKeys(userName);
        passwordInput_loc.sendKeys(passWord);
        submitButton_loc.click();

    }

    public String warning(String message){
        return Driver.get().findElement(By.xpath("//*[contains(text(),'"+message+"')]")).getText();
    }
}