package PK1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class X5 {
	ChromeDriver sln;
	public void br() {}
	
	public void tst() {}
	
	
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_deepak\\setups\\Jar\\Chrome\\chromedriver.exe");
ChromeDriver sln=new ChromeDriver();
sln.get("https://www.facebook.com/");
sln.manage().window().maximize();

WebElement name=sln.findElement(By.xpath("//input[@aria-label='First name']"));
name.sendKeys("Ashish");
Thread.sleep(3000);
WebElement phone= sln.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='lastname']"));
phone.sendKeys("Sharma");
WebElement mobile= sln.findElement(By.xpath("//input[@id='u_0_s' or @aria-label='Mobile number or email address']"));
mobile.sendKeys("9891619519");
WebElement pasw= sln.findElement(By.xpath("//*[@data-type='password']"));
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

WebElement gn=sln.findElement(By.xpath("//*[@*='u_0_a']"));
gn.click();
WebElement submit= sln.findElement(By.xpath("//*[@*='websubmit']"));
submit.click();


}
}