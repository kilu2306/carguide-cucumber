package au.com.carsguide.pages;

import au.com.carsguide.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends Utility {
    public static final Logger log= LogManager.getLogger(SearchResultPage.class.getName());
    public SearchResultPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement searchResultText;

    public String getSearchResultText(){
        log.info("getting search result text "+ searchResultText.toString());
        return  getTextFromElement(searchResultText);
    }
}
