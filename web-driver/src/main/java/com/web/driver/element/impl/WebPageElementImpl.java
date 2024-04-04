package com.web.driver.element.impl;

import com.web.driver.element.finders.ElementFinder;
import com.web.driver.element.service.Information;
import com.web.driver.element.service.Interaction;
import com.web.driver.element.service.WebPageElement;
import org.openqa.selenium.WebElement;

/**
 * Provides various services related to {@link WebPageElement}.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public final class WebPageElementImpl implements WebPageElement {
    private final Interaction interaction;
    private final Information information;
    private final ElementFinder elementFinder;

    public WebPageElementImpl(final WebElement element) {
        this.interaction = Interaction.getInstance(element);
        this.information = Information.getInstance(element);
        this.elementFinder = ElementFinder.getInstance(element);
    }

    /**
     * {@inheritDoc}
     *
     *  @return An ElementFinder instance for further element search within this element.
     */
    @Override
    public ElementFinder getElementfinder() {
        return elementFinder;
    }

    /**
     * {@inheritDoc}
     *
     * @return An Interaction instance for interacting with this element.
     */
    @Override
    public Interaction interact() {
        return interaction;
    }

    /**
     * {@inheritDoc}
     *
     * @return An PageInformationProvider instance for getting information about this element.
     */
    @Override
    public Information getInformer() {
        return information;
    }

}
