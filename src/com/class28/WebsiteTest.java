package com.class28;

public class WebsiteTest {

	public static void main(String[] args) {
		WebDriver web=new ChromeDriver();
		web.openBrowser();
		web.closeBrowser();
		web.maximizeWindow();
		web.findElement();
		
		WebDriver oweb=new FirefoxDriver();
		oweb.openBrowser();
		oweb.closeBrowser();
		oweb.maximizeWindow();
		oweb.findElement();

	}

}
