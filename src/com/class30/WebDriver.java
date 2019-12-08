package com.class30;

public interface WebDriver {

	public void openBrowser();
	public void closeBrowser();
	public void maximizeWindow();
	public void findElement();
}
class ChromeDriver implements WebDriver{
	@Override
	public void openBrowser() {
		System.out.println("chrome: opening browser");
	}
	@Override
	public void closeBrowser() {
		System.out.println("chrome: closing browser");
	}
	@Override
	public void maximizeWindow() {
		System.out.println("chrome: maximizing window");
	}
	@Override
	public void findElement() {
		System.out.println("chrome: finding elements");
	}
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("firefox: opens browser");
	}
	@Override
	public void closeBrowser() {
		System.out.println("firefox: closing browser");
	}
	@Override
	public void maximizeWindow() {
		System.out.println("firefox: maximizing window");
	}
	@Override
	public void findElement() {
		System.out.println("firefox: finding elements");
	}
}
