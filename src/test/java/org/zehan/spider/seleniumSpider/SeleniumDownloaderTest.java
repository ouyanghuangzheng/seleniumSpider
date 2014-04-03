package org.zehan.spider.seleniumSpider;

public class SeleniumDownloaderTest {
	  public static void main(String[] args) {
	    	SeleniumDownloader seleniumDownloader=new SeleniumDownloader("C:\\Users\\Administrator\\chromedriver\\chromedriver.exe");
	    	String s =seleniumDownloader.downloader("http://s.weibo.com/weibo/%25E5%2591%25A8%25E4%25B8%2580%25E8%25A7%2581&Refer=STopic_box");
	    	String s1 =seleniumDownloader.downloader("http://s.weibo.com/weibo/%25E5%2591%25A8%25E4%25B8%2580%25E8%25A7%2581&Refer=STopic_box&page=2");
	    	System.out.println(s1);
	    	seleniumDownloader.close();
		}
}
