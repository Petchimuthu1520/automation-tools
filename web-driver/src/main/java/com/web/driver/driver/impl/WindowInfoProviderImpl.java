package com.web.driver.driver.impl;

import com.web.driver.window.WindowInfoProvider;
import org.openqa.selenium.WebDriver;

import java.util.Set;

/**
 * Gets unique String value of a browser windows.
 *
 * @author petchimuthu1520
 * @version 1.0
 */

public class WindowInfoProviderImpl implements WindowInfoProvider {

    private final WebDriver driver;

    public WindowInfoProviderImpl(final WebDriver driver){
        this.driver = driver;
    }

    /**
     * {@inheritDoc}
     *
     * @return A set of getWebWindowHandler handles for multiple browser windows.
     */
    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    /**
     * {@inheritDoc}
     *
     * @return The handle of the current browser getWebWindowHandler.
     */
    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }
}
