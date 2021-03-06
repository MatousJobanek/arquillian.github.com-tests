package org.arquillian.tests.pom.pageObjects;

import org.arquillian.tests.pom.fragmentObjects.ContentFragment;
import org.arquillian.tests.utilities.PageVerifier;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FeaturesPage {

    @Drone
    private WebDriver driver;

    @FindBy(css = "[class = 'features']")
    private ContentFragment features;

    public ContentFragment content() {
        return features;
    }

    public PageVerifier verify() {
        return new PageVerifier(driver);
    }
}
