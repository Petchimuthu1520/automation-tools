package com.web.driver.element.locator;

/**
 * Represents different types of locators for web elements.
 */
public enum LocatorType {

    /**
     * finds element by using Id
     */
    ID,

    /**
     * finds element by using name
     */
    NAME,

    /**
     * finds element by using class name
     */
    CLASS_NAME,

    /**
     * finds element by using xpath
     */
    XPATH,

    /**
     * finds element by using css selector
     */
    CSS_SELECTOR,

    /**
     * finds element by using linked text
     */
    LINKED_TEXT,

    /**
     * finds element by using partially linked text
     */
    PARTIALLY_LINKED_TEXT,

    /**
     * finds element by using tag name
     */
    TAG_NAME;

}

