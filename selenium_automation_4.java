package com.techweb.helloworld.helloworld;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
// import java.util.Iterator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;//

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium_automation_4 {
	
	//static WebDriver driver = null;
	//static Set<String> allwindows;
	
	public static void main (String [] args) throws InterruptedException,  IOException {
		
		// lecture 12 line 20 - 335 lecture 11 in the java selenium playlist. packeges , arrays , strings , wrapper , classes and exeption . //
		// lecture 13 line 335- 670 lecture 14 packeges , handling , files , collections framework //
		// lecture 14 lines 670 - 685 xpath css selectors examples // 
		// lecture 15-16 lines 670-835 switch between widows , and get information from childern widows //
		// lecturer17 lines 835-900 - waitng mechanizm //
		// lecture 18 lines 900-970 - alaert mechanizm //
		
		
		String browserName="chrome";
		WebDriver driver = null;
		
		if(browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Home\\.eclipse\\eclipse-workplace\\avi_selenium_automation_ex2\\msedgedriver.exe");
			 driver =  new EdgeDriver();	
		}
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\.eclipse\\eclipse-workplace\\avi_selenium_automation_ex2\\chromedriver.exe\\");
			 driver =  new ChromeDriver();		
	}
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\Home\\.eclipse\\eclipse-workplace\\demo-helloworld\\geckodriver.exe");
			 driver =  new FirefoxDriver();		
	}
		
		
		 driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		//   driver.get("https://omayo.blogspot.com");  //
		 
		// driver.get("https://omayo.blogspot.com"); //
		// driver.findElement(By.id("alert1")).click(); //
		// driver.findElement(By.name("q")).sendKeys("arun"); //
		//driver.findElement(By.className("dropbtn")).click(); //
		//driver.findElement(By.linkText("compendiumdev")).click(); //
		// driver.findElement(By.partialLinkText("compendium")).click(); //
		//driver.findElement(By.cssSelector("input[value='Login']")).click();//
		//driver.findElement(By.xpath("//input[@value='Login']")).click(); //
		
		//  driver.findElement(By.id("textbox1"));  //
		
		//   WebElement textfield1 = driver.findElement(By.id("textbox1")); //
		
		// driver.findElement(By.id("textbox1")).clear(); //
		// driver.findElement(By.id("textbox1")).sendKeys("Aron Motoori"); //
		// driver.findElement(By.id("textbox1")).clear(); //
		// driver.findElement(By.id("textbox1")).sendKeys("selenium four"); //
		
	    //	textfield1.clear(); //
		//  textfield1.sendKeys("selenium four"); //
		
		// driver.findElement(By.id("alert1")).click(); //
		
		// driver.findElement(By.id("selenium143")).click(); //
		
		//  driver.findElement(By.id("checkbox2")).click(); //
		
		//  driver.findElement(By.id("radio2")).click(); //
		
		//  driver.findElement(By.id("ta1")).sendKeys("my name is Avi"); //
		
		// driver.findElement(By.cssSelector("#HTML11 > div.widget-content > textarea")).clear(); //
		
		//String text =  driver.findElement(By.id("pah")).getText(); //
		// System.out.println(text); //
		
		//String buttonlabel = driver.findElement(By.name("samename")).getText(); //
		
		// System.out.println(buttonlabel); //
		
		//driver.get("https://the-internet.herokuapp.com/"); //
		
		//String pageTitle =  driver.getTitle(); //
		
		// System.out.println(pageTitle); //
		
		//driver.get("https://omayo.blogspot.com"); //
		
		// String oneurlpage = driver.getCurrentUrl(); //
		// System.out.println(oneurlpage); //
		
		// driver.findElement(By.id("link1")).click(); //
		
		//  String twourlpage = driver.getCurrentUrl();  //
		//  System.out.println(twourlpage); //
		
		//driver.close(); //
		
		// driver = new ChromeDriver(); //
		// driver.manage().window().maximize(); //
		// driver.get("https://omayo.blogspot.com"); //
		
		//  driver.findElement(By.linkText("Open a popup window")).click(); //
		
		
		// if you want that a pause from the code coming undernith //
		//for a spesific amount ao time use the " sleep" command. //
		// Thread.sleep(5000); //
		
		//  driver.close();  //
		
		//  driver.quit();  //
		
		// driver.findElement(By.cssSelector("input[title='search'][value='Search']")).click(); //
		
		//  driver.findElement(By.cssSelector("input[title='search'][type='submit']")).getAccessibleName(); //
		
		//WebElement searchbuttton = driver.findElement(By.cssSelector("input[title='search'][type='submit']")); //
	    // String buttonlabel = driver.findElement(By.cssSelector("input[title='search'][type='submit']")).getAttribute("value"); //
		
		
		// WebElement searchbuttton = driver.findElement(By.cssSelector("input[title='search'][type='submit']")); //
		// String buttonlabel = searchbuttton.getAttribute("value"); //
		// String classvalue = searchbuttton.getAttribute("class"); //
		// String titlevalue= searchbuttton.getAttribute("title"); //
		// String typevalue = searchbuttton.getAttribute("type"); //
		
		// System.out.println(buttonlabel); //
		// System.out.println(classvalue); //
		// System.out.println(titlevalue); //
		// System.out.println(typevalue); //
		
	    //System.out.println(buttonlabel); //
	    //driver.close(); //
	    
		/*
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		*/
		
		// thr isdiplayes command is to see if the button is hidden //
		// boolean buttondisplaystatus = driver.findElement(By.id("but2")).isDisplayed(); //
		
		// if(buttondisplaystatus) { //
			
			// System.out.println("button got displayes on the page"); //
			
		//} //
		
		// else //
		// { //
			
			 // System.out.println("button is not displayed on the page"); //
			
		// } //
		
	  //  boolean buttondisplaystatus = driver.findElement(By.id("button")).isDisplayed();
		
		//if(buttondisplaystatus) {
			
			//System.out.println("button got displayes on the page");
			
	//	}
		
		//else
		//{
			
			//System.out.println("button is not displayed on the page");
			
		//}
		
		//driver.close();
		
		// the button enable is the button to see if a button is working or not
		
		/*
		 boolean buttonenablestatus = driver.findElement(By.id("but2")).isEnabled();
			
			if(buttonenablestatus) {
				
				System.out.println("button got enabled on the page");
				
			}
			
			else
			{
				
				System.out.println("button is noe enabled on the page");
				
			}
			
			driver.close();
			*/
		
		/*
		 boolean buttonenablestatus = driver.findElement(By.id("but1")).isEnabled();
			
			if(buttonenablestatus) {
				
				System.out.println("button got enabled on the page");
				
			}
			
			else
			{
				
				System.out.println("button is noe enabled on the page");
				
			}
			
			driver.close();
		*/
		// selected method is for radio options //
		/*
		 boolean buttonselectedstatus = driver.findElement(By.id("checkbox2")).isSelected();
			
			if(buttonselectedstatus) {
				
				System.out.println("button got selected on the page");
				
			}
			
			else
			{
				
				System.out.println("button is noe selected on the page");
				
			}
			
			driver.close();
		*/
		/*
		 boolean buttonselectedstatus = driver.findElement(By.id("checkbox2")).isSelected();
			
			if(buttonselectedstatus) {
				
				System.out.println("button got selected on the page");
				
			}
			
			else
			{
				
				System.out.println("button is noe selected on the page");
				
			}
			
			driver.close();
		
		*/
		/*
		driver.navigate().to("http://selenium143.blogspot.com/");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		*/
		/*
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		*/
		
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://tutorialsninja.com/demo/"); //
		/*
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("example");
		driver.findElement(By.id("input-password")).sendKeys("example");
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		*/
		/*
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("example");
		driver.findElement(By.id("input-password")).sendKeys("example");
		driver.findElement(By.id("input-password")).submit();
		*/
		
		/*
		 driver = new ChromeDriver(); 
		 driver.manage().window().maximize(); 
		 driver.get("https://omayo.blogspot.com");
		 
		 */
		 /*
		 String tagname =  driver.findElement(By.id("ta1")).getTagName();
		 System.out.println(tagname);
		*/
		 
		 /*
		 String sccvalue = driver.findElement(By.id("blogsmenu")).getCssValue("line-height");
		 System.out.println(sccvalue);
		 */
		 
		 
		 // there is a need to write the letter d , and then declare it as a local veriable
		 /*
		  Dimension d = driver.findElement(By.id("but2")).getSize();
		  System.out.println(d.height);
		  System.out.println(d.width);
		  */
		 
		 // find an element in the web page
		 /*
		  Point p = driver.findElement(By.id("but2")).getLocation();
		  System.out.println(p.x);
		  System.out.println(p.y);
		  */
		 
		 /*
		 
		  Rectangle r = driver.findElement(By.id("but2")).getRect();
		  System.out.println(r.getHeight());
		  System.out.println(r.getWidth());
		  System.out.println(r.getX());
		  System.out.println(r.getY());
		  
		  */
		 
		 
		// driver.manage().window().fullscreen();
		 
		 /*
		 Dimension d = new Dimension(500, 500);
		 driver.manage().window().setSize(d);
		 */
		//  driver.close();
		 
		 /*
		String name =  driver.getClass().getSimpleName();
		System.out.println(name);
		*/
		 
		 //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		
		/*
		 int [] array = new int[3];
		 
		 array[0] = 9;
		 array[1] = 5;
		 array[2] = 3;
		 
		 /*
		 for(int i = 0; i <3; i++) {
		 System.out.println(array[i]);	 
		 }
		 */
		
		
		/*
		 for(int i = 0; i<array.length; i++) {
			 System.out.println(array[i]);
		 }
		 */
		
		
		/*
		int [] [] array = new int [3] [3] ;
		
		array [0][0] = 9;	
		array [0][1] = 8;
		array [0][2] = 7;
		
		array [1][0] = 6;
		array [1][1] = 5;
		array [1][2] = 4;
		 
		array [2][0] = 3;
		array [2][1] = 2;
		array [2][2] = 1;
		 
		for(int i = 0 ; i < array.length; i++) {
			
			for(int j=0; j<array.length; j++) {
				
				System.out.print(array[i][j]);
			
			}
			
			System.out.println();
			
		}
		
		
		*/
		// an object array is an array that contains many types od data.
		/*
		 Object [] array = { 3,3.3,"true",} ;
		
		for(Object v : array) {
			System.out.println(v);
		}
		
		*/
		
		// this is the actual real presentation of the String data type
		//String firstname = new String("Avi");
		
		/*
		String firstname = new String("Avi");
		String lastname = new String(" Michaeli");
		String fullname = firstname.concat(lastname);
		System.out.println(fullname);
		
		*/
		
		/*
		String firstname = new String("Avi");
		String lastname = new String(" Michaeli");
		String fullname = firstname + " " + lastname;
		System.out.println(fullname);
		*/
		
		
		/*
		String onename = new String("Avi");
		String twoname = new String("michaeli");
		String threename = new String("Avi");
		
		System.out.println(onename.equals(threename));
		System.out.println(onename.equals(twoname));
		*/
		
		/*
		int [] array = {9,9,7,7,6,5,4,3,2,1,2,3,4} ;
		String name = new String("Avi");
		System.out.println(array.length);
		System.out.println(name.length());
		*/
		
		/*
		String myname = new String("Avi michaeli");
		System.out.println(myname.substring(4,12));
		*/
		
		/*
		String myname = new String("   Avi michaeli          ");
		System.out.println(myname.trim());
		*/
		
		/*
		String myname = new String("   Avi michaeli          ");
		System.out.println(myname.indexOf("A"));
		System.out.println(myname.indexOf("t"));
		*/
		
		/*
		String str = " my name is avi michaeli";
		String [] words = str.split(" ");
		
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		System.out.println(words[3]);
		System.out.println(words[4]);
		System.out.println(words[5]);
		*/
		
		/*
		
		int number_1 = 5;
		int number_2 ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("write an intger number");
		number_2= scanner.nextInt();
		//System.out.println(number_1/number_2);
		
		try {
			number_1 = number_1/number_2;
		}catch(Throwable e){
			System.out.println("number_2 cant be 0");
		}
		
		*/
		
		//File file1 = new File("C:\\aaaaa filea\\test.txt");
		//File file1 = new File("C:/aaaaa filea/test.txt");
		//File file2 = new File("C:/aaaaa filea/test2.txt");
		
		//System.out.println(file2.exists());
		
		/*
		File folder = new File("folderexample");
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		File file = new File("test3.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		*/
		
		/*
		File file1 = new File("C:\\aaaaa filea\\test.txt");
		File file2 = new File("C:\\aaaaa filea\\test2.txt");
		
		FileWriter fw = new FileWriter("folderexample\\test3.txt");
		fw.write("my name is avi michaeli \n" );
		fw.write("i must find a job");
		fw.flush();
		*/
		/*
		FileReader fr = new FileReader("test3.txt");
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		System.out.println((char)fr.read());
		*/
		
		/*
		FileReader fr = new FileReader("test3.txt");
		int i = fr.read();
		
		while(i!= -1)
		{
			System.out.println((char)i);
			i = fr.read();
		}
		 fr.close();
		 */
		
		/*
		
		FileWriter fw1 = new FileWriter("test3");
		BufferedWriter bw = new BufferedWriter(fw1);
		bw.write("my name is avi michaeli");
		bw.newLine(); // it start anther line // 
		bw.write("i need to find a job");
		
		*/
		
		/*
		FileReader fr = new FileReader("test3.txt");
		BufferedReader br = new BufferedReader(fr);
		*/
		// br.readLine(); //
		//System.out.println(br.readLine());//
		
		/*
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		fr.close();
		br.close();
		
		*/
		
		/*
		PrintWriter pw = new PrintWriter("test3.txt");
		pw.println("my name is avi michaeli");
		pw.println("i need to find a job");
		pw.flush();
		*/
		
		/*
		
		File folder = new File("folderexample");
		if(!folder.exists()) {
			folder.mkdir();
		}
		File file = new File("test3.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		
		FileOutputStream fos = new FileOutputStream("file");
		String lineone = "me name is avi michaeli\n";
		String linetwo = "i need to find a job\n";
		String linethree = "i need to work hard for this\n"; 
		fos.write(lineone.getBytes());
		fos.write(linetwo.getBytes());
		fos.write(linethree.getBytes());
		fos.flush();
		fos.close();
				
		*/
		
		/*
		ArrayList al =  new ArrayList<>();
		al.add(8);
		al.add(11);
		al.add(134);
		
		System.out.println(al.get(0));
		
		for(int i = 0 ; i <3 ; i++) {
			System.out.println(al.get(i));
		}
		
		for(int j = 0 ; j < al.size(); j++) {
			System.out.println(al.get(j));
		}
		*/
		
		/*
	    HashSet hest = new HashSet();
	    
	    hest.add(1);
	    hest.add(2);
	    hest.add(3);
	    hest.add(4);
	    
	    for(int i = 0 ; i <hest.size(); i ++) {
	    	System.out.println(hest);
	    }
	    
		*/
		
		/*
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("avi");
		al.add("michaeli");
		
		Iterator<String> itr = al.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		*/
		
		/*
		HashMap <String , Object> hsap = new HashMap <String , Object>();
		
		hsap.put("name", "Avi");
		hsap.put("Experience", 12);
		hsap.put("Location", "lod");
		hsap.put("country", "israel");
		
		for ( String s :hsap.keySet() ) {
			System.out.println( s + " : " + hsap.get(s));
		}
		
		*/
		
		// absolute xpath , reletive xpath //
		// real time - no , real time - yes //
		// full path      , short - cut path //
		// in selector hub the paragraph needs to be //
		// /html/body/textarea[@class='csi'] //
		// if there is a way to copy the path of all the buttons threw selectors hub // 
		// html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/aside[1]/div[1]/div[9]/div[1]/button[1] //
		//  //button[@id='but2'] 
		// 
		 
		// ( / , // to find elements ,  @ to know which identifyer of an element to choose , [] the elements in the ekement , | , or , to choose multiple elements  //
		// //input[3] to find some element by type  , for example an imput type //
		// // 
		
		/* 
		 
		WebElement login_button =  driver.findElement(By.xpath("//button[@value='LogIn']"));
		String text_on_button = login_button.getText();
		System.out.println(text_on_button);
		driver.close();
		 */
		 
		 /*
		 List<WebElement> options = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
		 for(WebElement e : options)
			 System.out.println(e.getText());
		 */
		/* 
		 List<WebElement> options = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
		 for(WebElement e : options) {
			 System.out.println(e.getText());
		 }
		 
		 */
		 /*
		 List<WebElement> links = driver.findElements(By.xpath("//div[@id='LinkLIst1']//a"));
		 for(WebElement e: links) {
			 e.click();
			 driver.navigate().back();
		 }
		 */
		 
		 /*
		 List<WebElement> links = driver.findElements(By.xpath("//div[@id='LinkLIst1']//a"));
		 int numoflinks = links.size();
		 String path = "(//div[@id='LinkLIst1']//a)";
		 for(int i =1; i<=numoflinks ; i++) {
			 String elementpath = path+"["+i+"]";
			 driver.findElement(By.xpath(elementpath)).click();
			 driver.navigate().back();
		 }
		 */
		 
		 /*
		 List<WebElement> allalinks = driver.findElements(By.xpath("//a"));
		 for(WebElement e: allalinks) {
			 System.out.println(e.getAttribute("href"));
		 }
		 */
		 
		 /*
		 List<WebElement> allalinks = driver.findElements(By.xpath("//a"));
		 for(WebElement e: allalinks) {
			 if(e.getAttribute("href")!=null) {
			 System.out.println(e.getAttribute("href"));
			 }
		 }
		 */
		 
		 /*
		 List<WebElement> allinputlinks = driver.findElements(By.tagName("input"));
		 for(WebElement e: allinputlinks) {
			 System.out.println(e.getAttribute("type"));
			 }
		 */
		 
		 
		 /*
		 
		 driver.findElement(By.linkText("Open a popup window")).click();
		 String textonchildwindow = driver.findElement(By.id("para1")).getText();
		 System.out.println(textonchildwindow);
		 driver.findElement(By.linkText("Blogger")).click();
		 
		 */
		 
		/*
		 driver.get("https://omayo.blogspot.com"); 
		 // parent window //
		 String parentwindow = driver.getWindowHandle();
		 driver.findElement(By.linkText("Open a popup window")).click();
		 driver.findElement(By.linkText("Blogger")).click();
		 // child windows //
		 allwindows = driver.getWindowHandles();
		 switchtotherequiredwindow("Basic Web Page Title");
		 String paraText = driver.findElement(By.id("para1")).getText();
		 System.out.println(paraText);
		 switchtotherequiredwindow("Basic Web Page Title");
		 
		 //Set<String> allWindows = driver.getWindowHandles();
		 //Iterator<String> itr = allWindows.iterator();
		 */
		 
		 /*
		 
		 while (itr.hasNext()) {
			 String win = itr.next();
			 driver.switchTo().window(win);
			 if(driver.getTitle().equals("Basic Web Page Title")) {
				 String paratext = driver.findElement(By.id("para1")).getText();
				 System.out.println(paratext);
				 break;
			 }
		 }
		 
		 */
		 
		 /*
		 
		 Iterator<String> itr2 = allwindows.iterator();
		 while (itr2.hasNext()) {
			 String win = itr2.next();
			 driver.switchTo().window(win);
			 if(driver.getTitle().equals("Blogger.com – יוצרים בלוג יפה וייחודי, בקלות.)")){
				 driver.findElement(By.xpath("//span[text()='sign in']")).click();
				 break;
			 }
			 
		 }
		 */
		 
		 /*
		   
		 driver.switchTo().window(parentwindow);
		 driver.findElement(By.name("q")).sendKeys("Avi michaeli");
		 
		 */
		 
		// driver.switchTo().defaultContent(); //
		//driver.close();//
		 
		 /*
		 
		 driver.findElement(By.id("ta1")).sendKeys("Avi michaeli");
		 
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 driver.manage().window().maximize();
		 driver.get("http://tutorialsninja.com/demo/");
		 driver.findElement(By.name("search")).sendKeys("Avi michaeli");
		 
		 */
		 
		 /* this method will stay a button until you click it
		 driver.findElement(By.className("dropdown")).click();
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		 WebElement gmailoption =  (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Gmail")));
		 gmailoption.click();
		 
		 */
		 
		 // driver.findElement(By.linkText("Gmail"));
		 
		 
		 // selenium will not wait to ajax process , therefore we need special waiting mechanism // 
		 
		
		 /*
		 
		 WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(50)) ;
		 WebElement  gmailOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		 gmailOption.click();

		 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		 //Thread.sleep(10000); // thread that holds the software in order to open undersurfice software //
		 
		 driver.findElement(By.linkText("Gmail")).click();
		 
		 */
		 /* creating a wating mechanizm 
		 driver.get("https://verifalia.com/validate-email");
		 driver.findElement(By.name("inputData")).sendKeys("avi");
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 WebElement validatebutton = wait.until(ExpectedConditions.elementToBeClickable(By.className("btn btn-lg btn-primary")));
		 validatebutton.click();
		 */
		// driver.findElement(By.xpath("//button[text()='validate']")).click();
		 
		 /*
		  this method is used when there is a pop up window
		driver.findElement(By.id("alert1")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String textonalert =alert.getText();
		System.out.println(textonalert);
		alert.accept(); // this command presses the button " ok " on the screen //
		*/
		 
		 //  driver.findElement(By.linkText("https://the-internet.herokuapp.com/dynamic_loading/1")).click();//
		 
		 /*
		 
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.findElement(By.linkText("Dynamic Loading")).click();
		 driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement pageheading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));
		String pageofheadingtext = pageheading.getText();
		System.out.println(pageofheadingtext);
		
		String textonpage =  driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
		System.out.println(textonpage);
		*/
		 
		 /* writing the alert commands
		 
		 driver.findElement(By.id("alert1")).click();
		 Alert alert =  driver.switchTo().alert();
		 String textonalert =  alert.getText();
		 System.out.println(textonalert);
		 alert.accept(); // accepting and press " ok " on the button //
		 alert.dismiss(); // not accepting the and not pressing the " ok " button //
		 driver.findElement(By.id("ta1")).sendKeys("Avi Michaeli"); 
		
		*/
		
		 /* waiting mechanizm
		 driver.findElement(By.id("alert1")).click();
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.alertIsPresent());
		 Alert alert =  driver.switchTo().alert();
		 String textonalert =  alert.getText();
		 System.out.println(textonalert);
		 alert.accept(); // accepting and press " ok " on the button //
		 alert.dismiss(); // not accepting the and not pressing the " ok " button //
		 driver.findElement(By.id("ta1")).sendKeys("Avi Michaeli"); 
		*/
		 
		 
		 /*
		  an alert mechanizm
		 driver.findElement(By.id("confirm")).click();
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.alertIsPresent());
		 Alert alert = driver.switchTo().alert();
		 String textonalert = alert.getText();
		 System.out.println(textonalert);
		 alert.accept();
		 */
		 
		 
		 /*
		  alert mechnizm
		  
		  driver.get("https://the-internet.herokuapp.com/");
		  driver.findElement(By.linkText("JavaScript Alerts")).click();
		  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.alertIsPresent());
		  Alert alert = driver.switchTo().alert();
		  alert.sendKeys("Avi michaeli");
		  alert.accept();
		  String alerttext = alert.getText();
		  System.out.println(alerttext);
		  
		  */
		 
		 /* 
		  // how to make a notes from an alert //
		// driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 driver.get("https://www.justdial.com/"); 
		 */
		 
		 /*
		 
		 driver.get("http://tutorialsninja.com/demo/");
		 driver.findElement(By.name("search")).sendKeys("hp");
		 driver.findElement(By.xpath("//span[@class='input-group-btn']/button")).click();
		 driver.findElement(By.linkText("HP LP3065")).click();
		  
		 */
		 
		// driver.get("https://omayo.blogspot.com"); //
		 
		 /*
		  * selecting options
		 WebElement dropdownfield = driver.findElement(By.id("drop1"));
		 Select select = new Select(dropdownfield);
		 select.selectByVisibleText("doc 3");
		 select.selectByIndex(1);
		 select.selectByValue("ghi");
		 */
		 
		 /*
		    selectfew options from group of options 
		 WebElement dropdownfield = driver.findElement(By.id("drop1"));
		 Select select = new Select(dropdownfield);
		 List<WebElement> options = select.getOptions();
		 for(WebElement option : options) {
			 System.out.println(option.getText());

		 }
		 */
		 
		 /*
		 WebElement multiselection = driver.findElement(By.id("multiselect1"));
		 Select select = new Select(multiselection);
		 select.selectByVisibleText("Volvo");
		 select.selectByIndex(3);
		 select.selectByValue("Hyundaix");
		 
		 select.deselectByVisibleText("Volvo");
		 
		 select.deselectAll();
		 */
		 
		 /*
		 /* 
		  check if a list is multiple parameters
		 WebElement multiselection = driver.findElement(By.id("multiselect1"));
		 Select select = new Select(multiselection);
		 System.out.println(select.isMultiple());
		
		 */
		 
		 /*
		 WebElement multiselection = driver.findElement(By.id("multiselect1"));
		 Select select = new Select(multiselection);
		 */
		 
		 /*
		 By fruits = By.id("fruits");
		 By languages = By.id("lang");
		 */
		 
		 //   driver.get("https://omayo.blogspot.com");  //
		//   //driver.get("https://www.google.com/");  //
		 		
        /*
           lecture 16 - function to find multiple elements
 	 	// if you have a parent window and child windows // 
 	 
 	 	 
 	 	 
		public static void switchtotherequiredwindow(String title) {
			Iterator<String> itr = allwindows.iterator();
			while (itr.hasNext()) {
				 String win = itr.next();
				 driver.switchTo().window(win);
				 if(driver.getTitle().equals("Basic Web Page Title")) {
					 String paratext = driver.findElement(By.id("para1")).getText();
					 System.out.println(paratext);
					 break;
					 
					 }
					 }
					 }
	    */
	
		
	}
}
	
	
	
	
	

			
	

