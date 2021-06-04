package com.swag.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement cartIcon;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);


    }

    public void clickOnCartIcon(){
        cartIcon.click();
    }


}
