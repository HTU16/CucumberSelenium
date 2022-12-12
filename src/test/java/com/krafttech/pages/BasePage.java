package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public  abstract class BasePage {

    // Bu page diger pageler icin ortak oldugundan buradan
    // diger pagelerde oldugu gibi obje olusturup kullanilmamasi gerekiyor.
    // Bunun icin de abstract yapiyorus
    // Ancak diger pages extends yaparak bu classa ait metodlari locatorlari kullanabilir

    WebDriver driver;

    public BasePage(){
                PageFactory.initElements(Driver.get(),this);
    }


    public void naviagateToTab(String tabName){
        driver=Driver.get();
        driver.findElement(By.xpath("//nav//span[.='"+tabName+"']")).click();

    }


    public void navigateToModule(String tab, String module) {

        driver=Driver.get();
        String tabLocator="//span[.='"+tab+"']";
        String moduleLocator="//span[.='"+module+"']";

            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = driver.findElement(By.xpath(tabLocator));
      tabElement.click();
        //    new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();

            BrowserUtils.waitForClickablility(By.xpath(moduleLocator), 5);
           driver.findElement(By.xpath(moduleLocator)).click();
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(driver.findElement(By.xpath(moduleLocator)));


        }

    public String subTitle(String subTitle ){

        String subTitleLocator= "//h1[.='"+subTitle+"'] ";

        BrowserUtils.waitForPresenceOfElement(By.xpath(subTitleLocator),5);
        WebElement SubTitle= Driver.get().findElement(By.xpath(subTitleLocator));
      //  System.out.println("SubTitle.getText() = " + SubTitle.getText());

        String actualsubTitle=SubTitle.getText();

        return actualsubTitle;
    }
}
