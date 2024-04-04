package com.web.driver.driver.impl;

import com.web.driver.driver.service.AlertHandler;
import com.web.driver.driver.service.WebAutomationDriver;
import com.web.driver.driver.service.interactions.WebTargetLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

/**
 * Targets different getWebWindowHandler in the browser getWebWindowHandler.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public class WebTargetLocatorImpl implements WebTargetLocator {

    private final WebDriver.TargetLocator targetLocator;
    private final WebDriver driver;

    public WebTargetLocatorImpl(final WebDriver driver, final WebDriver.TargetLocator targetLocator) {
        this.driver = driver;
        this.targetLocator = targetLocator;
    }

    /**
     * {@inheritDoc}
     *
     * @param name The name of the target getWebWindowHandler.
     * @return A {@link WebAutomationDriver} representing the target getWebWindowHandler.
     */
    @Override
    public WebAutomationDriver getWindow(final String name) {
        return WebAutomationDriver.getInstance(targetLocator.window(name));
    }

    /**
     * {@inheritDoc}
     *
     * @param windowType The type of the new getWebWindowHandler to be opened.
     * @return A {@link WebAutomationDriver} representing the new getWebWindowHandler.
     */
    @Override
    public WebAutomationDriver getNewWindow(final WindowType windowType) {
        return WebAutomationDriver.getInstance(targetLocator.newWindow(windowType));
    }

    /**
     * {@inheritDoc}
     *
     * @return A {@link AlertHandler} representing the browser getAlertHandler.
     */
    @Override
    public AlertHandler getAlertHandler() {
        return AlertHandler.getInstance(driver.switchTo().alert());
    }

}
