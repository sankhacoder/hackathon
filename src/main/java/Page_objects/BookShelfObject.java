package Page_objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base_page.Base_Class;

public class BookShelfObject extends Base_Class {
	static List<String> arr = new ArrayList<String>();
	static Actions a = new Actions(driver);
	static By popup = By.xpath("//div[@id='authentication_popup']/div/div/div[2]/a");
	static By price = By.xpath("//ul[@class='grouplist clearfix']/li[1]/div[1]");
	static By price_slide = By.xpath("//div[@class='noUi-handle noUi-handle-upper']");
	static By storage = By.xpath("//ul[@class='grouplist clearfix']/li[2]/div[1]");
	static By type = By.xpath("//ul[@class='grouplist clearfix']/li[2]/div[2]//ul/li[1]/input");
	static By stock = By.xpath("//div[@class='options availability filter']/div/input");
	static By study = By.xpath("//div[@id='topnav_wrapper']/ul/li[7]/span");
	static By chair = By.xpath("//div[@id='topnav_wrapper']/ul/li[7]/div/div/ul/li[2]/ul/li[1]/a/span");

	public static void popup_close() throws InterruptedException {
		driver.findElement(popup).click();
		Thread.sleep(1000);
	}

	public static void price_hover() throws InterruptedException {
		a.moveToElement(driver.findElement(price)).build().perform();
		Thread.sleep(2000);
	}

	public static void price_slider() throws InterruptedException {
		WebElement e = driver.findElement(price_slide);
		a.moveToElement(e).dragAndDropBy(e, -274, 0).perform();
		Thread.sleep(5000);
	}

	public static void storage_hover() throws InterruptedException {
		a.moveToElement(driver.findElement(storage)).build().perform();
		Thread.sleep(2000);
	}

	public static void select_type() throws InterruptedException {
		driver.findElement(type).click();
		Thread.sleep(5000);
	}

	public static void select_stock() throws InterruptedException {
		driver.findElement(stock).click();
		Thread.sleep(5000);
	}

	public static void product_details() throws InterruptedException {
		for(int i=1;i<4;i++) 
			for(int j=1;j<3;j++)
				arr.add(driver.findElement(By.xpath("//ul[@class='productlist withdivider clearfix bookshelves productgrid']/li["+i+"]/div/div[5]/a/div["+j+"]/span")).getText());
		Thread.sleep(5000);
	}

	public static void print_details() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("List of bookshelves -->");
		System.out.println("=======================");
		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0)
				System.out.print("Name --> " + arr.get(i));
			System.out.print("           ");
			if (i % 2 == 1)
				System.out.println("Price --> " + arr.get(i));
		}
		System.out.println("================================================");
	}

	public static void study_click() throws InterruptedException {
		driver.findElement(study).click();
		Thread.sleep(2000);
	}

	public static void study_chair() throws InterruptedException {
		driver.findElement(chair).click();
		Thread.sleep(2000);
	}

}
