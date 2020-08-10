import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSConcept {
	
	public static void main(String[] args) {
		
		System.setProperty("phantomjs.binary.path", "phantomjs.exe");
		WebDriver driver=new PhantomJSDriver();
		
		driver.get("file:///E:/JBK/Selenium/Offline%20Website/index.html");
		
		String title=driver.getTitle();
		System.out.println("Before title:"+title);
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String logintitle=driver.getTitle();
		System.out.println("after title:"+logintitle);
		

	}

}
