import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		
		//driver.findElementById("month").sendKeys("Mar");
		
		//select class 
		
		Select s= new Select(driver.findElementById("day1"));
		
		//s.selectByIndex(8);
		//s.selectByVisibleText("Jun");
		//s.selectByValue("4");
		
		List<WebElement> i=s.getOptions();
		
		System.out.println(i.size());
		
		for(int j=0;j<i.size();j++) {
			
			System.out.println(i.get(j).getText());
			
			s.selectByIndex(j);
		}

	}

}
