package com.web.driver.element.locator;

import com.web.driver.driver.service.WebAutomationDriver;
import com.web.driver.element.service.WebPageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.Collection;

/**
 * Implementation class for ElementLocator interface, providing methods to locate web page elements.
 * @author petchimuthu1520
 * @version 1.0
 */
public final class ElementLocatorImpl implements ElementLocator {

    private final WebAutomationDriver webAutomationDriver;

    /**
     * Constructor for ElementLocatorImpl.
     *
     * @param webAutomationDriver the web automation driver used to interact with the web page
     */
    public ElementLocatorImpl(final WebAutomationDriver webAutomationDriver) {
        this.webAutomationDriver = webAutomationDriver;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebPageElement getWebPageElement(final LocatorType locatorType, final String value) {
        return webAutomationDriver.getElementFinder().findElement(getByValue(locatorType, value));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<WebPageElement> getWebPageElements(final LocatorType locatorType, final String value) {
        return webAutomationDriver.getElementFinder().findElements(getByValue(locatorType, value));
    }

    /**
     * Retrieves a By object based on the specified locator type and value.
     *
     * @param locatorType the type of locator to use
     * @param value       the value of the locator
     * @return a By object representing the locator
     */
    private By getByValue(final LocatorType locatorType, final String value) {
        return switch (locatorType) {
            case ID -> By.id(value);
            case NAME -> By.name(value);
            case CLASS_NAME -> By.className(value);
            case XPATH -> By.xpath(value);
            case CSS_SELECTOR -> By.cssSelector(value);
            case LINKED_TEXT -> By.linkText(value);
            case PARTIALLY_LINKED_TEXT -> By.partialLinkText(value);
            case TAG_NAME -> By.tagName(value);
        };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebPageElement withBelowElement(LocatorType locatorType, String value, LocatorType knownlocatorType, String knownValue) {
        return webAutomationDriver.getElementFinder().findElement(with(locatorType, value).below(getByValue(knownlocatorType, knownValue)));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebPageElement withAboveElement(LocatorType locatorType, String value, LocatorType knownlocatorType, String knownValue) {
        return webAutomationDriver.getElementFinder().findElement(with(locatorType, value).above(getByValue(knownlocatorType, knownValue)));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebPageElement withLeftElement(LocatorType locatorType, String value, LocatorType knownlocatorType, String knownValue) {
        return webAutomationDriver.getElementFinder().findElement(with(locatorType, value).toLeftOf(getByValue(knownlocatorType, knownValue)));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebPageElement withRightElement(LocatorType locatorType, String value, LocatorType knownlocatorType, String knownValue) {
        return webAutomationDriver.getElementFinder().findElement(with(locatorType, value).toRightOf(getByValue(knownlocatorType, knownValue)));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebPageElement withNearElement(LocatorType locatorType, String value, LocatorType knownlocatorType, String knownValue) {
        return webAutomationDriver.getElementFinder().findElement(with(locatorType, value).near(getByValue(knownlocatorType, knownValue)));
    }

    /**
     * Constructs a RelativeLocator.RelativeBy instance based on the specified locator type and value.
     *
     * @param locatorType the type of locator to use
     * @param value       the value of the locator
     * @return a RelativeLocator.RelativeBy instance representing the specified locator
     */
    private RelativeLocator.RelativeBy with(LocatorType locatorType, String value) {
        return getRelativeByValue(locatorType, value);
    }

    /**
     * Retrieves a RelativeLocator.RelativeBy instance based on the specified locator type and value.
     *
     * @param locatorType the type of locator to use
     * @param value       the value of the locator
     * @return a RelativeLocator.RelativeBy instance representing the specified locator
     */
    private RelativeLocator.RelativeBy getRelativeByValue(final LocatorType locatorType, final String value) {
        return switch (locatorType) {
            case ID -> RelativeLocator.with(By.id(value));
            case NAME -> RelativeLocator.with(By.name(value));
            case CLASS_NAME -> RelativeLocator.with(By.className(value));
            case XPATH -> RelativeLocator.with(By.xpath(value));
            case CSS_SELECTOR -> RelativeLocator.with(By.cssSelector(value));
            case LINKED_TEXT -> RelativeLocator.with(By.linkText(value));
            case PARTIALLY_LINKED_TEXT -> RelativeLocator.with(By.partialLinkText(value));
            case TAG_NAME -> RelativeLocator.with(By.tagName(value));
        };
    }
}
