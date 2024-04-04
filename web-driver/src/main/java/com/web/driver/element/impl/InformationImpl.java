package com.web.driver.element.impl;

import com.web.driver.element.service.Information;
import com.web.driver.element.service.WebPageElement;
import org.openqa.selenium.WebElement;

/**
 * gets information about {@link WebPageElement}.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public class InformationImpl implements Information {
    private final WebElement element;

    public InformationImpl(final WebElement element) {
        this.element = element;
    }

    /**
     * {@inheritDoc}
     *
     * @return The tag name as a String.
     */
    @Override
    public String getTagName() {
        return element.getTagName();
    }

    /**
     * {@inheritDoc}
     *
     * @param name The name of the attribute.
     * @return The attribute value as a String.
     */
    @Override
    public String getAttribute(final String name) {
        return element.getAttribute(name);
    }

    /**
     * {@inheritDoc}
     *
     * @return true if the element is selected, false otherwise.
     */
    @Override
    public boolean isSelected() {
        return element.isSelected();
    }

    /**
     * {@inheritDoc}
     *
     * @return true if the element is enabled, false otherwise.
     */
    @Override
    public boolean isEnabled() {
        return element.isEnabled();
    }

    /**
     * {@inheritDoc}
     *
     * @return The text as a String.
     */
    @Override
    public String getText() {
        return element.getText();
    }

    /**
     * {@inheritDoc}
     *
     * @return true if the element is displayed, false otherwise.
     */
    @Override
    public boolean isDisplayed() {
        return element.isDisplayed();
    }

}
