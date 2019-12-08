package com.class30;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver w1=new ChromeDriver();
		WebDriver w2=new FirefoxDriver();
		w1.openBrowser();
		w1.closeBrowser();
		w1.findElement();
		w1.maximizeWindow();
		
		w2.openBrowser();
		w2.closeBrowser();
		w2.findElement();
		w2.maximizeWindow();
		

	}

}
