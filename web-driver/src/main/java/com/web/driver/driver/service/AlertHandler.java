package com.web.driver.driver.service;

import com.web.driver.driver.impl.AlertHandlerImpl;
import org.openqa.selenium.Alert;

/**
 * <p>
 * Interacts with browser alerts.
 * </p>
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public interface AlertHandler {

    static AlertHandler getInstance(final Alert alert) {
        return new AlertHandlerImpl(alert);
    }

    /**
     * <p>
     * Dismisses the getAlertHandler.
     * </p>
     */
    void dismiss();

    /**
     * <p>
     * Accepts the getAlertHandler.
     * </p>
     */
    void accept();

    /**
     * <p>
     * Retrieves the text from the getAlertHandler.
     * </p>
     *
     * @return A string representing the getAlertHandler text.
     */
    String getText();

    /**
     * <p>
     * Sends keys to the getAlertHandler.
     * </p>
     *
     * @param keysToSend The keys to send to the getAlertHandler.
     */
    void sendKeys(final String keysToSend);

}
