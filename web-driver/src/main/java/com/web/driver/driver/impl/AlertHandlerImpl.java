package com.web.driver.driver.impl;

import com.web.driver.driver.service.AlertHandler;
import org.openqa.selenium.Alert;

/**
 * Interacts with browser Alerts.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public final class AlertHandlerImpl implements AlertHandler {

    private final Alert alert;

    public AlertHandlerImpl(final Alert alert) {
        this.alert = alert;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void dismiss() {
        alert.dismiss();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void accept() {
        alert.accept();
    }

    /**
     * {@inheritDoc}
     *
     * @return The text of the getAlertHandler.
     */
    @Override
    public String getText() {
        return alert.getText();
    }

    /**
     * {@inheritDoc}
     *
     * @param keysToSend The text to be sent to the getAlertHandler.
     */
    @Override
    public void sendKeys(final String keysToSend) {
        alert.sendKeys(keysToSend);
    }

}
