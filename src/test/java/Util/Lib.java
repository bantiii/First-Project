package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;

public class Lib {
	public static Scenario scenario;
	public static WebDriver driver;

	// to get the title of the page
	public String allpagetitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;

	}

	// to find and click the element we want
	public static WebElement Findelement(WebDriver driver, String xpath) {
		WebElement ele1 = driver.findElement(By.xpath(xpath));

		return ele1;
	}

	// To read any file from any folder and supply to our Framework
	public static String readproperties(WebDriver driver2, String key)
			throws IOException {
		File fl = new File(
				"C:\\Users\\bantt\\BootCamp_2018\\src\\test\\Resources\\ObjectRepository\\Locator.properties");
		FileInputStream fis = new FileInputStream(fl);
		Properties prop = new Properties();
		prop.load(fis);
		String locatr = prop.getProperty(key);
		return locatr;

	}

	// To take a screen shot and save it
	public static void takescreenshot(Scenario scenario) throws IOException {
		 scenario.write("Finished scenario");
	        if (scenario.isFailed()) {
	        	scenario.write(" Scenario Failed");
	         scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
	        }else{
	        	scenario.write("Scenario Passed");
	        }
	        	
	}

	// public static void Capture(String ScrennHotName) {
	// try {
	// File fileOut =
	// ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// FileUtils.copyFile(fileOut, new
	// File("C:\\Users\\bantt\\BootCamp_2018\\target"+ScrennHotName+".png"));
	//
	// } catch (Exception ex) {
	// System.out.println("Failed test case ScreenShot Taken"
	// + ex.getMessage());
	// }
	// }

	// // Embedding failed test cases and take a screenshot
	// public void killBrowser(Scenario scenario){
	// if (scenario.isFailed()) {
	// scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),
	// "image/png");
	// }
	// // driver.close();
	// // driver.quit();
	// }

	// To read Excel and supply to our framework
	public static String readexcel(WebDriver driver, int column, int rownum)
			throws IOException {

		File fl = new File(
				"C:\\Users\\SamiaHP\\eclipse-workspace\\BootCampBDD\\Data_Maven_FB.xlsx");
		FileInputStream fis = new FileInputStream(fl);
		XSSFWorkbook wk = new XSSFWorkbook(fis);

		XSSFSheet sh = wk.getSheetAt(0);
		XSSFRow rw = sh.getRow(rownum);
		XSSFCell cl = rw.getCell(column);
		String value = cl.getStringCellValue();
		wk.close();

		return value;
	}

	// To mouse hover and see the drop down list in that particular Drop down
	// list
	public void MouseOver(WebElement we) {
		Select selObj = new Select(we);
		selObj.selectByIndex(4);
	}

	// to print the calendar we want
	public static String printtime(WebDriver driver) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(cal.getTime());

	}

	// to read the Excel
	public static String readexcel1(WebDriver driver, int column, int rownum)
			throws IOException {

		File fl = new File(
				"C:\\Users\\SamiaHP\\eclipse-workspace\\BootCampBDD\\Data_Maven_FB.xlsx");
		FileInputStream fis = new FileInputStream(fl);
		XSSFWorkbook wk = new XSSFWorkbook(fis);

		XSSFSheet sh = wk.getSheetAt(0);
		XSSFRow rw = sh.getRow(rownum);
		XSSFCell cl = rw.getCell(column);
		String value = cl.getStringCellValue();
		wk.close();

		return value;
	}

	public void Valueturn() {
		Actions action = new Actions(driver);
		WebElement elementOne = driver.findElement(By
				.id("put the value of the id"));
		action.moveToElement(elementOne).build().perform();
	}

	// WE Use Actions class to to do Mouse Hover
	public void MouseOver(WebElement we, WebDriver driver) {
		Actions actObj = new Actions(driver);
		// Use last line in GUIstep
		actObj.moveToElement(we).build().perform();

	}

	public void indexSelect(WebElement WE, int IndexValue) {
		Select selObj = new Select(WE);
		selObj.selectByIndex(IndexValue);

	}

	public static String readProperties(String key) throws IOException {
		File fl = new File(
				"C:\\Users\\bantt\\eclipse-workspace\\BootCamp_2018\\src\\test\\Resources\\ObjectRepository\\Locator.properties");
		FileInputStream fis = new FileInputStream(fl);
		Properties prop = new Properties();
		prop.load(fis);
		String locatr = prop.getProperty(key);
		return locatr;

	}

	public void DataBaseConnection() throws SQLException {
		Connection Con = DriverManager.getConnection("URL, UserName, Password");
		Statement Stat = Con.createStatement();
		ResultSet res = Stat.executeQuery("Select * From Employee");
		while (res.next()) {
			System.out.println("Data will be retrived here");

		}
	}

	// getting data from excel and writing data in to excel

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	File fileName = new File("C:\\Users\\satekuma\\Pro\\Fund.xlsx");

	public void setExcelFile(File Path, String SheetName) throws Exception {

		FileInputStream ExcelFile = new FileInputStream(Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);

	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			return CellData;
		} catch (Exception e) {

			return "";

		}

	}

	public static void setCellData(String Result, int RowNum, int ColNum,
			File Path) throws Exception {

		try {
			Row = ExcelWSheet.createRow(RowNum - 1);
			Cell = Row.createCell(ColNum - 1);
			Cell.setCellValue(Result);
			FileOutputStream fileOut = new FileOutputStream(Path);
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {

			throw (e);

		}

	}

}
