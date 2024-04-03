package com.web.driver.element.service;

import com.web.driver.element.impl.InteractionImpl;
import org.openqa.selenium.WebElement;

/**
 * <p>
 * Interacts with {@link WebPageElement}
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */

public interface Interaction {

    static Interaction getInstance(final WebElement element) {
        return new InteractionImpl(element);
    }

    /**
     * Simulates a mouse click on the WebElement.
     */
    void click();

    /**
     * Submits a form if the WebElement represents a form element.
     */
    void submit();

    /**
     * Sends the given keys to the WebElement, usually a form input element.
     *
     * @param keysToSend The character sequences to be sent.
     */
    void sendKeys(final CharSequence... keysToSend);

}
