package pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
    private WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        return new LoginPage(driver);
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }
}
