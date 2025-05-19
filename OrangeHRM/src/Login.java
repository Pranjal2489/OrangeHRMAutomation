import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		Scroll
		Actions action=new Actions(driver);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(2000);
		action.scrollByAmount(0, 200).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(2000);
		
//		switched to My info page

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
		
//		ERROR in nationality dropdown
//		WebElement dd=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"));
//		dd.sendKeys("Indian");
		
//		gender radio button
		driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
		
//		Save button
		Thread.sleep(2000);
		action.scrollByAmount(0, 200).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']")).click();
		Thread.sleep(6000);
		
		
//		Contact Details submodule
		

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/contactDetails/empNumber/7");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("32/ 56 Kennedy avenue");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("near Post Office");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/input[1]")).sendKeys("Amritsar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]")).sendKeys("Punjab");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/input[1]")).sendKeys("143002");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("8942579348");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("5710934749");
		Thread.sleep(2000);
		action.scrollByAmount(0, 300).perform();
		Thread.sleep(2000);
		WebElement inputField5 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		inputField5.sendKeys(Keys.CONTROL + "a");
		inputField5.sendKeys(Keys.DELETE);
		inputField5.sendKeys("Pranjal8924@gmail.com");
		Thread.sleep(2000);
		WebElement inputField9=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		inputField9.sendKeys(Keys.CONTROL + "a");
		inputField9.sendKeys(Keys.DELETE);
		inputField9.sendKeys("Pranjal899238@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
//		remaining submodules
//		Emergency contacts
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmergencyContacts/empNumber/7");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Ashok Kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("Father");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("0928157984");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("8712650424");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[2]/input[1]")).sendKeys("4281751824");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']")).click();
		Thread.sleep(7000);
		
//		Remaining submodule
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewDependents/empNumber/7");
		Thread.sleep(5000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewImmigration/empNumber/7");
		Thread.sleep(5000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewJobDetails/empNumber/7");
		Thread.sleep(5000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewSalaryList/empNumber/7");
		Thread.sleep(5000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewReportToDetails/empNumber/7");
		Thread.sleep(5000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewQualifications/empNumber/7");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Evervent Technologies");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("SDE 1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")).sendKeys("3 years of experience");
		Thread.sleep(2000);
		action.scrollByAmount(0, 200).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(5000);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewMemberships/empNumber/7");
		Thread.sleep(8000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		
//		Admin module
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
//		Job submodule
		driver.findElement(By.xpath("//span[normalize-space()='Job']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='--active oxd-topbar-body-nav-tab --parent']//li[1]")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Manager");
		Thread.sleep(2000);
//		saving job title 
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Job']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Pay Grades']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Job']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Employment Status']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Internship");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Job']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Job Categories']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("HR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Job']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Work Shifts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("MORNING SHIFT");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(8000);
		
		
//		Organization
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='General Information']")).click();
		Thread.sleep(2000);
//		Edit Enabled
		driver.findElement(By.xpath("//label[normalize-space()='Edit']")).click();
		WebElement inputField6=driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters organization-name-container']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
		inputField6.sendKeys(Keys.CONTROL + "a");
		inputField6.sendKeys(Keys.DELETE);
		inputField6.sendKeys("The OrangeHRM Company");

		WebElement inputField8 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		inputField8.sendKeys(Keys.CONTROL + "a");
		inputField8.sendKeys(Keys.DELETE);
		inputField8.sendKeys("48618");

		WebElement inputField18 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		inputField18.sendKeys(Keys.CONTROL + "a");
		inputField18.sendKeys(Keys.DELETE);
		inputField18.sendKeys("85710");
		
		WebElement inputField10=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		inputField10.sendKeys(Keys.CONTROL + "a");
		inputField10.sendKeys(Keys.DELETE);
		inputField10.sendKeys("New York City");
		
		WebElement inputField11=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		inputField11.sendKeys(Keys.CONTROL + "a");
		inputField11.sendKeys(Keys.DELETE);
		inputField11.sendKeys("New York");
		
		WebElement inputField12=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		inputField12.sendKeys(Keys.CONTROL + "a");
		inputField12.sendKeys(Keys.DELETE);
		inputField12.sendKeys("426973");
		
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(7000);
		
		           
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Locations']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//input[1]")).sendKeys("California");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		action.scrollByAmount(0, 300).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, 200).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Structure']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		
//		Qualifications submodule
		driver.findElement(By.xpath("//span[normalize-space()='Qualifications']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Skills']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Backend Development");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("development using backend technlogies such as java cpp and sql");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Qualifications']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Education']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Doctrate holder");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Qualifications']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Licenses']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 200).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -200).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Amazon Cloud Computing Certification");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(8000);

		
		driver.findElement(By.xpath("//span[normalize-space()='Qualifications']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Languages']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Hindi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Qualifications']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Memberships']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("CSR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(8000);
		
//		Nationality sub module
		driver.findElement(By.xpath("//a[normalize-space()='Nationalities']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("@#$!%");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(6000);
		
		
//		PIM MODULE
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Add Employee']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rahul");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("Raj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Sharma");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//img[@class='employee-image']")).sendKeys("C:\\Users\\hp\\Downloads\\passport-size-photo-2-e1558013566564.jpg");
//		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Employee List']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(4000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Reports']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Employee Contact info report");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(5000);
		
//		LEAVE MODULE
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Configure']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Leave Types']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Emergency");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(5000);
		
//		TIME MODULE
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");
		Thread.sleep(5000);
//		Attendance submodule
		driver.findElement(By.xpath("//span[normalize-space()='Attendance']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='My Records']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='View']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		
		
//		Punch In Punch Out
		driver.findElement(By.xpath("//span[normalize-space()='Attendance']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Punch In/Out']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Type here']")).sendKeys("Scrum meeting scheduled at 09:00 AM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='In']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//textarea[@placeholder='Type here']")).sendKeys("All the tickets raised before 3.00 PM are solved");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Out']")).click();
		Thread.sleep(7000);
		
//		Employee Records
		driver.findElement(By.xpath("//span[normalize-space()='Attendance']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Employee Records']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		
//		Configuration
		driver.findElement(By.xpath("//span[normalize-space()='Attendance']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Configuration']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[1]//div[1]//label[1]//span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-layout-context']//div[2]//div[1]//label[1]//span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[3]//div[1]//label[1]//span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(7000);
		
//		Project Info submodule
		driver.findElement(By.xpath("//span[normalize-space()='Project Info']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Customers']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Reliance Limited");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("This is a fintech industry dealing with finances and upgrading finance using cutting edge technologies");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Project Info']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Projects']")).click();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Blockchain Fingers");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Customer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Ravi k Khanna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='document']//form[@class='oxd-form']//div[@class='oxd-form-row']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//textarea[@placeholder='Type description here']")).sendKeys("BDE- Canara Bank");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("To transform the cross border payments using blockchain technology");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(7000);
		
//		Buzz Module
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]")).sendKeys("Some exciting business evenets are coming with Galaxy Infrastructures");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Most Liked Posts']")).click();
		Thread.sleep(5000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -500).perform();
		Thread.sleep(2000);
                
	}

}
