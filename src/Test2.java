import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkspace\\Selenium\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.firefox.marionette","D:\\EclipseWorkspace\\Selenium\\src\\geckodriver.exe");
//    	WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://www.facebook.com";
		String tagName = "";

		driver.get(baseUrl);
		tagName = driver.findElement(By.id("email")).getTagName();

		System.out.println(tagName);
		driver.close();
		System.exit(0);
	}
}
