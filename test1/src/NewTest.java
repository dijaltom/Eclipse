import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	

	WebDriver t=new ChromeDriver();
	
	@BeforeTest
	
	public void y() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dijal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		t.get("https://google.com");
	}
	@Test
	public void test() {
		t.findElement(By.name("q")).sendKeys("Welcome");
		System.out.println(t.findElement(By.name("q")).getAttribute("name"));
	}
	

}
