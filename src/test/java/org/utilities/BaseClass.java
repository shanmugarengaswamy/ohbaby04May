package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void tolaunchChrome() {                   //1
		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
	 driver =new ChromeDriver();
	}
	
	public static void tolaunchFirefox() {                  //2
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
	}
	
	public static void tolaunchIE() {                       //3
		WebDriverManager.iedriver().setup();
		driver =new InternetExplorerDriver();
	}
	
	public static void toGetUrl(String url) {               //4
	driver.get(url);
	}
	
	public static String toGetCurrentUrl() {                  //5
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static void toWinMax() {                         //6
		driver.manage().window().maximize();
	}
	
	public static String toPrintTitle() {                     //7
		String title = driver.getTitle();
		return title;
	}
	
	public static void toSendkeys(WebElement webElement,String value) {        //8
		webElement.sendKeys(value);
	}
	
	public static void toClickbtn(WebElement webElement) {                     //9
		webElement.click();
	}
	
	public static void toClose() {                                      //10
		driver.close();
	}
	
	public static void toQuit() {                                       //11
		driver.quit();
	}
	
	public static String toGetText(WebElement webElement) {                       //12
		String text =webElement.getText();
		return text;
	}
	
	public static void toGetAttribute(WebElement webElement,String Value) {    //13
	    System.out.println(webElement.getAttribute("value"));
	}
	
	public static void toMoveToElement(WebElement webElement) {                //14
		Actions s=new Actions(driver);
		s.moveToElement(webElement).perform();
	}
	
	public static void toContextClick(WebElement webElement) {                 //15
			Actions s=new Actions(driver);
			s.contextClick().perform();
	}
	
	public static void toDoubleClick(WebElement webElement) {                  //16
				Actions s=new Actions(driver);
				s.doubleClick().perform();
	}
	
	public static void toKeyPress() throws AWTException {               //17
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void toKeyRelease() throws AWTException {             //18
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	public static void screenshot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File Src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Vijay\\eclipse-workspace\\OhBabyStyleCUBR\\target\\screenshots"+name+".jpg");
		FileUtils.copyFile(Src, des);		
		
	}
	
	public static void excelUpdate() throws IOException {
		File f= new File("C:\\Users\\Vijay\\eclipse-workspace\\frameworksuperthough\\Excel\\Student Details.xlsx");

		 FileInputStream fin = new FileInputStream(f);

		 Workbook w = new XSSFWorkbook(fin);
		 Sheet s = w.getSheet("sheet1");
		 Row cr = s.createRow(1);
		 Cell cc = cr.createCell(1);
		 
		 cc.setCellValue("Success Updated");
		 
		 FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);}
	
	public static String getData(int rowNumber , int cellNumber) throws IOException  {
		
	File f= new File("C:\\Users\\Vijay\\eclipse-workspace\\frameworksuperthough\\Excel\\Student Details.xlsx");

	 FileInputStream fin = new FileInputStream(f);

	 Workbook w = new XSSFWorkbook(fin);

	Sheet s = w.getSheet("sheet1");
	Row row = s.getRow(rowNumber);
	Cell cell = row.getCell(cellNumber);
	int cellType = cell.getCellType();
	
	
	String Value = "";
	if(cellType==1) {
	
		Value = cell.getStringCellValue();

	}else if (cellType==0) {
		if(DateUtil.isCellDateFormatted(cell)) {
			Date d =cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,YYYY");
			 Value =sim.format(d);
		}else {
				double d = cell.getNumericCellValue();
				long l = (long)d;
				 Value = String.valueOf(l);
				 	  
				 
		}}return Value;
		}
	
}
