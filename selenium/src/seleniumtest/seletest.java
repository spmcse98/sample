package seleniumtest;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//import com.gargoylesoftware.htmlunit.javascript.host.Set;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
//import com.sun.corba.se.impl.util.Utility;
public class seletest {
	//sample
	WebDriver driver;
	@Test
	public void startup() throws IOException, AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EEBCS012\\eclipse-workspace\\selenium.java\\chromedriver.exe");
	    driver = new ChromeDriver();
		//driver.get("http://google.com");
	    driver.get("https://test.sso-euroexim.com");
	   // String parent=driver.getWindowHandle();s
	    //System.out.println("parent tab" +parent);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"kt_login\"]/div/div[2]/kt-login/div[2]/div/div/h3")).getText());
		//System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		}
	@Test(dependsOnMethods="startup")
	public void Login() throws InterruptedException, AWTException, IOException {
		//driver.findElement(By.name("q")).sendKeys("locators in selenium");
		
		driver.findElement(By.cssSelector("a[routerlink$=\"password\"]")).click();
		
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("petchi60798@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("12345678");
		
		//driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("12345678");
		Thread.sleep(3000);
		Robot robot=new Robot();
		java.awt.Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(dimension);
		BufferedImage source= robot.createScreenCapture(rectangle);
		File destinationfile= new File("D:\\nandhni1.png");
		ImageIO.write(source,"png",destinationfile);
		driver.findElement(By.xpath("//*[@id=\"kt_login\"]/div/div[2]/kt-login/div[2]/div/form/div[3]/div/button")).click();
	//For original new tab
		String ParentWindowHandle = driver.getWindowHandle();
		System.out.println("parentwindowHandle" + ParentWindowHandle);
		driver.findElement(By.xpath("//span[contains(text(),'Test SimplexTF')]")).click();
		
		//driver.get("http://test.simplextf.com");
		//driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("petchi60798@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id=\"kt_login\"]/div/div[2]/kt-login/div[2]/div/form/div[3]/div/button")).click();
		
		
		Thread.sleep(3000);
		
		
		for(String childTab:driver.getWindowHandles())
		{
			driver.switchTo().window(childTab);
		}
	
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//body/kt-base[1]/div[1]/div[1]/kt-aside-left[1]/div[1]/kt-brand[1]/div[1]/div[2]/button[1]/span[2]/*[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Instruments')]")).click();
		driver.findElement(By.xpath("//body/kt-base[1]/div[1]/div[1]/kt-aside-left[1]/div[1]/kt-brand[1]/div[1]/div[2]/button[1]/span[1]/*[1]")).click();
		Thread.sleep(10000);
		//View page link
		driver.findElement(By.xpath("//kt-portlet-body/div[2]/mat-table[1]/mat-row[1]/mat-cell[8]/a[1]/span[1]/mat-icon[1]")).click();
		Thread.sleep(10000);
		for(String childTab1:driver.getWindowHandles())
		{
			driver.switchTo().window(childTab1);
		}
		driver.findElement(By.xpath("/html[1]/body[1]/kt-base[1]/div[1]/div[1]/div[1]/div[1]/div[1]/kt-instruments[1]/kt-intruments-view[1]/div[1]/div[1]/kt-portlet[1]/div[1]/kt-portlet-body[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[2]/button[1]")).click();
		
		driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/kt-swift-upload[1]/form[1]/div[3]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/kt-swift-upload/form/div[3]/button/span")).click();
		   
		//click on ‘Choose file’ to upload the desired file
	
		
		//WebElement inputElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/kt-swift-upload[1]/form[1]/div[3]/button[1]/span[1]"));
		
		
		
		//String uploadFilePath = "C:\\Users\\EEBCS012\\Downloads\\trd_sign_14.jpg";
		//String uploadFilePath2 = "C:\\Users\\EEBCS012\\Downloads\\trd_sign_14.jpg";
		//String uploadFilePath3 = "C:\\Users\\EEBCS012\\Downloads\\trd_sign_14.jpg";
		//inputElement.sendKeys("C:\\Users\\EEBCS012\\Downloads\\trd_sign_14.jpg" + "\n " + "C:\\Users\\EEBCS012\\Downloads\\trd_sign_14.jpg"+ "\n " + "C:\\Users\\EEBCS012\\Downloads\\trd_sign_14.jpg");
		Runtime.getRuntime().exec("C:\\Users\\EEBCS012\\eclipse-workspace\\Autoit\\Multiple1 upload script.exe");
		
		//String file = "C:\\Users\\EEBCS012\\Downloads\\trd_sign_14.jpg";	
		//String file2 = "C:\\Users\\EEBCS012\\Downloads\\trd_sign_14.jpg";
		
		//upload file
		
		//StringSelection Selection = new StringSelection("C:\\Users\\EEBCS012\\Downloads\\trd_sign_14.jpg");
		//StringSelection Selection1 = new StringSelection("C:\\Users\\EEBCS012\\Downloads\\.pdf");
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection1, null);
		///Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_CONTROL);
		//robot.keyPress(KeyEvent.VK_V);
		//robot.keyRelease(KeyEvent.VK_V);
		//robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("File is Uploaded Successfully");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/kt-base[1]/div[1]/div[1]/div[1]/div[1]/div[1]/kt-instruments[1]/kt-intruments-view[1]/div[1]/div[1]/kt-portlet[1]/div[1]/kt-portlet-body[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sales Invoice')]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
		 SwitchTabs();
		/// ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		///driver.switchTo().window(tabs.get(0));
		///driver.close();
		 //driver.switchTo().window(tabs.get(1));
		//String childTab=driver.getWindowHandle();
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		//driver.switchTo().window(childTab);
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Source Of Funds')]")).click();
		SwitchTabs2();
		///driver.switchTo().window(tabs.get(1));
		Thread.sleep(10000);
		
		
        //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
       // driver.switchTo().window(childTab);
        //driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//span[contains(text(),'Proforma Invoice')]")).click();
        SwitchTabs2();
        
     
        driver.findElement(By.xpath("//span[contains(text(),'Tax Invoice')]")).click();
		//SwitchTabs2();
		//driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/kt-tax-invoice[1]/form[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")).click();
        //driver.findElement(By.xpath("//div[contains(text(),'11')]")).click();
        //driver.findElement(By.name("taxInvoicevalue")).sendKeys("123");
        //driver.findElement(By.name("taxInvoiceaccountNumber")).sendKeys("123");
        //driver.findElement(By.xpath("//span[contains(text(),'Download Invoice')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Download')]")).click();
		driver.findElement(By.className("swal2-input")).sendKeys("shamila");
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		SwitchTabs2();
       // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
       // driver.switchTo().window(childTab);
       
      
		
		//driver.switchTo().window(tabs1.get(2));
		//driver.close();
		
		//driver.findElement(By.xpath("//span[contains(text(),'Source Of Funds')]")).click();
		
		//driver.findElement(By.xpath("//span[contains(text(),'Proforma Invoice')]")).click();
       
	
        
		
		
	}
	 public void SwitchTabs() {
 		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
 		driver.switchTo().window(tabs.get(0));
 		driver.close();
 		driver.switchTo().window(tabs.get(1));
 		
 		
 	
 	}
	 
	 
 	
	 public void SwitchTabs2()  {
 		
		 ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	 	 driver.switchTo().window(tabs.get(1));
	 	 driver.close();
	 	 driver.switchTo().window(tabs.get(0));
		 
		 
		 //String childTab = driver.getWindowHandle();
 		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
 		//driver.close();
 		//driver.switchTo().window(ParentWindowHandle);	
		
		
	}
		
//}	
	

		
		//for(int i = driver.getWindowHandles().size()-1 ; i>1 ; --i)
		//{

		//String childTab = driver.getWindowHandles().toArray()[i].toString();
		//driver.switchTo().window(childTab);
		//driver.close();	
		//}
		//driver.findElement(By.xpath("//span[contains(text(),'Tax Invoice')]")).click();
		//driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/kt-tax-invoice[1]/form[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]")).click();
		//driver.findElement(By.xpath("//tbody/tr[5]/td[4]/div[1]")).click();
		//driver.findElement(By.name("taxInvoiceaccountNumber")).sendKeys("petchi");
		//driver.findElement(By.xpath("//span[contains(text(),'Download Invoice')]")).click();
		
		//create instrument BG
		
		//driver.findElement(By.xpath("//span[contains(text(),'Create Instrument')]")).click();
		//Thread.sleep(9000);
		//driver.findElement(By.xpath("//span[contains(text(),'Bank Guarantee(BG)')]")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'prakash prakash')]")).click();
		//driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option[3]/span[1]")).click();
		//driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/div[1]/mat-form-field[1]")).click();
		//driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/mat-option[5]/span[1]")).click();
		//driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/mat-form-field[1]")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'1%app 1 2&app')]")).click();
		//Thread.sleep(2000);
		
		//Not required
		//Actions a= new Actions(driver);
		//a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		//Required
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollTo(0,1500)");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/mat-form-field[1]")).click();
		//driver.findElement(By.name("instrumentAmountAmount")).sendKeys("12000");
		//driver.findElement(By.name("invoiceAmountPercentage")).sendKeys("12");
		//jse.executeScript("window.scrollTo(1500,0)");
		//driver.findElement(By.xpath("//span[contains(text(),'Save Instrument')]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.id("mat-expansion-panel-header-0")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Proforma Invoice')]")).click();
		//driver.close();
		//driver.switchTo().window(ParentWindowHandle);
	
		//Not required
		
		//driver.findElement(By.xpath("//span[contains(text(),'Source Of Funds')]")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Sales Invoice')]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Approve')]")).click();
		

		
	   // closed new window
		//for(int i = driver.getWindowHandles().size() ; i>=1 ; --i)
		//{

	    //String childTab = driver.getWindowHandles().toArray()[i].toString();
	    //driver.switchTo().window(childTab);
	    //driver.close();		
		//driver.findElement(By.xpath("//span[contains(text(),'Tax Invoice')]")).click();
		//driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/kt-tax-invoice[1]/form[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]")).click();
		//driver.findElement(By.xpath("//tbody/tr[5]/td[4]/div[1]")).click();
		//driver.findElement(By.name("taxInvoiceaccountNumber")).sendKeys("petchi");
		//driver.findElement(By.xpath("//span[contains(text(),'Download Invoice')]")).click();
		
		//Not required
		//WebElement chooseFile = driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
		//chooseFile.sendKeys("");
		//driver.findElement(By.xpath("//input[@id='submitbtn']")).click();
		//driver.findElement(By.xpath("//*[@id=\"tr1\"]/td[2]/a")).click();
		
	    //}
	

	//@Test(dependsOnMethods="Login")
	//public void Login1() throws InterruptedException {
		//New tab
		//((JavascriptExecutor)driver).executeScript("window.open('about:blank', '_ blank');");
		//ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		//driver.switchTo().window(tabs.get(0));
		//WebDriver newtab=driver.switchTo().newwindow(WindowType.WINDOW);
		//String childtab=newtab.getWindowHandle();
		//System.out.println("parent tab " +childtab);
		//((JavascriptExecutor) driver).executeScript("window.open('http://gmail.com')");
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("petchi60798@gmail");
		//driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("12345");
		//driver.findElement(By.xpath("//*[@id=\"kt_login\"]/div/div[2]/kt-login/div[2]/div/form/div[3]/div/button")).click();
	
		
		
		
		
		
		//driver.findElement(By.xpath("//body/div[@class='main-container full-height bg-light-gray']/div[@class='main-content']/div[@class='container']/div[@class='content-area']/div[@class='converter-container']/div[@class='converter-wrapper']/div[@class='converter d-xl-flex justify-content-xl-center align-content-xl-start flex-xl-wrap']/div[@class='file-source-button-wrapper file-source-button-resizable']/div[@class='file-source-button']/div[@class='menu-wrapper']/div[@class='dropdown-menu file-source-nav']/label[@class='nav-item from-pc']/i/*[1]")).sendKeys("C:\\Users\\EEBCS012\\Desktop\\Company name.txt");
		//WebElement chooseFile = driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
		//chooseFile.sendKeys("");
		//driver.findElement(By.xpath("//input[@id='submitbtn']")).click();
		//driver.findElement(By.xpath("//*[@id=\"tr1\"]/td[2]/a")).click();
		
		//}
	//@Test(dependsOnMethods="Login1")
	//public void Login2() throws InterruptedException {
		//newtab
		//((JavascriptExecutor)driver).executeScript("window.open('about:blank', '_ blank');");
		
		//ArrayList<String> tabs_list = new ArrayList<>(driver.getWindowHandles());
		//driver.switchTo().window(tabs_list.get(0));
		//Thread.sleep(3000);
		//driver.switchTo().window(tabs_list.get(1));
		//Thread.sleep(3000);
		
	//driver.switchTo().window(tabs_list.get(0));
		//Thread.sleep(3000);
		//Open a new tab using Ctrl + t
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t"); 
		//WebDriver newtab1=driver.switchTo().newwindow(WindowType.WINDOW);
		//String childtab1=newtab1.getWindowHandle();
		//System.out.println("parent tab " +childtab1);
		//newtab1.get("https://test.sso-euroexim.com/login");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//((JavascriptExecutor) driver).executeScript("window.open('http://test.simplextf.com')");
		//driver.findElement(By.xpath("/html[1]/body[1]/kt-auth[1]/div[1]/div[1]/div[2]/kt-login[1]/div[2]/div[1]/form[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("petchi60798@gmail.com");
		//driver.findElement(By.xpath("/html[1]/body[1]/kt-auth[1]/div[1]/div[1]/div[2]/kt-login[1]/div[2]/div[1]/form[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("123459");
		//driver.findElement(By.xpath("//*[@id=\"kt_login\"]/div/div[2]/kt-login/div[2]/div/form/div[3]/div/button")).click();
	
	//}
	//@Test(dependsOnMethods="Login2")
	//public void Login3() {
		//newtab
		//((JavascriptExecutor)driver).executeScript("window.open('about:blank', '_ blank');");
		//ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		//driver.switchTo().window(tabs.get(2));
		//Open a new tab using Ctrl + t
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t"); 
		//WebDriver newtab=driver.switchTo().newWindow(WindowType.WINDOW);
		//String childtab=newtab.getWindowHandle();
		//System.out.println("parent tab " +childtab);
		//newtab.get("https://test.sso-euroexim.com/login");
		//((JavascriptExecutor) driver).executeScript("window.open('http://test.simplextf.com')");
		//driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("petchi60798");
		//driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("123450");
		//driver.findElement(By.xpath("//*[@id=\"kt_login\"]/div/div[2]/kt-login/div[2]/div/form/div[3]/div/button")).click();
	
	//}

}

