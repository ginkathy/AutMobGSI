package com.nttdata.steps;

import com.nttdata.screens.ProductsScreen;
import org.junit.Assert;

public class ProductsSteps {

    ProductsScreen productsScreen;

    public void validateTitleDisplayed(){
        Assert.assertTrue(productsScreen.titleVisible());
    }

    public void validateProductsEnable(){
        Assert.assertTrue(productsScreen.productsEnabled());
    }

    public void selectProduct(String product){
        switch (product) {
            case "Sauce Labs Backpack":
                productsScreen.clickBackpack();
                break;
            case "Sauce Labs Bolt - T-Shirt":
                productsScreen.clickTshirt();
                break;
            case "Sauce Labs Bike Light":
                productsScreen.clickJacket();
                break;
        }
    }

    public void setQuantity(int quantity){
        for (int i = 0; i < quantity; i++){
            productsScreen.clickIncreaseQuantity();
        }
    }

    public void addCarProductAndQuantity(String producto, int quantity){
        selectProduct(producto);
        setQuantity(quantity);
        productsScreen.clickAddCar();
    }

    public void validateItemsAddCar(){
        Assert.assertTrue(productsScreen.isItemsAddCarVisible());
    }

}
