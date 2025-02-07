package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"App logo and name\"]")
    private WebElement title;

    @AndroidFindBy(accessibility = "Displays all products of catalog")
    private WebElement viewProducts;

    @AndroidFindBy(accessibility = "Sauce Labs Backpack")
    private WebElement productBackpack;

    @AndroidFindBy(accessibility = "Sauce Labs Bolt T-Shirt")
    private WebElement productTshirt;

    @AndroidFindBy(accessibility = "Sauce Labs Fleece Jacket")
    private WebElement productJacket;

    @AndroidFindBy(accessibility = "Increase item quantity")
    private WebElement btnIncrease;

    @AndroidFindBy(accessibility = "Tap to add product to cart")
    private WebElement btnAddCarrito;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Displays number of items in your cart\"]/android.widget.ImageView")
    private WebElement lblItemsCarrito;


    public boolean titleVisible(){
        waitFor(ExpectedConditions.visibilityOf(title));
        return title.isDisplayed();
    }

    public boolean productsEnabled(){
        waitFor(ExpectedConditions.visibilityOf(viewProducts));
        return viewProducts.isEnabled();
    }

    public void clickBackpack(){
        productBackpack.click();
    }

    public void clickTshirt(){
        productTshirt.click();
    }

    public void clickJacket(){
        productJacket.click();
    }

    public void clickIncreaseQuantity(){
        waitFor(ExpectedConditions.visibilityOf(btnIncrease));
        btnIncrease.click();
    }

    public void clickAddCar(){
        btnAddCarrito.click();
    }

    public boolean isItemsAddCarVisible(){
        waitFor(ExpectedConditions.visibilityOf(lblItemsCarrito));
        return lblItemsCarrito.isEnabled();
    }

}
