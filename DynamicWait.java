package learnwebdriver.files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Project\\Abhishek_Project\\Dloads\\Browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("http://demo.borland.com/gmopost/");
		driver.findElement(By.name("bSubmit")).click();
		//Thread.sleep(3000);
		driver.findElement(By.name("QTY_TENTS")).sendKeys("99");

	}

}
