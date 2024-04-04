package com.web.driver.driver.impl;

import com.web.driver.driver.service.interactions.WebNavigator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;

/**
 * Implementation of the WebNavigation interface using Selenium WebDriver Navigation.
 *
 * @author petchimuthu1520
 * @version 1.0
 */
public final class WebNavigatorImpl implements WebNavigator {

    private final WebDriver.Navigation navigation;

    public WebNavigatorImpl(final Navigation navigation) {
        this.navigation = navigation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void back() {
        navigation.back();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void forward() {
        navigation.forward();
    }

    /**
     * {@inheritDoc}
     *
     * @param url The URL to getWebNavigator to.
     */
    @Override
    public void to(final String url) {
        navigation.to(url);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void refresh() {
        navigation.refresh();
    }

}
