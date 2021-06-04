package com.swag.pageObjects;

import net.bytebuddy.description.type.TypeList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage{

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
