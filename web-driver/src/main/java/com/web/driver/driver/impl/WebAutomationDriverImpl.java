package com.web.driver.driver.impl;

import com.web.driver.driver.Driver;
import com.web.driver.driver.service.WebAutomationDriver;
import com.web.driver.driver.service.interactions.WebNavigator;
import com.web.driver.driver.service.interactions.WebTargetLocator;
import com.web.driver.element.finders.ElementFinder;
import com.web.driver.element.finders.ElementFinderForDriver;
import com.web.driver.page.PageInformationProvider;
import com.web.driver.waits.WaitHandler;
import com.web.driver.window.WebWindow;
import com.web.driver.window.WindowInfoProvider;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

/**
 * Represents a web automation driver with various interactions.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public final class WebAutomationDriverImpl implements WebAutomationDriver {

    private final WebDriver driver;
    private final WebNavigator webNavigator;
    private final PageInformationProvider pageInformationProvider;
    private final WebTargetLocator webTargetLocator;
    private final WebWindow webWindow;
    private final WindowInfoProvider windowInfoProvider;
    private final WaitHandler waitHandler;
    private final TakesScreenshot takesScreenshots;

    public WebAutomationDriverImpl(final WebDriver driver) {
        this.driver = driver;
        this.webNavigator = WebNavigator.getInstance(driver.navigate());
        this.pageInformationProvider = PageInformationProvider.getInstance(driver);
        ElementFinder elementFinder = ElementFinderForDriver.getInstance(driver);
        this.webTargetLocator = WebTargetLocator.getInstance(driver, driver.switchTo());
        this.webWindow = WebWindow.getInstance(driver.manage().window());
        this.windowInfoProvider = WindowInfoProvider.getInstance(driver);
        Driver driverProvider = Driver.getInstance();
        this.waitHandler = WaitHandler.getInstance(driver.manage().timeouts());
        this.takesScreenshots = (TakesScreenshot) driver;
    }

    /**
     * {@inheritDoc}
     *
     * @return A WebNavigation instance for browser navigation.
     */
    @Override
    public WebNavigator getWebNavigator() {
        return webNavigator;
    }

    /**
     * {@inheritDoc}
     *
     * @return An PageInformationProvider instance for retrieving browser information.
     */
    @Override
    public PageInformationProvider getPageInformationProvider() {
        return pageInformationProvider;
    }

    @Override
    public WaitHandler getWaitHandler() {
        return waitHandler;
    }

    /**
     * {@inheritDoc}
     *
     * @return An ElementFinder instance for locating web elements.
     */
    @Override
    public ElementFinder getElementFinder() {
        return ElementFinderForDriver.getInstance(driver);
    }

    /**
     * {@inheritDoc}
     *
     * @return A WebTargetLocator for navigating to different contexts.
     */
    @Override
    public WebTargetLocator getWebTargetLocator() {
        return webTargetLocator;
    }

    /**
     * {@inheritDoc}
     *
     * @return A WebWindow instance for managing browser windows.
     */
    @Override
    public WebWindow getWebWindowHandler() {
        return webWindow;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() {
        driver.close();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void quit() {
        driver.quit();
    }

    /**
     * {@inheritDoc}
     *
     * @return A getWindowInfoProvider for managing browser getWebWindowHandler handles.
     */
    @Override
    public WindowInfoProvider getWindowInfoProvider() {
        return windowInfoProvider;
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return takesScreenshots.getScreenshotAs(target);
    }

}
