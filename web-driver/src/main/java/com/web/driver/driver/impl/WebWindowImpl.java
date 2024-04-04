package com.web.driver.driver.impl;

import com.web.driver.window.WebWindow;

import org.openqa.selenium.WebDriver;

/**
 * Interacts with the browser getWebWindowHandler.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public class WebWindowImpl implements WebWindow {

    private final WebDriver.Window window;

    public WebWindowImpl(final WebDriver.Window window) {
        this.window = window;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void maximize() {
        window.maximize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void minimize() {
        window.minimize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fullscreen() {
        window.fullscreen();
    }

}
