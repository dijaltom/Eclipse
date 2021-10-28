import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dijal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver ();
		d.navigate().to("https://google.com");
		String title=d.getTitle();
		if(title.equals("Google")) {
		System.out.println("Mmm Working");}
		d.findElement(By.name("q")).sendKeys("Hello");
		d.findElement(By.name("q")).submit();
		var a="About";
		var b=d.findElement(By.id("result-stats")).getText().toString();
		
		if(b.matches(a+"(.*)"))
			System.out.println("Great");
		System.out.println(d.findElement(By.name("q")).getAttribute("name"));
		d.close();
		System.exit(0); 
		
		}

		}
	


