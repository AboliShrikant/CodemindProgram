package selenium.practices;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// load webpage in current browser
		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
		driver.manage().window().minimize();

		// Find the first WebElement using the given method.
		WebElement maleradiobtn = driver.findElement(By.xpath("//*[@id='radio1']"));
		maleradiobtn.click();
		// Find all elements within the current page using the given mechanism.
		List<WebElement> RadioButton = driver.findElements(By.xpath("//*[@type='radio']"));
		System.out.println("No of radio buttons are:" + RadioButton.size());
		// Get a string representing the current URL that the browser is looking at.
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current URL is:" + currentURL);
		/// System.out.println("The current URl is:"+driver.getCurrentUrl());
		String Title = driver.getTitle();
		System.out.println("The Title is:" + Title);
		/// System.out.println("The current URl is:"+driver.getTitle());

		// the current window handle
		String currentWindowHandle = driver.getWindowHandle();
		System.out.println("The current window handle:" + currentWindowHandle);

		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.amazon.in/");

		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println("Windows:" + windowhandles.size());
		
		
		// allowing the driver to access the browser's history and to navigate to a
				// givenURL.
		driver.navigate().back();
		System.out.println("progem excuted for back");
		
		driver.navigate().forward();
		System.out.println("progem excuted for forward");

		driver.navigate().refresh();
		System.out.println("progem excuted for refresh");

		driver.navigate().to("https://www.google.com");
		System.out.println("progem excuted for to stringUrl");

		// Close the current window or quitting the browser if it's the last window
		// currently open.
		//driver.close();

		// Quits this driver, closing every associated window.
		driver.quit();
		

	}

}
