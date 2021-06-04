package com.swag.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
    String menuButton = "//button[@id='react-burger-menu-btn']";

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement cart;


    public InventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    public String getMenuButtonLocator(){
        return menuButton;
    }

    public void clickOnAddToCart(){
        cart.click();
    }


}
