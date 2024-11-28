package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(className = "title")
    private WebElement titleProducts;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getTitleProducts() {
        return titleProducts.getText();
    }
}
