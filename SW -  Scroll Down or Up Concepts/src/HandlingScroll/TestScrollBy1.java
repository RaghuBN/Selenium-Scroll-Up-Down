package HandlingScroll;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScrollBy1 {
	WebDriver driver;
	String url="http://spicejet.com";
	@Test
	public void Test() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(url);
	   ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
	   Thread.sleep(6000);
	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-800)"," ");
	}
}
