package com.web.driver.element.finders;

import com.web.driver.element.service.WebPageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collection;

/**
 * Represents an element finder, providing methods to locate multiple elements and a single element
 * based on a given {@link By} locator.
 */
public interface ElementFinder {

    static ElementFinder getInstance(final Object value) {

        if (value instanceof WebDriver) {
            return new ElementFinderForDriver((WebDriver) value);
        } else {
            return new ElementFinderForElement((WebElement) value);
        }
    }

    /**
     * Finds multiple web page elements based on the specified {@code By} locator.
     *
     * @param by The {@code By} locator used to getElementFinder elements.
     * @return A collection of {@link WebPageElement} representing the found elements.
     */
    Collection<WebPageElement> findElements(final By by);

    /**
     * Finds a single web page element based on the specified {@code By} locator.
     *
     * @param by The {@code By} locator used to getElementFinder the element.
     * @return The {@link WebPageElement} representing the found element.
     */
    WebPageElement findElement(final By by);

}
