package au.com.carsguide.pages;

import au.com.carsguide.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCarPage extends Utility {
    public static final Logger log = LogManager.getLogger(SearchCarPage.class.getName());

    public SearchCarPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement anyMakeField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement anyModelField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement anyLocation;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement priceField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyCar;

    public void selectFromAnyMakedropDopwn(String name) throws InterruptedException {
        Thread.sleep(6000);
        selectByVisibleTextFromDropDown(anyMakeField, name);
        log.info("select from any make field : " + anyMakeField.toString());
    }

    public void selectFromAnyModel(String name) throws InterruptedException {
        Thread.sleep(5000);
        selectByVisibleTextFromDropDown(anyModelField, name);
        log.info("select from any model : " + anyModelField.toString());
    }

    public void selectFromAnyLocation(String name) throws InterruptedException {
        Thread.sleep(5000);
        selectByVisibleTextFromDropDown(anyLocation, name);
        log.info("select any location : " + anyLocation.toString());
    }

    public void selectFromPrice(String price) throws InterruptedException {
        Thread.sleep(3000);
        selectByVisibleTextFromDropDown(priceField, price);
        log.info("select price : " + priceField.toString());
    }
    public void clickOnFindCar() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(findMyCar);
        log.info("click on find my car : "+ findMyCar.toString());
    }

}
