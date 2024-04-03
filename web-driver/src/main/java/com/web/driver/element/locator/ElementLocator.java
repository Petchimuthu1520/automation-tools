package com.web.driver.element.locator;

import com.web.driver.driver.service.WebAutomationDriver;
import com.web.driver.element.service.WebPageElement;

import java.util.Collection;

/**
 * Represents an element locator, used to locate web page elements within a web application.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface ElementLocator {

    /**
     * Gets an instance of ElementLocator.
     *
     * @param webAutomationDriver the web automation driver used to interact with the web page
     * @return an instance of ElementLocator
     */
    static ElementLocator getInstance(final WebAutomationDriver webAutomationDriver) {
        return new ElementLocatorImpl(webAutomationDriver);
    }

    /**
     * Gets a single web page element based on the given locator type and value.
     *
     * @param locatorType the type of locator to use
     * @param value the value of the locator
     * @return a WebPageElement representing the located web page element
     */
    WebPageElement getWebPageElement(final LocatorType locatorType, final String value);

    /**
     * Gets a collection of web page elements based on the given locator type and value.
     *
     * @param locatorType the type of locator to use
     * @param value the value of the locator
     * @return a collection of WebPageElement representing the located web page elements
     */
    Collection<WebPageElement> getWebPageElements(final LocatorType locatorType, final String value);

    /**
     * Gets a web page element located below another element.
     *
     * @param locatorType the type of locator to use for the target element
     * @param value the value of the locator for the target element
     * @param knownLocatorType the type of locator to use for the known element
     * @param knownValue the value of the locator for the known element
     * @return a WebPageElement representing the located web page element
     */
    WebPageElement withBelowElement(LocatorType locatorType, String value, LocatorType knownLocatorType, String knownValue);

    /**
     * Gets a web page element located above another element.
     *
     * @param locatorType the type of locator to use for the target element
     * @param value the value of the locator for the target element
     * @param knownLocatorType the type of locator to use for the known element
     * @param knownValue the value of the locator for the known element
     * @return a WebPageElement representing the located web page element
     */
    WebPageElement withAboveElement(LocatorType locatorType, String value, LocatorType knownLocatorType, String knownValue);

    /**
     * Gets a web page element located to the right of another element.
     *
     * @param locatorType the type of locator to use for the target element
     * @param value the value of the locator for the target element
     * @param knownLocatorType the type of locator to use for the known element
     * @param knownValue the value of the locator for the known element
     * @return a WebPageElement representing the located web page element
     */
    WebPageElement withRightElement(LocatorType locatorType, String value, LocatorType knownLocatorType, String knownValue);

    /**
     * Gets a web page element located to the left of another element.
     *
     * @param locatorType the type of locator to use for the target element
     * @param value the value of the locator for the target element
     * @param knownLocatorType the type of locator to use for the known element
     * @param knownValue the value of the locator for the known element
     * @return a WebPageElement representing the located web page element
     */
    WebPageElement withLeftElement(LocatorType locatorType, String value, LocatorType knownLocatorType, String knownValue);

    /**
     * Gets a web page element located near another element.
     *
     * @param locatorType the type of locator to use for the target element
     * @param value the value of the locator for the target element
     * @param knownLocatorType the type of locator to use for the known element
     * @param knownValue the value of the locator for the known element
     * @return a WebPageElement representing the located web page element
     */
    WebPageElement withNearElement(LocatorType locatorType, String value, LocatorType knownLocatorType, String knownValue);

}
