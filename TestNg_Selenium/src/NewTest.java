import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
	public WebDriver t;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dijal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		t = new ChromeDriver();
		t.navigate().to("https://google.com");

	}

	@Test
	public void f() {
		t.findElement(By.name("q")).sendKeys("Welcome");
		System.out.println(t.findElement(By.name("q")).getAttribute("name"));
	}

}
