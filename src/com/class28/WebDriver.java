package com.class28;

public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}

class ChromeDriver implements WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Very Slow when open browser");
	}
	@Override
	public void closeBrowser() {
		System.out.println("Close all in one time");
	}
	@Override
	public void maximizeWindow() {
		System.out.println("can maximize Window");
	}
	@Override
	public void findElement() {
		System.out.println("Can search for element easy");
	}
}
class FirefoxDriver implements WebDriver{
	@Override
	public void openBrowser() {
		System.out.println("Open very fast");
	}
	@Override
	public void closeBrowser() {
		System.out.println("Can close browser");
	}
	@Override
	public void maximizeWindow() {
		System.out.println("can miximize window easy");
	}
	@Override
	public void findElement() {
		System.out.println("Find elemt way better than Chrome");
	}
	
}