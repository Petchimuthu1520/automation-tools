package com.web.driver.element.impl;

import com.web.driver.element.service.Interaction;
import com.web.driver.element.service.WebPageElement;
import org.openqa.selenium.WebElement;

/**
 * Interacts with {@link WebPageElement}
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public final class InteractionImpl implements Interaction {

    private final WebElement element;

    public InteractionImpl(final WebElement element) {
        this.element = element;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void click() {
        element.click();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void submit() {
        element.submit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendKeys(final CharSequence... keysToSend) {
        element.sendKeys(keysToSend);
    }
}
