package com.web.driver.element.service;

import com.web.driver.element.finders.ElementFinder;
import com.web.driver.element.impl.WebPageElementImpl;
import org.openqa.selenium.WebElement;

/**
 * <p>
 * Provides various services related to {@link WebPageElement}.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */

public interface WebPageElement {

    static WebPageElement getInstance(final WebElement element) {
        return new WebPageElementImpl(element);
    }

    /**
     *
     * Returns an ElementFinder specific to the context of this WebPageElement.
     *
     * @return An ElementFinder instance for further element search within this element.
     */
    ElementFinder getElementfinder();

    /**
     * Returns an Interaction instance for performing actions on this WebPageElement.
     *
     * @return An Interaction instance for interacting with this element.
     */
    Interaction interact();

    /**
     * Returns an PageInformationProvider instance for retrieving information about this WebPageElement.
     *
     * @return An PageInformationProvider instance for getting information about this element.
     */
    Information getInformer();

}
