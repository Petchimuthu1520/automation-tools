package com.web.driver.driver.service.interactions;

import com.web.driver.driver.impl.WebNavigatorImpl;
import org.openqa.selenium.WebDriver;

/**
 *
 * <p>
 * Navigates the browser like forward, back, refresh and to (to particular url) .
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface WebNavigator {

    static WebNavigator getInstance(final WebDriver.Navigation navigation) {
        return new WebNavigatorImpl(navigation);
    }

    /**
     * <p>
     * Navigates the browser back.
     * </p>
     */
    void back();

    /**
     * <p>
     * Navigates the browser forward.
     * </p>
     */
    void forward();

    /**
     * <p>
     * Navigates the browser to the specified URL.
     * </p>
     *
     * @param url The URL to getWebNavigator to.
     */
    void to(final String url);

    /**
     * <p>
     * Refreshes the current page in the browser.
     * </p>
     */
    void refresh();
}
