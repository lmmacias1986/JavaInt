package tests;

import dto.UserBuilder;
import dto.UserDTO;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.PageFactoryManager;
import utils.DriverManager;
import utils.TestSteps;

public class LoginTest {
    private TestSteps testSteps;

    @Before
    public void setUp() {
        WebDriver driver = DriverManager.getInstance().getDriver();
        PageFactoryManager pageFactory = new PageFactoryManager(driver);
        testSteps = new TestSteps(pageFactory.getLoginPage(), pageFactory.getHomePage());
    }

    @Test
    public void testValidLogin() {
        UserDTO user = new UserBuilder()
                .setUsername("standard_user")
                .setPassword("secret_sauce")
                .build();

        String productsTitle = testSteps
                .openLoginPage("https://www.saucedemo.com/")
                .login(user)
                .getTitleProducts();

        Assert.assertEquals("Products", productsTitle);
    }

    @After
    public void tearDown() {
        DriverManager.getInstance().quitDriver();
    }
}
