package com.web.driver.driver.service.interactions;

import com.web.driver.driver.impl.WebTargetLocatorImpl;
import com.web.driver.driver.service.AlertHandler;
import com.web.driver.driver.service.WebAutomationDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

/**
 * <p>
 * Targets different getWebWindowHandler in the browser getWebWindowHandler.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface WebTargetLocator {

    static WebTargetLocator getInstance(final WebDriver driver, final WebDriver.TargetLocator targetLocator) {
        return new WebTargetLocatorImpl(driver, targetLocator);

    }

    /**
     * <p>
     * Switches to the specified browser getWebWindowHandler by its name.
     * </p>
     *
     * @param name The name of the target getWebWindowHandler.
     * @return A {@link WebAutomationDriver} representing the target getWebWindowHandler.
     */
    WebAutomationDriver getWindow(final String name);

    /**
     * <p>
     * Opens a new browser getWebWindowHandler of the specified type.
     * </p>
     *
     * @param windowType The type of the new getWebWindowHandler to be opened.
     * @return A {@link WebAutomationDriver} representing the new getWebWindowHandler.
     */
    WebAutomationDriver getNewWindow(final WindowType windowType);

    /**
     * <p>
     * Switches to the browser getAlertHandler.
     * </p>
     *
     * @return A {@link AlertHandler} representing the browser getAlertHandler.
     */
    AlertHandler getAlertHandler();

}
