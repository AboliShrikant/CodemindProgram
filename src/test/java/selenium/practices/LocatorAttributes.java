package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAttributes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement radioButton1 = driver.findElement(By.id("radio1"));
		WebElement radiobutton2 = driver.findElement(By.id("radio2"));
		radioButton1.click();
		radiobutton2.click();

		// WebElement
		// searchThisBlogTextbox=driver.findElement(By.className("gsc-input"));

		WebElement searchThisBlogTextbox = driver.findElement(By.name("q"));

		searchThisBlogTextbox.sendKeys("Welcome");

		// WebElement seleniumTutorialLink =
		// driver.findElement(By.linkText("SeleniumTutorial"));

		WebElement seleniumTutorialLink = driver.findElement(By.partialLinkText("SeleniumTut"));

		seleniumTutorialLink.click();
		

		//USE below format to find multiple webelements
		// driver.findElements(null);
		
		
		List <WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("No of links : "+ links.size());
		
		for(WebElement ele:links)
		{
			System.out.println(ele.getAttribute("href"));
		}
		
		
		System.out.println("Program executed sucessfully.");
	}

}
