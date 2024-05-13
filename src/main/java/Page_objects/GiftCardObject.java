package Page_objects;

import org.openqa.selenium.By;

import Base_page.Base_Class;

public class GiftCardObject extends Base_Class
{
	static By type = By.xpath("//ul[@class='_2sedU']/li[3]");
	static By price = By.xpath("//div[@class='_3jn98 _23tqD _3k9Vm']/button[3]");
	static By next = By.xpath("//button[@class='_1IFIb _1fVSi action-button _1gIUf _1XfDi']");
	static By toname = By.xpath("//input[@name='recipient_name']");
	static By toemail = By.xpath("//input[@name='recipient_email']");
	static By tomobile = By.xpath("//input[@name='recipient_mobile_number']");
	static By fromname = By.xpath("//input[@name='customer_name']");
	static By fromemail = By.xpath("//input[@name='customer_email']");
	static By frommobile = By.xpath("//input[@name='customer_mobile_number']");
	static By fromaddress = By.xpath("//input[@name='customer_address']");
	static By frompin = By.xpath("//input[@name='zip']");
	static By message = By.xpath("//textarea[@name='message']");
	static By confirm = By.xpath("//button[text() = 'Confirm']");
	
	
	public static void type_select() throws InterruptedException
	{
		driver.findElement(type).click();
		Thread.sleep(3000);
	}
	public static void price_click()
	{
		driver.findElement(price).click();
	}
	public static void next_click() throws InterruptedException
	{
		driver.findElement(next).click();
		Thread.sleep(2000);
	}
	public static void todata(String name1,String email1,String phn1) throws InterruptedException
	{
		driver.findElement(toname).sendKeys(name1);
		driver.findElement(toemail).sendKeys(email1);
		driver.findElement(tomobile).sendKeys(phn1);
	}
	public static void fromdata(String name2,String email2,String phn2,String address,String pin,String msg) throws InterruptedException
	{
		driver.findElement(fromname).sendKeys(name2);
		driver.findElement(fromemail).sendKeys(email2);
		driver.findElement(frommobile).sendKeys(phn2);
		driver.findElement(fromaddress).sendKeys(address);
		driver.findElement(frompin).sendKeys(pin);
		driver.findElement(message).sendKeys(msg);
		Thread.sleep(2000);
	}
	public static void confirm_click() throws InterruptedException
	{
		driver.findElement(confirm).click();
		Thread.sleep(4000);
	}
	
}
