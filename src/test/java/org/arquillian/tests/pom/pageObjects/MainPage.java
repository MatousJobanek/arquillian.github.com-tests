package org.arquillian.tests.pom.pageObjects;

import org.arquillian.tests.pom.fragmentObjects.ButtonFragment;
import org.arquillian.tests.pom.fragmentObjects.ContentFragment;
import org.arquillian.tests.pom.fragmentObjects.MenuFragment;
import org.arquillian.tests.utilities.PageVerifier;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @Drone
    private WebDriver driver;

    @FindBy(css = "[class='nav']")
    private MenuFragment menu;

    @FindBy(css = "[id = 'activity']")
    private ContentFragment content;

    @FindBy(css = "[class='cta']")
    private ButtonFragment button;

    public ContentFragment content() {
        return content;
    }

    public MenuFragment menu() {
        return menu;
    }

    public ButtonFragment button() {
        return button;
    }

    public PageVerifier verify() {
        return new PageVerifier(driver);
    }
}
