package org.zehan.spider.seleniumSpider;

import org.jsoup.Jsoup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDownloader {
	 private static WebDriver webDriver =null;
	 /**
     * 新建
     *
     * @param chromeDriverPath
     */
    public SeleniumDownloader(String chromeDriverPath) {
        System.getProperties().setProperty("webdriver.chrome.driver", chromeDriverPath);
        if (null==webDriver) {
        	webDriver = new ChromeDriver();
        	System.out.println("---初始化浏览器驱动---");
		}
    }
    
    public String downloader(String url){
    	webDriver.get(url);
    	WebElement webElement = webDriver.findElement(By.xpath("/html"));
    	
    	String html= Jsoup.parse(webElement.getAttribute("outerHTML")).toString();
    	
    	return html;
    }
    public void close(){
    	
    	 webDriver.quit();
    	 System.out.println("---关闭浏览器驱动---");
    }
  
}
