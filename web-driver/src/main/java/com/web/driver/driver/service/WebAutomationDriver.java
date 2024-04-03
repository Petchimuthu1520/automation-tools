package com.web.driver.driver.service;

import com.web.driver.components.utilities.TakesScreenshots;
import com.web.driver.driver.impl.WebAutomationDriverImpl;
import com.web.driver.driver.service.interactions.WebNavigator;
import com.web.driver.driver.service.interactions.WebTargetLocator;
import com.web.driver.element.finders.ElementFinder;
import com.web.driver.page.PageInformationProvider;
import com.web.driver.waits.WaitHandler;
import com.web.driver.window.WebWindow;
import com.web.driver.window.WindowInfoProvider;
import org.openqa.selenium.WebDriver;

/**
 * <p>
 * Represents a {@link WebAutomationDriver} that provides various services.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface WebAutomationDriver extends TakesScreenshots {

    static WebAutomationDriver getInstance(final WebDriver driver) {
        return new WebAutomationDriverImpl(driver);
    }

    /**
     * <p>
     * Closes the current browser getWebWindowHandler.
     * </p>
     */
    void close();

    /**
     * <p>
     * Quits the driver, closing all associated browser windows.
     * </p>
     */
    void quit();

    /**
     * <p>
     * Retrieves a getWindowInfoProvider for managing browser getWebWindowHandler handles.
     * </p>
     *
     * @return A getWindowInfoProvider for managing browser getWebWindowHandler handles.
     */
    WindowInfoProvider getWindowInfoProvider();

    /**
     * <p>
     * Switches the driver to a different context, such as a getWebWindowHandler or frame.
     * </p>
     *
     * @return A WebTargetLocator for navigating to different contexts.
     */
    WebTargetLocator getWebTargetLocator();

    /**
     * <p>
     * Retrieves a navigator for various browser navigation actions.
     * </p>
     *
     * @return A WebNavigation instance for browser navigation.
     */
    WebNavigator getWebNavigator();

    /**
     * <p>
     * Retrieves a getWebWindowHandler manager for controlling browser getWebWindowHandler actions.
     * </p>
     *
     * @return A WebWindow instance for managing browser windows.
     */
    WebWindow getWebWindowHandler();

    /**
     * <p>
     * Provides methods for finding web elements.
     * </p>
     *
     * @return An ElementFinder instance for locating web elements.
     */
    ElementFinder getElementFinder();

    /**
     * <p>
     * Provides information about the current state of the browser.
     * </p>
     *
     * @return An PageInformationProvider instance for retrieving browser information.
     */
    PageInformationProvider getPageInformationProvider();

    /**
     * Retrieves the WaitHandler instance associated with this object.
     *
     * @return The WaitHandler instance configured for this object.
     */
    WaitHandler getWaitHandler();


}
