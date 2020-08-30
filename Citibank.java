package learnwebdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Citibank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Project\\Abhishek_Project\\Dloads\\Browserdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.travelguru.com/");
		Thread.sleep(2000);
		Set<String> w1=driver.getWindowHandles();
		System.out.println(w1.size());
		
		Iterator<String> it=w1.iterator();
		System.out.println(it.next());
		
		System.out.println("-------------------");
		driver.findElement(By.xpath("//*[@id=\"cutomerSupportNav\"]/a")).click();
		Set<String> w2=driver.getWindowHandles();
		System.out.println(w2.size());
		
		Thread.sleep(4000);
		Iterator<String> it1=w2.iterator();
		String home=it1.next();
		String login=it1.next();
		System.out.println(home);
		System.out.println(login);
		driver.switchTo().window(login);
		driver.findElement(By.id("emailId")).sendKeys("Userid1234");
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
