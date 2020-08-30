package learnwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Project\\Abhishek_Project\\Dloads\\Browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		String t=driver.getTitle();
		System.out.println(t);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		//driver.close();
		driver.quit();

	}

}
