package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log =LogManager.getLogger(HomePage.class);
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement logo;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement>topMenuList;

    public void clickOnLoginLink(){
        CustomListeners.node.log(Status.PASS, "Click on loginLink : " + loginLink.getText());
        Reporter.log("Clicking on login link " + loginLink.getText()+ "<br>");
        log.info("Click on loginLink : " + loginLink.getText());
        clickOnElement(loginLink);
    }
    public boolean isLogInLinkDisplay(){
        boolean b = loginLink.isDisplayed();
        CustomListeners.node.log(Status.PASS, "Checking is loginLink displayed : " + loginLink.getText());
        Reporter.log("Checking if loginLink is displayed : "+ loginLink.getText() + "<br>");
        log.info("Checking if loginLink is displayed : "+ loginLink.getText());
        return b;
    }
    public void clickOnRegisterLink(){
        CustomListeners.node.log(Status.PASS, "Click on registerLink : " + registerLink.getText());
        Reporter.log("Clicking on Register link " + registerLink.getText() + "<br>");
        log.info("Click on RegisterLink :" + registerLink.getText());
        clickOnElement(registerLink);
    }
}
