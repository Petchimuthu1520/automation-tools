package com.web.driver.driver;

import com.web.driver.driver.service.WebAutomationDriver;

/**
 * Represents a driver, which provides a {@link WebAutomationDriver}.
 */
public interface Driver {

    static Driver getInstance() {
        return new DriverImpl();
    }

    /**
     * Gets an instance of WebAutomationDriver.
     *
     * @return WebAutomationDriver instance.
     */
    WebAutomationDriver getWebAutomationDriver();
}
