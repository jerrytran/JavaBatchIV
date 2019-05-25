package com.class29;

public interface Webdriver extends TakesShreenshot, Executes {

	void openBrowser();

	void closeBrowser();

    void maximizeWindow();

	void findElement();
}
