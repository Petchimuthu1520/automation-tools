package com.web.driver.element.locator;//package com.web.driver.components.element.locator;
//
//import com.web.driver.components.driver.service.WebAutomationDriver;
//import com.web.driver.components.element.service.WebPageElement;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.locators.RelativeLocator;
//
///**
// * Implementation class for RelativeLocators interface, providing methods to locate web page elements
// * relative to other elements using Selenium's RelativeLocator.
// */
//public class RelativeLocatorsImpl implements RelativeLocators {
//
//    /**
//     * Constructor for RelativeLocatorsImpl.
//     *
//     * @param driver the web automation driver used to interact with the web page
//     * @param elementLocator the element locator used to locate web page elements
//     */
//    public RelativeLocatorsImpl(WebAutomationDriver driver, ElementLocator elementLocator) {
//
//    }
//
//    /**
//     * Locates a web page element below another element using RelativeLocator.
//     *
//     * @param locatorType the type of locator to use for the target element
//     * @param value the value of the locator for the target element
//     * @param webPageElement the reference web page element used as the base for positioning
//     * @return a WebPageElement representing the located web page element
//     */
//    public WebPageElement withBelowElement(LocatorType locatorType, String value, WebPageElement webPageElement) {
//        return with(locatorType, value).below(webPageElement);
//    }
//
//    /**
//     * Constructs a RelativeLocator.RelativeBy instance based on the specified locator type and value.
//     *
//     * @param locatorType the type of locator to use
//     * @param value the value of the locator
//     * @return a RelativeLocator.RelativeBy instance representing the specified locator
//     */
//    private RelativeLocator.RelativeBy with(LocatorType locatorType, String value) {
//        return getRelativeByValue(locatorType, value);
//    }
//
//    /**
//     * Retrieves a RelativeLocator.RelativeBy instance based on the specified locator type and value.
//     *
//     * @param locatorType the type of locator to use
//     * @param value the value of the locator
//     * @return a RelativeLocator.RelativeBy instance representing the specified locator
//     */
//    private RelativeLocator.RelativeBy getRelativeByValue(final LocatorType locatorType, final String value) {
//        return switch (locatorType) {
//            case ID -> RelativeLocator.with(By.id(value));
//            case NAME -> RelativeLocator.with(By.name(value));
//            case CLASS_NAME -> RelativeLocator.with(By.className(value));
//            case XPATH -> RelativeLocator.with(By.xpath(value));
//            case CSS_SELECTOR -> RelativeLocator.with(By.cssSelector(value));
//            case LINKED_TEXT -> RelativeLocator.with(By.linkText(value));
//            case PARTIALLY_LINKED_TEXT -> RelativeLocator.with(By.partialLinkText(value));
//            case TAG_NAME -> RelativeLocator.with(By.tagName(value));
//        };
//    }
//}
