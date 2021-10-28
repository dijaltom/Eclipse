import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) throws InterruptedException,NoAlertPresentException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dijal\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver nb =new ChromeDriver();
		String url="http://demo.guru99.com/test/delete_customer.php";
		nb.get(url);
		nb.findElement(By.name("cusid")).sendKeys("5551325");
		nb.findElement(By.name("submit")).submit();
		
		Alert alert=nb.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(7000);
		alert.accept();
		
	}

}
