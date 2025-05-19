import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Time {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.manage().deleteAllCookies();
		Actions action=new Actions(driver);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(2000);
		action.scrollByAmount(500, 500);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
		Thread.sleep(2000);

//		name field in my info page
		WebElement inputField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		inputField.sendKeys(Keys.CONTROL + "a");
		inputField.sendKeys(Keys.DELETE);
		inputField.sendKeys("Pranjal");
		
		WebElement inputField1 = driver.findElement(By.xpath("//input[@placeholder='Middle Name']"));
		inputField1.sendKeys(Keys.CONTROL + "a");
		inputField1.sendKeys(Keys.DELETE);
		inputField1.sendKeys("Pranjal");
		
		WebElement inputField2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		inputField2.sendKeys(Keys.CONTROL + "a");
		inputField2.sendKeys(Keys.DELETE);
		inputField2.sendKeys("Kharbanda");
		
		
//		Employee Id
		WebElement inputField3 = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]"));
		inputField3.sendKeys(Keys.CONTROL + "a");
		inputField3.sendKeys(Keys.DELETE);
		inputField3.sendKeys("4972176");
		
//		Other Id
		WebElement inputField4 = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/div[@class='orangehrm-edit-employee']/div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/input[1]"));
		inputField4.sendKeys(Keys.CONTROL + "a");
		inputField4.sendKeys(Keys.DELETE);
		inputField4.sendKeys("57012857");
		

		
//		gender radio button
		driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
		
//		Save button
		Thread.sleep(2000);
		action.scrollByAmount(0, 500);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']")).click();
		Thread.sleep(6000);
		}

}
