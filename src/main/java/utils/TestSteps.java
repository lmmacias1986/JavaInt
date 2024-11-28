package utils;

import dto.UserDTO;
import pages.HomePage;
import pages.LoginPage;

public class TestSteps {
    private LoginPage loginPage;
    private HomePage homePage;

    public TestSteps(LoginPage loginPage, HomePage homePage) {
        this.loginPage = loginPage;
        this.homePage = homePage;
    }

    public TestSteps openLoginPage(String url) {
        DriverManager.getInstance().getDriver().get(url);
        return this;
    }

    public TestSteps login(UserDTO user) {
        loginPage.login(user.getUsername(), user.getPassword());
        return this;
    }

    public String getTitleProducts() {
        return homePage.getTitleProducts();
    }
}
