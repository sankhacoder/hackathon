package Page_objects;

import org.openqa.selenium.By;
import Base_page.Base_Class;

public class HomePageObject extends Base_Class
{
	static By storage = By.xpath("//div[@id='topnav_wrapper']/ul/li[6]/span");
	static By bookshelves = By.xpath("//div[@id='topnav_wrapper']/ul/li[6]/div/div/ul/li[1]/ul/li[2]/a/span");
	
	public static void storage_click() throws InterruptedException
	{
		driver.findElement(storage).click();
		Thread.sleep(2000);
	}
	public static void bookshelves_click() throws InterruptedException
	{
		driver.findElement(bookshelves).click();
		Thread.sleep(4000);
	}
}
