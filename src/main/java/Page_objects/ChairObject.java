package Page_objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import Base_page.Base_Class;

public class ChairObject extends Base_Class
{
	static List<String> arr = new ArrayList<String>();
	static By gift_card = By.xpath("//ul[@class='featuredLinksBar__linkContainer']/li[3]/a");
	
	
	public static void product_details() throws InterruptedException
	{
		for(int i=1;i<4;i++) 
		for(int j=1;j<3;j++)
		arr.add(driver.findElement(By.xpath("//ul[@class='productlist withdivider clearfix study_chairs productgrid']/li["+i+"]/div/div[5]/a/div["+j+"]/span")).getText());
		Thread.sleep(2000);
	}
	public static void print_details() throws InterruptedException
	{
		System.out.println("List of study chairs -->");
		System.out.println("=======================");
		for(int i=0;i<6;i++)
		{
			if(i%2==0)
			System.out.print("Name --> "+arr.get(i));
			System.out.print("           ");
			if(i%2==1)
			System.out.println("Price --> "+arr.get(i));
		}
		System.out.println("================================================");
	}
	public static void gift_click() throws InterruptedException
	{
		driver.findElement(gift_card).click();
		Thread.sleep(3000);
	}

}
