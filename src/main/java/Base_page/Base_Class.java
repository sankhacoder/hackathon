package Base_page;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Page_objects.BookShelfObject;
import Page_objects.HomePageObject;
import utilities.WriteExcel;
import Page_objects.ChairObject;
import Page_objects.GiftCardObject;

public class Base_Class {
	public static WebDriver driver;
	public static String browser;
	public String[] name = new String[3];
	public String[] price = new String[3];
	
	public static void ss(String a) throws IOException 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\2317648\\eclipse-workspace\\Hackathon\\ScreenShot\\"+browser+"_"+a+".png"));
	}
	
	@Parameters({ "browser", "url" })
	@BeforeClass
	public void DriverSetUp(String br, String url) throws Exception {
		WriteExcel.excelData();
		browser=br;
		Thread.sleep(5000);
		if (br.equals("chrome")) 
		{
			driver = new ChromeDriver();
		} 
		else if (br.equals("edge")) 
		{
			driver = new EdgeDriver();
		} 
		else if (br.equals("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void home() throws InterruptedException, IOException {
		HomePageObject.storage_click();
		ss("home");
		HomePageObject.bookshelves_click();
	}

	@Test(priority = 2)
	public void bookshelf() throws InterruptedException, IOException {
		BookShelfObject.popup_close();
		BookShelfObject.price_hover();
		ss("bookshelf_price");
		BookShelfObject.price_slider();
		BookShelfObject.storage_hover();
		ss("bookshelf_storage");
		BookShelfObject.select_type();
		BookShelfObject.select_stock();
		ss("bookshelf_stock");
		BookShelfObject.product_details();
		Thread.sleep(5000);
		BookShelfObject.print_details();
		ss("bookshelf_products");
		BookShelfObject.study_click();
		ss("bookshelf_chair");
		BookShelfObject.study_chair();
		Thread.sleep(4000);
	}

	
	@Test(priority = 3)
	public void chair() throws InterruptedException, IOException {
		ChairObject.product_details();
		ChairObject.print_details();
		ss("chair_products");
		ChairObject.gift_click();
	}

	@Test(dataProvider = "testInput", priority = 4)
	public void giftcard(String name1, String email1, String phn1, String name2, String email2, String phn2,
			String address, String pin, String msg) throws InterruptedException, IOException {
		GiftCardObject.type_select();
		GiftCardObject.price_click();
		ss("giftcard_price");
		GiftCardObject.next_click();
		GiftCardObject.todata(name1, email1, phn1);
		GiftCardObject.fromdata(name2, email2, phn2, address, pin, msg);
		ss("giftcard_form");
		GiftCardObject.confirm_click();
		ss("giftcard_error");
	}

	@AfterClass
	public void Close() {
		driver.quit();
	}

	@DataProvider(name = "testInput")
	public Object[][] testData() throws Exception {

		File file = new File("ExcelData/testInput.xlsx");

		FileInputStream fIS = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fIS);

		XSSFSheet sheet = wb.getSheetAt(0);

		String arr[][] = new String[2][6];

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 6; j++) {

				arr[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();

			}

		}

		wb.close();

		return new Object[][] { { arr[0][0], arr[0][1], arr[0][2], arr[1][0], arr[1][1], arr[1][2], arr[1][3], arr[1][4], arr[1][5] } };

	}
	
}
