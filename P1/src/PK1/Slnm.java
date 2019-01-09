package PK1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Slnm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_deepak\\setups\\Jar\\Chrome\\chromedriver.exe");
		ChromeDriver sln=new ChromeDriver();
		sln.get("https://www.facebook.com/");
		Thread.sleep(2000);
		sln.manage().window().maximize();
		WebElement user= sln.findElement(By.cssSelector("input#u_0_j"));
		user.sendKeys("Ashish");
		WebElement phone= sln.findElement(By.cssSelector("input[name='lastname']"));
		phone.sendKeys("sharma");
		WebElement mobile= sln.findElement(By.cssSelector("input[name='reg_email__']"));
		mobile.sendKeys("9891619519");
		WebElement pasw= sln.findElement(By.cssSelector("input[name='reg_passwd__']"));
		pasw.sendKeys("abc123");
		WebElement dob=sln.findElement(By.cssSelector("select._5dba"));
		Select day=new Select(dob);
		day.selectByIndex(8);
		WebElement mon= sln.findElement(By.id("month"));
		Select mnt=new Select(mon);
		mnt.selectByVisibleText("Oct");
		WebElement yr=sln.findElement(By.id("year"));
		Select yer=new Select(yr);
		yer.selectByValue("1988");
		WebElement gender= sln.findElement(By.id("u_0_a"));
		gender.click();
		WebElement submit= sln.findElement(By.cssSelector("button[name='websubmit']"));
		submit.click();
				
	}
	
	
}
