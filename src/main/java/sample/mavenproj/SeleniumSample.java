package sample.mavenproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {

	public void testSample() {
		System.setProperty(Constants.BROWSER_DRIVER_PROP_KEY, Constants.BROWSER_DRIVER_PROP_VALUE);
		WebDriver driver = new ChromeDriver();
		Constants.URL="https://maven.apache.org/plugins/maven-compiler-plugin/";
		driver.get(Constants.URL);
		String paragraph = driver.findElement(By.xpath(Locators.paragraphXPath)).getText();
		System.out.println(paragraph);

	}

}
