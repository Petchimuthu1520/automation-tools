package com.web.driver.element.service;

import com.web.driver.element.impl.InformationImpl;
import org.openqa.selenium.WebElement;

/**
 * <p>
 * gets information about {@link WebPageElement}.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */

public interface Information {

    static Information getInstance(final WebElement element) {
        return new InformationImpl(element);
    }

    /**
     * Gets the tag name of the WebElement.
     *
     * @return The tag name as a String.
     */
    String getTagName();

    /**
     * Gets the value of the specified attribute of the WebElement.
     *
     * @param name The name of the attribute.
     * @return The attribute value as a String.
     */
    String getAttribute(final String name);

    /**
     * Checks if the WebElement is selected.
     *
     * @return true if the element is selected, false otherwise.
     */
    boolean isSelected();

    /**
     * Checks if the WebElement is enabled.
     *
     * @return true if the element is enabled, false otherwise.
     */
    boolean isEnabled();

    /**
     * Gets the visible text of the WebElement.
     *
     * @return The text as a String.
     */
    String getText();

    /**
     * Checks if the WebElement is displayed.
     *
     * @return true if the element is displayed, false otherwise.
     */
    boolean isDisplayed();

}
