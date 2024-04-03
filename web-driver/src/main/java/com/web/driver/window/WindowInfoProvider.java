package com.web.driver.window;

import com.web.driver.driver.impl.WindowInfoProviderImpl;
import org.openqa.selenium.WebDriver;

import java.util.Set;

/**
 * <p>
 * Gets unique String value of a browser windows.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface WindowInfoProvider {

    static WindowInfoProvider getInstance(final WebDriver driver) {
        return new WindowInfoProviderImpl(driver);
    }

    /**
     * <p>
     * Retrieves handles of all currently open windows.
     * </p>
     *
     * @return A set of strings representing getWebWindowHandler handles.
     */
    Set<String> getWindowHandles();

    /**
     * <p>
     * Retrieves the handle of the currently focused getWebWindowHandler.
     * </p>
     *
     * @return A string representing the getWebWindowHandler handle.
     */
    String getWindowHandle();

}
