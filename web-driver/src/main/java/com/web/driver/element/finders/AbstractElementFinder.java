package com.web.driver.element.finders;

import com.web.driver.element.service.WebPageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Provides common functionality for element finders.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public abstract class AbstractElementFinder implements ElementFinder {

    /**
     * {@inheritDoc}
     *
     * @param webElements The collection of Selenium WebElements to convert.
     * @return A collection of WebPageElements.
     */
    protected Collection<WebPageElement> getCommonElements(final Collection<WebElement> webElements) {
        final Collection<WebPageElement> webPageElements = new ArrayList<>();

        for (final WebElement element : webElements) {
            webPageElements.add(WebPageElement.getInstance(element));
        }

        return webPageElements;
    }

    /**
     * {@inheritDoc}
     *
     * @param by The By locator used to getElementFinder the element.
     * @return The WebPageElement representing the found element.
     */
    @Override
    public abstract WebPageElement findElement(final By by);

    /**
     * {@inheritDoc}
     *
     * @param by The By locator used to getElementFinder elements.
     * @return A collection of WebPageElement representing the found elements.
     */
    @Override
    public abstract Collection<WebPageElement> findElements(final By by);
}
